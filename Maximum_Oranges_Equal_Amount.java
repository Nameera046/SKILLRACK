Maximum Oranges Equal Amount

There are N orange trees in a row. 
The number of oranges in each tree is passed as the input. Hector wants to pluck a maximum number of oranges based on the following condition.
- He can start collecting oranges from any tree, but once he starts collecting, he must collect an equal 
    amount of oranges from each tree from the tree he started to the last tree.
The program must print the maximum number of oranges Hector can collect as the output.

Boundary Condition(s):
1<=N<=100
1 <= Each integer value <= 1000

Input Format:
The first line contains N.
The second line contains N integer values separated by a space.
Output Format:
The first line contains an integer value representing the maximum number of oranges Hector can collect.

Example Input/Output 1:
Input:
5 43526
Output: 10
Explanation:
Hector can collect 2 oranges from each tree (from 1st tree to 5th tree). So he gets 10 oranges.

Example Input/Output 2:
Input:
5 13246
Output: 8
Explanation:
Hector can collect 2 oranges from each tree (from 2nd tree to 5th tree).
or
Hector can collect 4 oranges from each tree (from 4th tree to 5th tree). So he gets 8 oranges.

Example Input/Output 3:
Input:
10
555525 5 5 3 21
Output: 21

--------CODE---------

package Skillrack;
import java.util.*;
public class Maximum_Oranges_Equal_Amount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			int a=arr[i];
			if(a==0) continue;
			for(int j=i;j<=a;j++)
			{
				int sum=0,flag=0;
				for(int k=i;k<n;k++)
				{
					if(arr[k]>=j)
					{
						sum+=j;
					}
					else
					{
						flag=1;
						break;
					}
				}
				if(flag==1)
				{
					break;
				}
				else if(sum>max)
				{
					max=sum;
				}
			}
		}
		System.out.println(max);
	}
}

- Time Complexity: O(n^2 * M)  => O(n^3)
- Space Complexity: O(n)
