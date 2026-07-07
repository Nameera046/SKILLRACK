Count of String S2 in String S1

The program must accept two string values S1 and S2 as the input. The program must print the count of occurrence(s) of the string S2 in the string S1.

Boundary Condition(s):
2 <= Length of S1 <= 1000
2 <= Length of S2 <= 1000

Input Format:
The first line contains the values of S1 and S2 separated by a space.
Output Format:
The first line contains the count of occurrence(s) of the string S2 in the string S1.

Example Input/Output 1:
Input:
abcdbcdbcbbcd bcd
Output:
3
Explanation:
bcd has occurred in abcdbcdbcbbcd for thrice.

Example Input/Output 2:
Input:
nsidsiddidsid id
Output:
4

-----------------------------------------CODE---------------------------------------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int i=0,j=0,k=0,count=0;
		while(i<s1.length())
		{
		    if(s1.charAt(j)!=s2.charAt(k))
		    {
		        i++;
		        j=i;
		    }
		    else
		    {
		        j=i;
		        StringBuilder sb=new StringBuilder();
		        while(j<s1.length() && k<s2.length() && s1.charAt(j)==s2.charAt(k))
		        {
		            sb.append(s1.charAt(j));
		            j++;
		            k++;
		        }
		        if(sb.toString().equals(s2))
		        {
		            count++;
		        }
		        i++;
		        j=i;
		        k=0;
		    }
		}
		System.out.print(count);
	}
}

----Time Complexity : O(m*n)
----Space Complexity : O(m)
