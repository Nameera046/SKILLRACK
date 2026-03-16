DECODE STRING

Given an encoded string, return its decoded string.
The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. 
Note that k is guaranteed to be a positive integer.
You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. 
Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. 
For example, there will not be input like 3a or 2[4].
The test cases are generated so that the length of the output will never exceed 105.

Example 1:
Input: s = "3[a]2[bc]"
Output: "aaabcbc"
	
Example 2:
Input: s = "3[a2[c]]"
Output: "accaccacc"
	
Example 3:
Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"
 

Constraints:

1 <= s.length <= 30
s consists of lowercase English letters, digits, and square brackets '[]'.
s is guaranteed to be a valid input.
All the integers in s are in the range [1, 300].

-------CODE----------

package sumoftheintegerdivisiblebyk;
import java.util.*;
public class decode_String {
	public static String decodeString(String s) 
	{
        Stack<Integer> st=new Stack<>();
        Stack<String> st1=new Stack<>();
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        int n=0;
        for(int i=0;i<s.length();i++)
        {
        	char ch=s.charAt(i);
        	if(Character.isDigit(ch))
        	{
        		n=n*10+(ch-'0');
        	}
        	else if(ch=='[')
        	{
        		st.push(n);
        		n=0;
        		st1.push(sb.toString());
        		sb=new StringBuilder();
        	}
        	else if(ch==']')
        	{
        		int k=st.pop();
        		String temp=sb.toString();
        		while(k-->0)
        		{
        			sb1.append(temp);
        		}
        	}
        	else
        	{
        		sb.append(ch);
        	}
        }
        return sb1.toString();
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String result=decodeString(s);
		System.out.println(result);
	}
}

- Time Complexity: O(n * k_max), where n is the length of the input string and k_max is the maximum repeat count.
- Space Complexity: O(n), primarily for stacks and temporary string storage.
