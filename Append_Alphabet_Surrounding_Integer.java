Append Alphabet Surrounding Integers

The program must accept a matrix of size R*C containing integers and alphabets as the input.
For each occurrence of the alphabet in the matrix, the program must append the alphabet to the surrounding integers of the alphabet.
Then the program must print the revised matrix as the output.
Note: In the given matrix, there are no common integers around two or more alphabets.

Boundary Condition(s):
2 R, C 50
1 <= Each integer value in the matrix < 1000

Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C elements of the matrix separated by a space.
Output Format:
The first R lines contain the revised matrix.

Example Input/Output 1:
Input:
4 5
5 2 2 2 4
7 5 2 3 b
8 a 5 5 9
9 3 8 5 6
Output:
5 2 2 2b 4b
7a 5a 2a 3b b
8a a 5a 5b 9b
9a 3a 8a 5 6
Explanation:
Here R-4 and C-5.
The alphabets in the given matrix are highlighted below
5 2 2 2 4
7 5 2 3 b
8 a 5 5 9
9 3 8 5 6
After modifying the matrix based on the given conditions, the matrix becomes
5 2 2 2b 4b
7a 5a 2a 3b b
8a a 5a 5b 9b
9a 3a 8a 5 6

Example Input/Output 2:
Input:
5 5
86 77 45 57 82
13 A 10 86 70
32 74 72 27 C
28 79 12 43 90
15 B 13 15 37
Output:
86A 77A 45A 57 82
13A A 10A 86C 70C
32A 74A 72A 27C C
15B B 13B 15 37
28B 798 12B 43C 90C

-------CODE--------

package Skillrack;
import java.util.*;
public class Append_Alphabets_Surrounding_Integers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		sc.nextLine();
		String[][] mat=new String[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j]=sc.next();
			}
		}
		int[] dx= {-1,-1,-1,0,0,1,1,1};
		int[] dy= {-1,0,1,-1,1,-1,0,1};
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				for(int k=0;k<8;k++)
				{
					int ni=i+dx[k];
					int nj=j+dy[k];
					if(ni>=0 && ni<r && nj>=0 && nj<c)
					{
						if(!Character.isDigit(mat[ni][nj].charAt(0)))
						{
							mat[i][j]+=mat[ni][nj];
						}
					}
				}
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}

Time complexity: O(r * c)
Space complexity: O(r * c * s), where s is the average length of the strings after concatenation.
