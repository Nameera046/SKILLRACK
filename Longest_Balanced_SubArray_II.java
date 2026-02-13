Longest Balanced SubArray II

You are given a string s consisting only of the characters 'a', 'b', and 'c'.
A substring of s is called balanced if all distinct characters in the substring appear the same number of times.
Return the length of the longest balanced substring of s.

Example 1:
Input: s = "abbac"
Output: 4
Explanation:
The longest balanced substring is "abba" because both distinct characters 'a' and 'b' each appear exactly 2 times.

Example 2:
Input: s = "aabcc"
Output: 3
Explanation:
The longest balanced substring is "abc" because all distinct characters 'a', 'b' and 'c' each appear exactly 1 time.

Example 3:
Input: s = "aba"
Output: 2
Explanation:
One of the longest balanced substrings is "ab" because both distinct characters 'a' and 'b' each appear exactly 1 time. 
Another longest balanced substring is "ba".

package sumoftheintegerdivisiblebyk;
import java.util.*;
public class Longest_Balanced_SubArray_II {

	public static int longestbalancedSubarrayII(String s)
	{
		if (s.length() == 1) {
            return 1;
        }
        int maxlen=0;
        for(int i=0;i<s.length();i++)
        {
            Map<Character,Integer> h=new HashMap<>();
            int maxfreq=0;
            for(int j=i;j<s.length();j++)
            {
                char ch=s.charAt(j);
                int newfreq=h.getOrDefault(ch,0)+1;
                h.put(ch,newfreq);
                maxfreq=Math.max(maxfreq,newfreq);
                int len=j-i+1;
                int dist=h.size();
                if(len==dist*maxfreq)
                {
                    maxlen=Math.max(maxlen,len);
                }
            }
        }
        return maxlen;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int result=longestbalancedSubarrayII(str);
		System.out.println(result);
	}

}
//
//-- Time Complexity : O(n^2);
//-- Space Compelxity : O(n);

