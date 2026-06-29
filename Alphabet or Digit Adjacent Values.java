Alphabet or Digit Adjacent Values

The program must accept a string S as the input. For every character in the string S the output is printed based on the following conditions,
- If both the adjacent characters of the current character are alphabets, then the program must concatenate the subsequent and the preceding alphabets of the current character until a digit occurs and then the program must print the concatenated value.
- Else if both the adjacent characters are digits, then the program must concatenate the subsequent and the preceding digits of the current character until an alphabet occurs and then the program must print the concatenated value.
Note: The string contains only alphabets and digits.

Boundary Condition(s):
3 Length of string S <= 1000

Input Format:
The first line contains the value of string S.
Output Format:
The first line contains the string values separated by a space.

Example Input/Output 1:
Input:
heir4567
Output:
hir her 467 457
Explanation:
The first character has no preceding character.
Hence it is not printed.
The adjacent characters for the second character e are h and i where both are alphabets. So the preceding alphabet h and the subsequent alphabets ir are concatenated.
Hence hir is printed.
The adjacent characters for the third character i are e and r where both are alphabets. So the preceding alphabets he and the subsequent alphabet r are concatenated.
Hence her is printed.
The adjacent characters for the fourth character r are i and 4 where i is an alphabet and 4 is a digit. Hence it is not printed.
The adjacent characters for the fifth character 4 are r and 5 where r is an alphabet and 5 is a digit. Hence it is not printed.
The adjacent characters for the sixth character 5 are 4 and 6 where both are digits. So the preceding digit 4 and the subsequent digits
67 are concatenated.
Hence 467 is printed.
The adjacent characters for the seventh character 6 are 5 and 7 where both are digits.
So the preceding digits 45 and the subsequent digit 7 are concatenated.
Hence 457 is printed.
The eighth character has no subsequent character. Hence it is not printed.

Example Input/Output 2:
Input:
apple12354mango
Output:
aple aple appe 1354 1254 1234 mngo mago mano

--------------------------------------------CODE-----------------------------------------------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		String s=sc.nextLine();
    		int n=s.length();
    		for(int i=1;i<n-1;i++)
    		{
    		    StringBuilder sb=new StringBuilder();
    		    if(Character.isLetter(s.charAt(i-1)) && Character.isLetter(s.charAt(i+1)))
    		    {
    		        int j=i-1;
    		        while(j>=0 && Character.isLetter(s.charAt(j)))
    		        {
    		            j--;
    		        }
    		        j++;
    		        while(j<i)
    		        {
        		            sb.append(s.charAt(j));
        		            j++;
    		        }
    		        j=i+1;
    		        while(j<n && Character.isLetter(s.charAt(j)))
    		        {
    		            sb.append(s.charAt(j));
    		            j++;
    		        }
    		    }
    		    else if(Character.isDigit(s.charAt(i-1)) && Character.isDigit(s.charAt(i+1)))
    		    {
    		        int j=i-1;
    		        while(j>=0 && Character.isDigit(s.charAt(j)))
    		        {
    		            j--;
    		        }
    		        j++;
    		        while(j<i)
    		        {
    		            sb.append(s.charAt(j));
    		            j++;
    		        }
    		        j=i+1;
    		        while(j<n && Character.isDigit(s.charAt(j)))
    		        {
    		            sb.append(s.charAt(j));
    		            j++;
    		        }
    		    }
    		    if(sb.length()>0)
    		    {
    		         System.out.print(sb.toString()+" ");
    		    }
		    }
	  }
}

----Time Complexity : O(n^2)
----Space Complexity : O(1)
