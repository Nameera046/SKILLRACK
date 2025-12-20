Increasing and Decreasing Window Series

The program must accept two integers N and K as the input. The program must generate a series as given below and print the Kth term as the output.
1 to N, 2*N to N+1, (2*N)+1 to 3*N, 4*N to (3*N)+1, (4*N)+1 to 5*N, ... and so on.

Boundary Condition(s): 1 <= N <= 100 1 K < 1000
Input Format:
The first line contains N and K separated by a space.
Output Format:
The first line contains an integer representing the Kth term in the series.
  
Example Input/Output 1:
Input:
4 15
Output: 
14
Explanation:
Here N-4 and K-15.
The increasing and decreasing window
size 4 is given below.
1 2 3 4 8 7 6 5 9 10 11 12 16 15 14 13 and so on...
The 15th term in the above series is 14. So 14 is printed as the output.

Example Input/Output 2:
Input: 58
Output: 8

CODE:

package Skillrack;
import java.util.*;
public class Increasing_nd_Dcreasing_Window_Series {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		int count=0,current=1,block=0;
		int flag=0;
		while(true)
		{
			if(block%2==0)
			{
				for(int i=current;i<current+n;i++)
				{
					count++;
					if(count==k)
					{
						System.out.print(i);
						return;
					}
				}
			}
			else
			{
				for(int i=current+n-1;i>=current;i--)
				{
					count++;
					if(count==k)
					{
						System.out.print(i);
						return;
					}
				}
			}
			current+=n;
			block++;
		}
	}
}
//
- Time Complexity: O(k)
- Space Complexity: O(1)
