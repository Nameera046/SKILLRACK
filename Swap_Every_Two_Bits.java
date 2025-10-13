// Swap Every Two Bits

// The program must accept an integer N as the input. The program must swap every two bits in the binary representation of 
// N from LSB and print the revised value of N as the output. If the number of bits in the binary representation of N is odd, then 
// consider a leading zero in its binary representation to swap every two bits. Please fill in the blanks with code so that the program runs successfully.
// Boundary Condition(s): 1 <= N < 2^8
// Input Format: The first line contains N.
// Output Format:
// The first line contains the revised value of N.

// Example Input/Output 1:
// Input:218
// Output: 229
// Explanation:
// The binary representation of 218 is 11011010.
// After swapping every two bits in the binary representation of 218, the binary representation becomes 11100101.
// The decimal equivalent of 11100101 is 229 which is printed as the output.

// Example Input/Output 2:
// Input: 154
// Output: 101
  
// Example Input/Output 3:
// Input: 7
// Output: 11
// Explanation:
// The binary representation of 7 is 0111.
// After swapping every two bits in the binary representation of 7, the binary representation becomes 1011.
// The decimal equivalent of 1011 is 11 which is printed as the output.

CODE:

import java.util.*;
public class Swap_Every_Two_Bits 
{
	public static void main(String[] args) 
  {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		String binary="";
		while(temp>0)
		{
			binary=(temp%2)+binary;
			temp/=2;
		}
		StringBuilder sb=new StringBuilder(binary);
		if(sb.length()%2!=0)
		{
			sb.reverse().append('0');
			sb.reverse();
		}
		for(int i=0;i<sb.length()-1;i+=2)
		{
			char ch=sb.charAt(i);
			char ch1=sb.charAt(i+1);
			sb.setCharAt(i, ch1);
			sb.setCharAt(i+1,ch);
		}
		int sum=0;
		for(int i=sb.length()-1,j=0;i>=0;i--)
		{
			sum+=Integer.parseInt(String.valueOf(sb.charAt(i)))*(Math.pow(2,j));
			j++;
		}
		System.out.println(sum);
	}
}

// Time Complexity: O(log n)
// Space Complexity; O(log n)
