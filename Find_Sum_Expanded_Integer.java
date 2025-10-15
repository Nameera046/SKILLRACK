Find Sum - Expanded Integers

The program must accept N string values containing only nonzero digits as the input, 
where each string S represents an integer value but each digit D in the integer is repeated D times.
The program must find the original integer values from the given string values. 
Then the program must print the sum of the resulting N integers as the output.
Note: The value of each integer(i.e., the value after converting the string to an integer) can be from 1 to 999999.

Boundary Condition(s):
1 <= N <= 100
Input Format:
The first line contains N.
The next N lines, each contains a string value representing an integer value but each digit D in the integer is repeated D times.
Output Format:
The first line contains an integer value representing the sum of the resulting N integers.

Example Input/Output 1:
Input: 
4 
13334444 
2222
44449999999994444 
555556666661333
Output:
6263
Explanation:
13334444 -> 134. 
2222 -> 22. 
44449999999994444 -> 494. 
555556666661333 -> 5613. 
134+22+494+5613 6263.

Example Input/Output 2:
Input:
3 
88888888 
122122 
44447777777
Output: 1267
Explanation:
88888888 -> 8. 
122122 -> 1212. 
44447777777 -> 47. 
8+1212+47 = 1267.

CODE:

package Find_Sum_Expand_Integer;
import java.util.*;
public class Find_Sum_Expand_Integer 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] str=new String[n+1];
		for(int i=1;i<=n;i++)
		{
			str[i]=sc.next();
		}
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			StringBuilder sb=new StringBuilder();
			for(int j=0;j<str[i].length();)
			{
				char ch=str[i].charAt(j);
				sb.append(ch);
				int step=ch-'0';
				j+=step;
			}
			String str1=sb.toString();
			sum+=Integer.parseInt(str1);
		}
		System.out.println(sum);
	}
}

Time Complexity : O(L) where L -> Length of all the input Strings.
Space Complexity : O(L) where L -> Length of all the input Strings.
