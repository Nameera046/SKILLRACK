Pattern Printing Middle Letter Odd Length String [ZOHO]

An odd length string S is passed as the input. The program must print the pattern as described below.
Let L be the length of the string and M denote the middle position of the string S. The characters in the string are a(1)....., a(M), .... a(L).
- The first line will contain the middle letter a(M) of S in the extreme right.
- Then in each subsequent line, the letters after the middle letter from a(M+1) to a(L) is appended to the line output.
- After the end of the string a(L) is reached, in each subsequent line, the letters from the beginning to the middle letter, a(1) to a(M-1) are appended to the line output.
Note: Asterisk * will be used to pad in the front so that each line has L characters

Input Format:
The first line will contain S.
Output Format:
L lines as output where L is the length of the string S.

Boundary Conditions:
3<=L<=1001

Example Input/Output 1:
Input:
CRY
Output:
**R
*RY
RYC

Example Input/Output 2:
Input:
PROGRAM
Output:
****GRA
***GRAM
**GRAMP
*GRAMPR
GRAMPRO

------CODE-----------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int m=str.length()/2;
		StringBuilder sb=new StringBuilder();
		sb.append(str.substring(m,str.length())).append(str.substring(0,m+1));
		String s=sb.toString();
		for(int i=1;i<=str.length();i++)
		{
		    for(int j=0;j<str.length()-i;j++)
		    {
		        System.out.print("*");
		    }
		    for(int j=0;j<i;j++)
		    {
		        System.out.print(s.charAt(j));
		    }
		    System.out.println();
		}
	}
}

---Time Complexity : O(n^2)
---Space Compelxity : O(n^2)
