String Reversal First and Second Half

Given a string S, the program must reverse the first half of the string and then reverse the second of the string and print it.

Input Format:
The first line contains the value of string S.
Output Format:
The first line contains the specified output.
Boundary Condition: 2 length of the S <= 100

Example Input/Output 1:
Input:
orange
Output:
aroegn

Example Input/Output 2:
Input:
input
Output:
niptu

---------CODE----------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		String str=sc.nextLine();
    		if(str.length()<=3)
    		{
    		    System.out.println(str);
    		    return;
    		}
    		int mid=str.length()/2;
    		StringBuilder sb=new StringBuilder();
    		if(str.length()%2==0)
    		{
    		    for(int i=mid-1;i>=0;i--)
    		    {
    		        sb.append(str.charAt(i));
    		    }
    		    for(int i=str.length()-1;i>=mid;i--)
    		    {
    		        sb.append(str.charAt(i));
    		    }
    		}
    		else
    		{
    		    for(int i=mid-1;i>=0;i--)
    		    {
    		        sb.append(str.charAt(i));
    		    }
    		    sb.append(str.charAt(mid));
    		    for(int i=str.length()-1;i>mid;i--)
    		    {
    		        sb.append(str.charAt(i));
    		    }
    		}
    		System.out.println(sb.toString());
    }
}

--Time Complexity : O(n)
--Space Complexity : O(n)
