Isomorphic Strings

Given two strings S1 and S2, the program must print if they are isomorphic or not.
Two strings are isomorphic if the characters in S1 can be replaced to get S2 based on the conditions given below.
- All occurrences of a character must be replaced with another character while preserving the order of characters.
- No two characters can map to the same character but a character can map to itself.

Input Format:
The first line contains S1
The second line contains S2
Output Format:
The first line contains YES or NO indicating if S1 and S2 are isomorphic or not.

Boundary Conditions:
1 <= Length of S1 and S2 = 1000

Example Input/Output 1:
Input:
fill
bell
Output:
YES

Example Input/Output 2:
Input:
paper
title
Output: YES

Example Input/Output 3:
Input:
pen 
egg
Output: NO


-----------CODE----------


import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		String s1=sc.nextLine();
    		String s2=sc.nextLine();
    		if(s1.length()!=s2.length())
    		{
    		    System.out.println("NO");
    		    return;
    		}
    		Map<Character,Character> h1=new HashMap<>();
    		Map<Character,Character> h2=new HashMap<>();
    		for(int i=0;i<s1.length();i++)
    		{
    		    char c1=s1.charAt(i);
    		    char c2=s2.charAt(i);
    		    if(h1.containsKey(c1))
    		    {
    		        if(h1.get(c1)!=c2)
    		        {
    		            System.out.println("NO");
    		            return;
    		        }
    		    }
    		    else
    		    {
    		        h1.put(c1,c2);
    		    }
    		    if(h2.containsKey(c2))
    		    {
    		        if(h2.get(c2)!=c1)
    		        {
    		            System.out.println("NO");
    		            return;
    		        }
    		    }
    		    else
    		    {
    		        h2.put(c2,c1);
    		    }
    		}
    		System.out.println("YES");
	  }
}

--Time Complexity - O(n)
--Space Complexity - O(n)
