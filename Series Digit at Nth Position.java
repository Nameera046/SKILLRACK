Series Digit at Nth Position

The program must accept two integer values M and N as input. The program must generate a series of integers from 1 to M and print the digit at the Nth position in the series.

Boundary Condition(s): 1 << M < 120 1 <= N <= Length of the series

Input Format:
The first line contains the integer values M and N separated by a space.
Output Format:
The first line contains the digit at the Nth position in the generated series.

Example Input/Output 1:
Input: 55 30
Output: 2
Explanation:
The series from 1 to 55 is 12345678910111213141516171819202122232425262728:
30th position contains

Example Input/Output 2:
Input: 10 3
Output: 3

-----------------------CODE--------------------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		StringBuilder res=new StringBuilder();
		for(int i=1;i<=m;i++)
		{
		    int j=i;
		    StringBuilder sb=new StringBuilder();
		    while(j>0)
		    {
		        int temp=j%10;
		        sb.append(String.valueOf(temp));
		        j/=10;
		    }
		    res.append(sb.reverse());
		}
		String result=res.toString();
		if(n>=1 && n<=result.length())
		{
		    System.out.print(result.charAt(n-1));
		}
	}
}

------Time Complexity : O(m log m)
------Space Complexity : O(m log m)
