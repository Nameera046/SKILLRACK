Print the Floating Point Values

The program must accept a string value S as the input. The program must print all the floating point values in the string S as output.

Boundary Condition(s):
3 <= Length of String S <= 49

Input Format:
The first line contains the string value S
Output Format:
The list of lines contain all the float values in S.

Example Input/Output 1:
Input:
hello12.34madam45.67
Output:
12.34
45.67
Explanation:
In the given string, 12.34 and 45.67 are the float values. So, 12.34 and 45.67 are printed as output

Example Input/Output 2:
Input:
987.45 larger than 2635.67
Output:
987.45
2635.67

----------------CODE----------------------------

import java.util.*;
public class Hello {

    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();)
		{
		    if(Character.isDigit(s.charAt(i)))
		    {
		        StringBuilder sb=new StringBuilder();
		        while(i<s.length() && (Character.isDigit(s.charAt(i)) || s.charAt(i)=='.'))
		        {
		            sb.append(s.charAt(i));
		            i++;
		        }
		        String st=sb.toString();
		        if(st.contains("."))
		        {
		            System.out.println(st);
		        }
		    }
		    i++;
		}
	}
}

------Time Complexity : O(n)
------Space Complexity : O(n)
