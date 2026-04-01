Print Next Vowel

Given a string S, the program must print the next vowel present for each of the letters in the string. 
If there is no vowel present after the current letter then print the letter as it is.
Boundary Condition(s): 1 <= Length of S <= 1000
Input Format: The first line contains S.
Output Format:
The first line contains the specified output.

Example Input/Output 1:
Input:
welcome
Output:
eoooeee

Example Input/Output 2:
Input: 
different
Output:
ieeeeeent

----------CODE------------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		String s=sc.nextLine();
    		int j=0;
    		StringBuilder sb=new StringBuilder();
    		for(int i=0;i<s.length();i++)
    		{
    		    if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
    		    {
    		        for(int k=j;k<i;k++)
    		        {
    		            sb.append(s.charAt(i));
    		        }
    		        j=i;
    		    }
    		}
    		if(j<s.length())
    		{
    		    for(int k=j;k<s.length();k++)
    		    {
    		        sb.append(s.charAt(k));
    		    }
    		}
    		System.out.print(sb.toString());
  	}
}

--Time Complexity: O(n)
--Space Complexity: O(n)
