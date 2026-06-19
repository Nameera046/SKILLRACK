Row Increment - Last Element Unit Digit

The program must accept an integer matrix of size R*C as input. 
Then the elements in a given row must be incremented by the value of the unit digit of the last element in that specific row. 
Finally the program must print the revised matrix values.

Boundary Condition(s)
1 <= R, C <= 100

Input Format:
The first line contains the value of R and C separated by space(s).
The next R lines contain C integers separated by space.
Output Format:
R lines each containing C integers modified as per the given conditions.

Example Input/Output 1:
Input:
3 4
10 12 13 15
23 88 12 42
99 89 79 11
Output:
15 17 18 20
25 90 14 44
100 90 80 12

-----------------------CODE--------------------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] mat=new int[m][n];
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        mat[i][j]=sc.nextInt();
		    }
		}
		for(int i=0;i<m;i++)
		{
		    int sum=(mat[i][n-1])%10;
		    for(int j=0;j<n;j++)
		    {
		        mat[i][j]=mat[i][j]+sum;
		    }
		}
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(mat[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}

-----Time Complexity : O(mn)
-----Space Complexity : O(mn)
