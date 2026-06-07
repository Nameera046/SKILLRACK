Consecutive Words - Beginning/End

The program must accept a string S containing multiple words as the input. 
The program must print YES if each word(except the first word) is formed from the previous word by adding exactly one character to the beginning or the end of the previous word. 
Else the program must print NO as the output.

Boundary Condition(s): 4 <= Length of S <= 1000
Input Format: The first line contains S.
Output Format: The first line contains YES or NO.

Example Input/Output 1:
Input: an and cand candl candle
Output: YES
Explanation:
Here S = "an and cand candl candle".
2nd word: and (an + d)
3rd word: cand (c + and)
4th word: candl (cand + 1)
5th word: candle (candl + e) So YES is printed as the output.

Example Input/Output 2:
Input: i it bit bite biter bitter
Output: NO

  CODE :

  package Skillrack;
import java.util.*;
public class Consecutive_Wordings_beginning_end 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String[] str=sc.nextLine().split(" ");
		int flag=0;
		for(int i=0;i<str.length-1;i++)
		{
			if(!str[i+1].contains(str[i]))
			{
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}

-Time Complexity : O(n*m)
-Space Complexity : O(n*m)
