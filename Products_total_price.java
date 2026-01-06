Products Total Price

There are four products A, B, C and D in a shop.
The price of the four products are given below.
A-Rs.40 each or Rs.100 for a pack of 4
BRs.60 each
C-Rs.55 each or Rs.200 for a pack of 6
D-Rs.95 each
The program must accept a string S representing the products in a cart. The program must print the total price for the entire cart based on the given price list.
Boundary Condition(s): 1 <= Length of S <= 1000
Input Format:
The first line contains S.
Output Format:
The first line contains the total price for the entire cart based on the given price list.

Example Input/Output 1:
Input:
ABACDBAAA
Output: 410
Explanation:
A quantity 5 - (100+40)
B-quantity 2-(60+60)
C-quantity 1-55
D-quantity 1-95
Total price 410

Example Input/Output 2:

Input:
CACCCDAADCCCCCCCBC
Output: 770

CODE :

package Skillrack;
import java.util.*;
public class All_matrix_sum_from_top_left 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] res=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				res[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
          if (i > 0) 
            res[i][j] += res[i - 1][j];
          if (j > 0) 
            res[i][j] += res[i][j - 1];
          if (i > 0 && j > 0) 
            res[i][j] -= res[i - 1][j - 1];
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}

//Time complexity: O(r * c)
//Space complexity: O(r * c)
