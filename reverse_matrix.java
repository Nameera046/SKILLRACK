Reverse Odd Rows Matrix

Given a matrix M of size N*N, the program must reverse the order of odd rows and print it.

Input Format:
The first line contains the value of N.
The next N lines contain N elements each separated by space.
Output Format:
The first N lines contain the matrix with odd rows reversed.
Boundary Condition:
2 <= N <= 50
  
Example Input/Output 1:
Input:
3
1 2 3
4 5 6
7 8 9
Output:
3 2 1
4 5 6
9 8 7

Example Input/Output 2:
Input:
2
10 20
40 50
Output:
20 10
40 50

------CODE---------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] mat=new int[n][n];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        mat[i][j]=sc.nextInt();
		    }
		}
		for(int i=0;i<n;i++)
		{
		    if(i%2==0)
		    {
		        for(int j=n-1;j>=0;j--)
		        {
		            System.out.print(mat[i][j]+" ");
		        }
		    }
		    else
		    {
		        for(int j=0;j<n;j++)
		        {
		            System.out.print(mat[i][j]+" ");
		        }
		    }
		    System.out.println();
		}
	}
}

--Time Complexity : O(n^2)
--Space Complexity : O(n^2)
