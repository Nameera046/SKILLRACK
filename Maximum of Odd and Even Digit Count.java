Maximum of Odd and Even Digit Count

An integer N is passed as input. 
The program must print the odd digit count if odd digit count is greater than even digit count. 
Else the program must print the even digit count.

Boundary Condition(s): 1<= N < 999999999
Input Format: The first line contains N.
Output Format: The first line contains an integer.

Example Input/Output 1:
Input: 12345
Output: 3

Example Input/Output 2:
Input: 
8982374
Output: 
4

---------CODE----------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		int n=sc.nextInt();
    		int oc=0,ec=0;
    		while(n>0)
    		{
    		    int a=n%10;
    		    if(a%2==0)
    		    {
    		        ec++;
    		    }
    		    else
    		    {
    		        oc++;
    		    }
    		    n/=10;
    		}
    		System.out.println((oc>=ec)?oc:ec);
  	}
}

------Time Complexity : O(log n)
------Space Complexity : O(1)
