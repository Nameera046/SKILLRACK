Character Palindrome Check

Given a string S, the program must print yes if a palindrome can be formed by using all the characters in the string. 
Else the program must print no.

Boundary Condition(s): 1 <= Length of S <= 1000

Input Format:
The first line contains S.
Output Format:
The first line contains yes or no.

Example Input/Output 1:
Input: maamd
Output
yes

Example Input/Output 2:
Input:
eree
Output: no

-------CODE-------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
   {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
    		Map<Character,Integer> h=new HashMap<>();
    		for(int i=0;i<str.length();i++)
    		{
    		    char ch=str.charAt(i);
    		    h.put(ch,h.getOrDefault(ch,0)+1);
    		}
    		int onecount=0;
    		for(Map.Entry<Character,Integer> entry:h.entrySet())
    		{
    		    if(entry.getValue()%2!=0)
    		    {
    		        onecount++;
    		    }
    		}
    		if(onecount==1 || onecount==0)
    		{
    		    System.out.println("yes");
    		}
    		else
    		{
    		    System.out.println("no");
    		}
  	}
}

--Time Complexity : O(n)
--Space Complexity : O(n)
