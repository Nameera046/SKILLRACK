Matrix Replace Asterisks in Columns

The program must accept a matrix of size R C as the input. 
The given matrix contains integers and asterisks. 
The number of integers in the matrix is always a multiple of R. 
The asterisks represent the empty spaces in the matrix. 
The program must rearrange the integers in the matrix so that all integers occur on the left side and all the asterisks occur on the right side of the matrix. 
The integers from the columns on the right(top to bottom starting from the last column) must be swapped with the asterisks on the left(top to bottom starting from the first column) of the matrix. 
Finally, the program must print the revised matrix as the output.

Boundary Condition(s):
2>=R, C<=50
1 Each integer value in matrix = 10^5

Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C values separated by a space.
Output Format:
The first R lines contains the revised matrix.

Example Input/Output 1:
Input:
4 4
11 * * 16
* 39 75 12
* 69 18 *
* 79 * *

Output:
11 18 * * 
16 39 * * 
12 69 * * 
75 79 * *

Explanation:
Here R4 and C = 4.
The number of integers in the matrix is 8, which is a multiple of 4.
After rearranging the matrix based on the given conditions, the matrix becomes
11 18 * * 
16 39 * * 
12 69 * * 
75 79 * *

//------CODE-------

package Skillrack;
import java.util.*;
public class Matrix_replace_Asterisks_in_Column {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		String[][] mat=new String[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j]=sc.next();
			}
		}
		for(int j=0;j<c;j++)
		{
		    for(int i=0;i<r;i++)
		    {
		        int flag=0;
		        if(mat[i][j].equals("*"))
		        {
		            for(int n=c-1;n>j;n--)
		            {
		                for(int m=0;m<r;m++)
		                {
		                    if(!mat[m][n].equals("*"))
		                    {
		                        String temp=mat[i][j];
		                        mat[i][j]=mat[m][n];
		                        mat[m][n]=temp;
		                        flag=1;
		                        break;
		                    }
		                }
		                if(flag==1)
		                    break;
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

//- Time complexity: O(R * C)
//- Space complexity: O(R * C)
