Triangle Layer Sum

A matrix having (N+1)/2 rows and N columns (where N is odd) is passed as the input. 
A triangle with non-zero values is present in the middle of the matrix.
The program must print the sum of the values in the boundary of the triangle.

Boundary Condition(s): 5<= N <= 49
Input Format:
The first line contains N.
The next (N+1)/2 lines, each contains N integer values separated by a space.
Output Format:
The first line contains the sum of integer values in the boundary of the triangle.
  
Example Input/Output 1:
Input:
5
0 0 1 0 0 
0 6 5 2 0 
3 5 4 9 8
Output: 
38
Explanation:
The integer values along the boundary are 1, 2, 8, 9, 4, 5, 3 and 6.
Their sum is 38, which is printed as the output.

Example Input/Output 2:
Input:
7 
0 0 0 3 0 0 0 
0 0 9 4 8 0 0 
0 8 6 7 9 5 0 
1 4 4 8 5 7 1
Output: 
63

CODE: 

package Skillrack;
import java.util.*;
public class triangle_layer_sum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] mat=new int[n][n];
		for(int i=0;i<=n/2;i++)
		{
			for(int j=0;j<n;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		int j=n/2-1,k=n/2+1,i=1,sum=0;
		sum+=mat[0][n/2];
		while(i<n/2)
		{
			sum+=mat[i][j--];
			sum+=mat[i][k++];
			i++;
		}
		for(int a=0;a<n;a++)
		{
			sum+=mat[i][a];
		}
		System.out.print(sum);
	}
}

//Time complexity: O(n^2)
//Space complexity: O(n^2)
