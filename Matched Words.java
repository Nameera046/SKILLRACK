Matched Words
  
The program must accept a pattern P as a string and another string S as input. The program must print the words in S 
which are similar to the given pattern P and of the same length as P. The word is said to be similar to the pattern if the occurrence 
count of character matches. If there is no word following the pattern P, then print -1 as the output.

Boundary Condition(s):
2 The length of P = 99 1 The length of S 10000

Input Format:
The first line contains a pattern P.
The second line contains a string S.
Output Format:
The first line contains either the matching word(s) or -1.

Example Input/Output 1:
Input:
rrhjkrrr
mmghieee hrrjkrrr akasjd kkalixxx acd
Output:
mmghieee kkalixxx
Explanation:
The given pattern contains two 'r', one 'h', one 'T'.
one 'k' and three 'r'.
The first word contains two 'm', one 'g', one 'h', one 'i' and three 'e', which is similar to the given pattern.
Thus the first word is printed.
The second word contains one 'h', two 'r', one T, one 'k' and three 'r', which is not similar to the pattern.
The third word contains one 'a', one 'k', one 'a', one 's', one and one 'd', which is not similar to the pattern.
The fourth word contains two 'k', one 'a', one T, one I and three 'x', which is similar to the given pattern.
Thus the fourth word is printed.
The fifth word contains one 'a', one 'c' and one 'd', which is not similar to the pattern.

Example Input/Output 2:
Input:
apple
mango orange
Output: 
-1

--------------------CODE------------------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String p=sc.nextLine();
		String s=sc.nextLine();
		String[] st=s.split(" ");
		int fcount=0;
		for(int i=0;i<st.length;i++)
		{
		    int flag=0;
		    if(p.length()==st[i].length())
		    {
		        int j=0;
		        int k=0;
    		    while(j<p.length() && k<st[i].length())
    		    {
    		        int pcount=1;
    		        int scount=1;
    		        while(j+1<p.length() && p.charAt(j)==p.charAt(j+1))
    		        {
    		            pcount++;
    		            j++;
    		        }
    		        while(k+1<st[i].length() && st[i].charAt(k)==st[i].charAt(k+1))
    		        {
    		            scount++;
    		            k++;
    		        }
    		        if(pcount!=scount)
    		        {
    		            flag=1;
    		            break;
    		        }
    		        j++;
    		        k++;
    		    }
    		    if(flag==0 && j==p.length() && k==st[i].length())
    		    {
    		        System.out.print(st[i]+" ");
    		        fcount=1;
    		    }
		    }
		}
		if(fcount==0)
		{
		    System.out.print("-1");
		}
	}
}

-----Time Complexity : O(t * m)
-----Space Complexity : O(t)----->(string array length)
