Difference of Odd and Even Digits Sum

Given an Integer N, the program must print the absolute difference of the sum of odd digits and sum of even digits.

Boundary Condition(s): 1<= N < 99999999999999

Input Format: The first line contains S.
Output Format:
The first line contains the output as specified.

Example Input/Output 1:
Input: 12345
Output: 3
Explanation: [(1+3+5)- (2+4)| = 3

Example Input/Output 2:
Input: 89235
Output: 7
Explanation: |(8+2)-(9+3+5)| = 7

------CODE--------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int s1=0,s2=0;
        for(int i=0;i<s.length();i++)
        {
            int temp=s.charAt(i)-'0';
            if(temp%2==0)
            {
                s1+=temp;
            }
            else
            {
                s2+=temp;
            }
        }
        System.out.println(Math.abs(s1-s2));
	  }
}

-----Time Complexity : O(n)
-----Space Compelxity : O(1)
