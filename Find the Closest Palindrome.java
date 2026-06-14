Find the Closest Palindrome

The program must accept a number N as the input. The program must print the closest palindromic number as the output. 
If there are two closest palindromic numbers the program must print the smaller number.

Boundary Condition(s):
2 <= N <= 99999999999999

Input Format:
The first line contains the value of N.
Output Format:
The first line contains the closest palindromic number.

Example Input/Output 1:
Input:
124
Output: 
121

Example Input/Output 2:
Input:
1439
Output: 
1441

-----------------------------CODE-----------------------------

import java.util.*;

public class Hello 
{
    public static boolean ispalindrome(String n)
    {
        int a=0;
        int b=n.length()-1;
        while(a<b)
        {
            if(n.charAt(a)!=n.charAt(b))
            {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().trim();
		Long n=Long.parseLong(s);
		for(long i=n-1,j=n;i>=0;j++,i--)
		{
		    String st1=String.valueOf(i);
		    String st2=String.valueOf(j);
		    if(ispalindrome(st1))
		    {
		        System.out.print(st1);
		        break;
		    }
		    else if(ispalindrome(st2))
		    {
		        System.out.print(st2);
		        break;
		    }
		 }
	}
}

-----Time Complexity : O(n log n)
-----Space Complexity : O(log n)
