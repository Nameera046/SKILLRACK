Matrix Sum of Edge Elements

The input elements of R*C matrix is passed as the input (R is the number of rows and C is the number of columns in the matrix. 
The program must print the sum S of the elements along the edge of the matrix.

Input Format:
The first line contains R and C separated by a space..
Next R lines contain C values each, with the values separated by a space.
Output Format:
The first line contains S.

Boundary Conditions:
2 R, C 100 1 <= Matrix Cell Value <= 1000

Example Input/Output 1:
Input:
5 3
1 2 3
4 5 6
7 8 9
5 5 5
2 2 2
Output:
48

Example Input/Output 2:
Input:
3 3
100 200 300
400 500 600
700 800 900
Output:
4000

-------CODE---------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt(),c=sc.nextInt();
		int[][] mat=new int[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        mat[i][j]=sc.nextInt();
		    }
		}
		int sum=0;
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        if(i==0 || i==r-1 || j==0||j==c-1)
		        {
		            sum+=mat[i][j];
		        }
		    }
		}
		System.out.println(sum);
	}
}

--Time Complexity : O(n^2)
--Space Complexity : O(n^2)
