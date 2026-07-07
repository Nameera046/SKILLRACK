Symmetric or Not

The program must accept a binary matrix of size RxC as input. 
The program must print H if the matrix is horizontally symmetric, V if the matrix is vertically symmetric or S 
if the matrix is symmetric (both horizontally and vertically). Else the program must print -1 as the output.

Boundary Condition(s):
3R, C 30

Input Format:
The first line contains the value of R and C separated by a space.
The next R lines contain C elements of the binary matrix separated by space(s).
Output Format:
The first line contains either 'H' or 'V' or 'S' or '-1'.

Example Input/Output 1:
Input:
3 3 
  1 0 1 
  0 1 0 
  1 0 1
Output: S
Explanation:
In the given binary matrix, first row is equal to the last row and the second row is equal to the second last row(middle row). Similarly, first column is equal to the third column and the second column is equal to the second last column(middle column). Hence, S is printed.

Example Input/Output 2:
Input:
4 4 
  1 0 1 0
  0 1 0 1
  1 0 1 0
  0 1 0 1
Output:
-1
Explanation:
In the binary matrix, first row is not equal to the last row and the second row is not equal to the second last row. Similarly, first column is not equal to the last column and the second column is not equal to the second last column. Hence, -1 is printed.

Example Input/Output 3:
Input:
4 4 
  1 0 0 1 
  0 0 0 0 
  1 1 1 1 
  1 1 1 1 
Output: V
Explanation:
In the given binary matrix, first column is equal to the last column and the second column is equal to the second last column. Hence, V is printed.

Example Input/Output 4:
Input:
4 4 
  1 0 1 0 
  0 0 1 1 
  0 0 1 1 
  1 0 1 0
Output: H
Explanation:
In the given binary matrix, first row is equal to the last row and the second row is equal to the second last row. Hence, H is printed.

-----------------------CODE----------------------------

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
		int rowmid=m/2;
		int colmid=n/2;
		boolean horizontal=true;
		boolean vertical=true;
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<colmid;j++)
		    {
		        if(mat[i][j]!=mat[i][n-1-j])
		        {
		            vertical=false;
		            break;
		        }
		    }
		    if(!vertical)
		    {
		        break;
		    }
		}
		for(int i=0;i<rowmid;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(mat[i][j]!=mat[m-1-i][j])
		        {
		            horizontal=false;
		            break;
		        }
		    }
		    if(!horizontal)
		    {
		        break;
		    }
		}
		if(horizontal && vertical)
		{
		    System.out.print("S");
		}
		else if(horizontal)
		{
		    System.out.print("H");
		}
		else if(vertical)
		{
		    System.out.print("V");
		}
		else
		{
		    System.out.print("-1");
		}
	}
}

---Time Complexity : O(m*n)
---Space Complexity : O(m*n)
