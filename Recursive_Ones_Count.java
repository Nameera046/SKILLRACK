
Recursive Ones Count

The program must accept a string S containing only Os and 1s as the input. The program must print the number of 1s in the given string S.
Then the program must print the number of 1s in the previous result(i.e., the ones count in the binary representation of the previous result).
Then the program must repeat the process till the number of 1s in the result reaches 1.

Boundary Condition(s): 1 << Length of S <= 10^6
Input Format: The first line contains S.
Output Format:
The first line contains the integer values separated by a space representing the number of 1s based on the given conditions.

Example Input/Output 1:
Input: 1000100101011000101110101111
Output: 15 4 1
Explanation:
Here S = "1000100101011000101110101111".
There are 15 ones in the given string S. 
So 15 is printed.
15 -> 1111 4 ones. 
So 4 is printed.
4 -> 100 1 one. 
So 1 is printed.

Example Input/Output 2:
Input: 1101101111101110111111010
Output: 19 3 2 1

package Skillrack;
import java.util.*;
public class Recurrive_Ones_Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='1')
			{
				count++;
			}
		}
		System.out.print(count+" ");
		recursivecount(count);
	}
	public static void recursivecount(int count)
	{
		while(count<=1)
		{
			return;
		}
		count=Integer.bitCount(count); // this Operates in constant Time O(1)
		System.out.print(count+" ");
		recursivecount(count); // This Recursion Occurs O(log C)
	}
}

- Time Complexity: O(n + log C), effectively O(n).
- Space Complexity: O(1).
