Consecutive 1's Count

The program must accept a matrix of size RxC as input. The program must print the count of consecutive 1's column-wise as the output.

Boundary Condition(s):
1 <= R, C <= 100

Input Format:
The first line contains the value of R and C.
The next R lines contain C integers (O's and 1's) separated by space.
Output Format:
The first line contains the count of consecutive 1's column-wise.

Example Input/Output 1:
Input:
5 4
1 0 1 1 
1 0 0 1 
0 1 1 1 
1 0 0 0 
1 1 1 1
Output: 
3
Explanation:
In the first column, there are two consecutive 1's.
In the last column, there is one consecutive 1's.
Hence the output is 3.

Example Input/Output 2:
Input:
5 6
0 0 1 1 0 1 
0 0 1 0 0 1 
0 1 1 1 0 0 
0 1 0 0 1 1 
0 0 0 0 0 1
Output:  
4

---------------------------CODE---------------------------------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
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
    		int fcount=0;
    		for(int i=0;i<n;i++)
    		{
    		    for(int j=0;j<m;)
    		    {
    		        if(mat[j][i]==1)
    		        {
    		            int flag=1,count=0;
    		            while(j<m && mat[j][i]==1 && flag==1)
    		            {
    		                count++;
    		                j++;
    		            }
    		            if(count>1)
    		            {
    		                fcount++;
    		            }
    		        }
    		        else
    		        {
    		            j++;
    		        }
    		    }
    		}
	    	System.out.print(fcount);
  	}
}

----Time Complexity : O(mn)
----Space Complexity : O(mn)
