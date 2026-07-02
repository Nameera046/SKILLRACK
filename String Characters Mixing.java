String Characters Mixing

The program must accept two string values S1 and S2 (Both are of equal length) as the input. 
The program must consider every character in string S2 (from the first character to the last character) and replace the character being considered with the corresponding character which is in the same position in S1. 
Finally, the program must print the modified string values as the output.

Boundary Condition(s): 2 <= Length of S1, S2 <= 100
Input Format:
The first line contains the values of string S1 and S2 separated by a space.
Output Format:
The first line contains the modified string values separated by space(s).

Example Input/Output 1:
Input:
money agile
Output:
mgile aoile agnle agiee agily

Example Input/Output 2:
Input:
computer vertical
Output:
certical vortical vemtical verpical vertucal vertital verticel verticar

-------------------------CODE-----------------------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		String s1=sc.next();
    		String s2=sc.next();
    		for(int i=0;i<s1.length();i++)
    		{
    		    StringBuilder sb=new StringBuilder(s2);
    		    char ch=s1.charAt(i);
    		    sb.setCharAt(i,ch);
    		    System.out.print(sb.toString());
    		}
	  }
}

--Time Complexity : O(n*m) ==>n is the ength of the string;
--Space Complexity : O(n)
