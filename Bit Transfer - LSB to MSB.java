Bit Transfer - LSB to MSB

The program must accept an array of N integers as the input. The program must transfer the LSB of each integer to the MSB of its next integer in the given array. 
For the last integer in the array, consider the first integer as the next integer. Then the program must print the revised values of the N integers as the output.

Boundary Condition(s):
2 <= N <= 100
1 <= Each integer value <= 10^8

Input Format:
The first line contains N.
The second line contains N integer values separated by a space.

Output Format:
The first line contains the revised N integers separated by a space.

Example Input/Output 1:
Input:
4 174 27 120 79
Output: 
215 13 124 39

Explanation:
The binary representations of the 4 integers are given below.
10101110 11011 1111000 1001111
After transferring the LSB of each integer to the MSB of its next integer, the binary representations become
11010111 01101 1111100 0100111

Output: 
215 13 124 39

CODE : 

import java.util.*;
public class bittransfer 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		StringBuilder sb=new StringBuilder();
		String[] bitarr=new String[n];
		int[] sizearr=new int[n];
		for(int i=0;i<n;i++)
		{
			int temp=arr[i];
			String binary="";
			while(temp>0)
			{
				binary=(temp%2)+binary;
				temp/=2;
			}
			bitarr[i]=binary;
			sizearr[i]=bitarr[i].length();
			sb.append(bitarr[i]);
			
		}
		String sb1 = sb.toString();
		int len = sb1.length();
		String[] mstr = new String[n];
		String sb2= sb1.charAt(len - 1) + sb1.substring(0, sb1.length() - 1);
        int index=0;
		for(int i=0;i<n;i++)
		{
			StringBuilder a=new StringBuilder();
			for(int j=0;j<sizearr[i];j++)
			{
				a.append(sb2.charAt(index++));
			}
			mstr[i]=a.toString();
		}
		int[] rstr = new int[n];
		for (int i = 0; i < n; i++) {
		    int sum = 0;
		    for (int j = mstr[i].length() - 1; j >= 0; j--) {
		        int bit = mstr[i].charAt(j) - '0'; 
		        sum += bit * Math.pow(2, (mstr[i].length() - 1 - j)); 
		    }
		    rstr[i] = sum;
		}

		for (int i = 0; i < n; i++) {
		    System.out.print(rstr[i] + " ");
		}
	}
}
