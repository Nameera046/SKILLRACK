Count of Longest Consecutive T's

The program must accept an integer N as the input. The program must print the count of longest consecutive 1's in the binary representation of N as the output.
Boundary Condition(s): 1<= N < 99999999

Input Format:
The first line contains the integer value of N.
Output Format:
The first line contains the count of longest consecutive 1's in the binary representation of N.

Example Input/Output 1:
Input:
55
Output: 3
Explanation
The binary representation of 55 is 110111.
The first two bits and the last three bits are consecutive 1's.
The count of the longest consecutive 1's is 3.
Hence, 3 is printed as the output.

Example Input/Output 2:
Input:
1468
Output:
4

-----------------------------CODE----------------------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		StringBuilder sb=new StringBuilder();
		while(temp>0)
		{
		    sb.append(String.valueOf(temp%2));
		    temp/=2;
		}
		String s=sb.reverse().toString();
		int[] dp=new int[s.length()];
		Arrays.fill(dp,1);
		if(s.charAt(0)=='1') dp[0]=1;
		int max=dp[0];
		for(int i=1;i<s.length();i++)
		{
		    if(s.charAt(i)=='1')
		    {
		        dp[i]=dp[i-1]+1;
		        if(dp[i]>max)
		        {
		            max=dp[i];
		        }
		    }
		    else
		    {
		        dp[i]=0;
		    }
		}
		System.out.print(max);
	}
}

---Time Complexity : O(log n)
---Space Complexity : O(log n)
