Find N Terms - Power of 7

The program must accept an integer N as the input. The program must print the first N terms in the following series.
1, 7, 8, 49, 50, 56, 57, 343, .... and so on.
Each integer in the above series is a power of 7 or sum of unique powers of 7. All integers in the series are always sorted in ascending order.

Boundary Condition(s): 1<= N < 1000
Input Format: 
The first line contains N.
Output Format:
The first line contains the first N terms in the given series.

Example Input/Output 1:
Input: 5
Output: 17 8 49 50
Explanation:
1st term: 7^0 = 1
2nd term: 7^1 = 7
3rd term: 7^1 + 7^0 = 8
4th term: 7^2 = 49
5th term: 7^2 + 7^0 = 50

Example Input/Output 2:
Input: 10
Output: 17 8 49 50 56 57 343 344 350

CODE :

package Skillrack;
import java.util.*;
public class Find_N_terms_Power_of_7 
{
	public static void main(String[] args) 
  {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str;
		for(int i=1;i<=n;i++)
		{
			double  res=0.0;
			int temp=i,binary=0;
			StringBuilder sb=new StringBuilder();
			while(temp>0)
			{
				sb.append(String.valueOf(temp%2));
				temp/=2;
			}
			str=sb.reverse().toString();
			for(int k=0,j=str.length()-1;j>=0;k++,j--)
			{
				res+=(str.charAt(j)-'0')*Math.pow(7,k);
			}
			System.out.print((int)res+" ");
		}
	}
}


Time Complexity: O(n log n)
Space Complexity: O(log n)
