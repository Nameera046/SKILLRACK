Hyphen Asterisk Pattern

Accept an integer N (only odd integer) as the input. The program must print the desired pattern as shown in the
Example Input/Output section.

Boundary Condition(s):
1 <= N <= 49

Input Format:
The first line contains the integer N.
Output Format:
The first N lines contain the desired pattern.

Example Input/Output 1:
Input:
5
Output:
*
-*
*-*
-*
*

Example Input/Output 2:
Input:
7
Output: 
*
*-*
-*-*
*-*-*
-*-*
*-*
*

----------CODE----------

import java.util.*;
public class Hello 
{
    public static void main(String[] args)
    {
    		Scanner sc=new Scanner (System.in);
    		int n=sc.nextInt();
    		for(int i=0;i<n/2;i++)
    		{
    		    for(int j=0;j<=i;j++)
    		    {
    		        if((i+j)%2==0)
    		        {
    		            System.out.print("*");
    		        }
    		        else
    		        {
    		            System.out.print("-");
    		        }
    		    }
    		    System.out.println();
    		}
    		for(int i=n/2;i>=0;i--)
    		{
    		    for(int j=0;j<=i;j++)
    		    {
    		        if((i+j)%2==0)
    		        {
    		            System.out.print("*");
    		        }
    		        else
    		        {
    		            System.out.print("-");
    		        }
    		    }
    		    System.out.println();
    		}
	  }
}



---Time Complexity : O(n^2)
---Space Complexity : O(1)
