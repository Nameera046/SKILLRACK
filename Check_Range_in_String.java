// Check Range in String
  
// The program must accept two integers X, Y and a string S containing only digits as the input.
// The program must print YES if the string S represents the concatenation of all the integers from X to Y. Else the program must print NO as the output.
// Boundary Condition(s): 1X<Y 1000 2 Length of S <= 10^4
// Input Format:
// The first line contains X and Y separated by a space.
// The second line contains S.
// Output Format:
// The first line contains YES or NO.

// Example Input/Output 1:
// Input:
// 10 18 
// 101112131415161718
// Output: YES
// Explanation:
// Here X-10, Y-18 and S = 101112131415161718.
// The integers from 10 to 18 are 10 11 12 13 14 15 16 17 18.
// The string S represents the concatenation of all the integers from 10 to 18, so YES is printed as the output.

// Example Input/Output 2:
// Input:
// 251 255
// 251252253254255256
// Output: NO
  
// Example Input/Output 3:
// Input: 99 102 
// 99100101102
// Output: YES
  
// Example Input/Output 4:
// Input: 
// 500 503
// 500502501503
// Output: NO

CODE : 

package Check_Range_In_String;
import java.util.*;
public class Check_Range_In_String 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(),y=sc.nextInt();
		String str=sc.next();
		StringBuilder sb=new StringBuilder();
		for(int i=x;i<=y;i++)
		{
			sb.append(String.valueOf(i));
		}
		String str1=sb.toString();
    if(str1.equals(str))
    {
    	System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
	}
}

// Time Complexity : O((y-x+1)*d)
// Space Complexity : O(n)
