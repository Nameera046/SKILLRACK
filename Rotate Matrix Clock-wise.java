Rotate Matrix Clock-wise

An integer matrix of size N*N is given as the input. The program must rotate the matrix in the clockwise direction and print the rotated matrix as the output.

Boundary Condition(s):
2 <= N <= 50

Input Format:
The first line contains the value of N.
The next N lines contain N integers each separated by space.
Output Format:
The first N lines contain N integers each separated by space.

Example Input/Output 1:
Input:
5
1 2 3 4 5
6 7 8 9 10
23 45 67 89 45
12 23 45 67 78
11 12 13 14 15
Output:
11 12 23 6 1
12 23 45 7 2
13 45 67 8 3
14 67 89 9 4
15 78 45 10 5

Example Input/Output 2:
Input:
7
11 12 13 14 15 16 67
12 23 34 45 56 67 45
23 34 45 56 67 78 45
34 45 56 67 78 89 65
45 56 67
78 89 90 12
12 23 34 45 56 76 34
23 34 45 56 67 89 45
Output:
23 12 45 34 23 12 11
34 23 56 45 34 23 12
45 34 67 56 45 34 13
56 45 78 67 56 45 14
67 56 89 78 67 56 15
89 76 90 89 78 67 16
45 34 12 65 45 45 67

------------------------CODE-------------------------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
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
    		int[][] res=new int[n][n];
    		for(int i=0,j=n-1;i<n && j>=0; i++;j--)
    		{
    		    for(int a=0,b=0;a<n && b<n;a++,b++)
    		    {
    		        res[a][j]=mat[i][b];
    		    }
    		}
    		for(int i=0;i<n;i++)
    		{
    		    for(int j=0;j<n;j++)
    		    {
    		        System.out.print(res[i][j]+" ");
    		    }
    		    System.out.println();
    		}
  	}
}

---Time Complexity : O(n^2)
---Space Complexity : O(n^2)
