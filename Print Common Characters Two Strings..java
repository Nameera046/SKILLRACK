Print Common Characters Two Strings.

Two strings S1 and S2 are passed as input. The program must print the characters present in both the strings in alphabetical order.

Boundary Condition(s):
1 <= Length of Strings <= 1000

Input Format:
The first line contains S1 and S2 separated by space(s).
Output Format:
The first line contains the common characters separated by a space.

Example Input/Output 1:
Input:
hello velocity
Output:
e l o

Example Input/Output 2:
Input:
apple pepper
Output:
e p

---------CODE--------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		String s1=sc.next();
    		String s2=sc.next();
    		Set<Character> s=new TreeSet<>();
    		if(s1.length()<=s2.length())
    		{
    		    for(int i=0;i<s1.length();i++)
    		    {
    		        for(int j=0;j<s2.length();j++)
    		        {
    		            if(s1.charAt(i)==s2.charAt(j))
    		            {
    		                s.add(s1.charAt(i));
    		            }
    		        }
    		    }
    		}
    		else
    		{
    		    for(int i=0;i<s2.length();i++)
    		    {
    		        for(int j=0;j<s1.length();j++)
    		        {
    		            if(s2.charAt(i)==s1.charAt(j))
    		            {
    		                s.add(s2.charAt(i));
    		            }
    		        }
    		    }
    		}
    		for(Character ch:s)
    		{
    		    System.out.print(ch+" ");
    		}
	  }
}

--Time Complexity : O(l*m)
--Space Comeplxity : O(l*m)
