Largest Integer in Each Column

Given a matrix M of size R*C, the program must print the largest integer in each column.

Boundary Condition(s):
2 < R, C < 50

Input Format:
The first line contains R and C separated by space.
The next R lines contain C values each separated by space.
Output Format:
The first line contains the largest integer in each column separated by space.

Example Input/Output 1:
Input:
3 3
1 8 3
4 6 5
7 2 9
Output:
7 8 9

Example Input/Output 2:
Input:
2 3
23 34 45
45 65 12
Output:
45 65 45

  
----------CODE---------

  
import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
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
      		for(int i=0;i<c;i++)
      		{
      		    int max=Integer.MIN_VALUE;
      		    for(int j=0;j<r;j++)
      		    {
      		        if(mat[j][i]>max)
      		        {
      		            max=mat[j][i];
      		        }
      		    }
      		    System.out.print(max+" ");
          }
	   }
}

---Time Complexity : O(n^2)
---Space Complexity : O(n^2)
