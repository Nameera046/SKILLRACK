2x2 Sub Matrix with Sum

A matrix of size R*C and an integer S are passed as the input to the program. The program must print the 2*2 submatrix whose sum is S.
If more than one such submatrices exist, print the first occurring submatrix (when traversed from top to bottom in the matrix and from 
left to right in each row).

Boundary Condition(s):
2 < R, C <= 100

Input Format:
The first line contains the value of R and C separated by space(s).
The next R lines contain C integers separated by space(s).
Output Format:
The first two lines contain the submatrix.

Example Input/Output 1:
Input:
3 3
23 12 45
25 26 29
33 35 36
119
Output:
25 26
33 35

Example Input/Output 2:
Input:
4 3
48 10 77
4 99 15
75 29 97
40 84 62
272
Output:
29 97
84 62

--------------------------CODE--------------------------

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
		int target=sc.nextInt();
		int flag=0;
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        int sum=0;
		        if(i+1<m && j+1<n )
		        {
		            for(int a=i;a<i+2;a++)
		            {
		                for(int b=j;b<j+2;b++)
		                {
		                    sum+=mat[a][b];
		                }
		            }
		            if(sum==target)
		            {
		                for(int a=i;a<i+2;a++)
		                {
		                    for(int b=j;b<j+2;b++)
		                    {
		                        flag=1;
		                        System.out.print(mat[a][b]+" ");
		                    }
		                    System.out.println();
		                }
		            }
		            if(flag==1)
		            {
		                break;
		            }
		        }
		    }
		    if(flag==1)
		    {
		        break;
		    }
		}
	}
}

---Time Complexity : O(m*n)
---Space Complexity : O(m*n)
