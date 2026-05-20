Common Alphabets N Strings

N string values are passed as input to the program. Each string will contain only the alphabets a-z in lower case. 
A given alphabet may be repeated any number of times. The program must print the count C of the alphabets that are present
in all the N string values.

Input Format:
The first line contains N.
Next N lines contain the N string values.
Output Format:
The first line contains C.

Boundary Conditions:
2 <= N <= 500
1 <= Length of the string value <= 1000

Example Input/Output 1:
Input:
3
mnppqqr
ajkmnnm
poormanagement
Output:
2
Explanation:
Only 2 alphabets m and n are present in all the three string values.

----------CODE-----------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		int n=sc.nextInt();
    		sc.nextLine();
    		String[] s=new String[n];
    		Set<Character> sq=new HashSet<>();
    		for(int i=0;i<n;i++)
    		{
    		    s[i]=sc.nextLine();
    		}
    		int count=0;
    		for(int i=0;i<s[0].length();i++)
    		{
    		    boolean found=true;
    		    char ch=s[0].charAt(i);
    		    for(int j=1;j<n;j++)
    		    {
    		        if(!s[j].contains(String.valueOf(ch)))
    		        {
    		            found=false;
    		            break;
    		        }
    		    }
    		    if(found)
    		    {
    		        sq.add(ch);
    		    }
    		}
    		System.out.print(sq.size());
	  }
}

--Time Comeplexity :O(n * m * L).
--Space Complexity : O(1)
