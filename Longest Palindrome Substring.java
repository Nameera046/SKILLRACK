Longest Palindrome Substring

Given a string s, return the longest palindromic substring in s.

Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"
 
Constraints:
1 <= s.length <= 1000
s consist of only digits and English letters.

-----------code-------------
  
import java.util.*;
public class Longest_palindrome_substring {
	public static String longestpalindromesubstring(String str)
	{
		int maxlen=0,st=0,ed=0;
		for(int i=0;i<str.length()-1;i++)
		{
			for(int j=str.length()-1;j>i;j--)
			{
				int a=i,b=j,flag=0;
				while(a<b)
				{
					if(str.charAt(a)!=str.charAt(b))
					{
						flag=1;
						break;
					}
					a++;
					b--;
				}
				if(flag==0)
				{
					if(j-i+1>maxlen)
					{
						maxlen=Math.max(maxlen, j-i+1);
						st=i;
						ed=j;
					}
				}
			}
		}
		return str.substring(st,ed+1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String result=longestpalindromesubstring(str);
		System.out.println(result);
	}
}

--Time Complexity : O(n^3);
--Space Complexity : O(1);
