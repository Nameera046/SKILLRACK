Submatrix Form and Sort Integers

The program must accept a matrix of size R*C containing only digits as the input. 
The values of R and C are always divisible by 3. For each 3*3 submatrix in the given matrix, 
the program must form 8 integers by concatenating the digits as given below.

Row wise(3 integers - left to right)
Column wise(3 integers top to bottom)
Diagonal wise (2 integers - top-left to bottom-right and top-right to bottom-left)
Finally, the program must print all the integers obtained in sorted order as the output.

Boundary Condition(s):
3R, C48 0 Matrix element value <= 9

Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C integers separated by a space.

Output Format:
The first line contains ((R/3)*(C/3))*8 integers separated by a space.

Example Input/Output 1:
Input:
3 6 
1 2 3 1 4 5
4 5 6 7 2 6
7 8 9 8 9 3
Output:
123 123 145 147 159 178 258 357 369 429 456 528 563 726 789 893
Explanation:
The 8 integers from the first 3*3 submatrix are given below.
123, 456, 789, 147, 258, 369, 159 and 357.
The 8 integers from the second 3*3 submatrix
are given below.
145, 726, 893, 178, 429, 563, 123 and 528.
So the resulting 16 integers are printed in sorted order.

Example Input/Output 2:
Input:
66 
1 2 8 7 0 3 
0 7 0 3 9 3 
3 1 5 6 7 1
0 4 0 8 7 9
2 9 5 6 4 0
9 6 7 4 7 4
Output:
29 40 57 70 97 97 99 103 128 175 271 295 315 331 393 396 474 496 640 671 703 736 747 791
805 844 864 873 879 904 944 967

CODE:

package Skillrack;
import java.util.*;
public class SubMatrix_From_and_Sort_Integer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt(),C=sc.nextInt();
		int[][] mat=new int[R][C];
		for(int i=0;i<R;i++)
		{
			for(int j=0;j<C;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<R;i+=3)
		{
			for(int j=0;j<C;j+=3)
			{
				for(int r=0;r<3;r++)
				{
					int num=0;
					for(int c=0;c<3;c++)
					{
						num=num*10+mat[i+r][j+c];
					}
					al.add(num);
				}
				
				for(int c=0;c<3;c++)
				{
					int num=0;
					for(int r=0;r<3;r++)
					{
						num=num*10+mat[i+r][j+c];
					}
					al.add(num);
				}
				 int d1=mat[i][j]*100+mat[i+1][j+1]*10+mat[i+2][j+2];
				 int d2=mat[i][j+2]*100+mat[i+1][j+1]*10+mat[i+2][j];
				 al.add(d1);
				 al.add(d2);
			}
		}
		Collections.sort(al);
		for(int num:al)
		{
			System.out.print(num+" ");
		}
	}

}

//- Time Complexity :  O(R*C*log(R*C)) -> (R*C)--N -> O(N*log(N))
//- Space Complexity : O(R*C) -> O(N)
