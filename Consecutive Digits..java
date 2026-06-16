Consecutive Digits.

The program accepts an integer N as the input. All the digits in the number must be repeated consecutively. 
If a digit is not repeated consecutively, the program must repeat it for two times. Finally, 
the program must print the modified integer value.

Boundary Condition(s):
1 <= N <= 10^13

Input Format:
The first line contains the value of N.
Output Format:
The first line contains the modified integer value.

Example Input/Output 1:
Input:
1223
Output: 112233
Explanation:
1 and 3 are not repeated consecutively. So consider 1 and 3 as 11 and 33. Hence the output is 112233.

Example Input/Output 2:
Input: 998888745551
Output: 998888774455511

--------------------------------CODE--------------------------------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Long n=sc.nextLong();
		String s=String.valueOf(n);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
		    if((i-1>=0 && s.charAt(i)==s.charAt(i-1))||(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)))
		    {
		        sb.append(s.charAt(i));
		        continue;
		    }
		    else
		    {
		        sb.append(s.charAt(i)).append(s.charAt(i));
		    }
		}
		System.out.print(sb.toString());
	}
}

-----Time Complexity : O(L)  --L-> digits
-----Space Complexity : O(1)
