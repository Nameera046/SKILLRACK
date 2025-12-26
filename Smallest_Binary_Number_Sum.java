Smallest Binary Number Sum

The program must accept N integers as the input. For each integer X among the N integers,
the program must find the smallest positive integer whose binary representation B is divisible by X (Consider B as a decimal number while performing division operation). 
Then the program must print the sum of the N resulting smallest integers as the output.

Boundary Condition(s):
1 <= N, Each integer value <= 100

Input Format:
The first line contains N.
The second line contains N integers separated by a space.

Output Format
The first line contains an integer representing the sum of the N resulting smallest integers.

Example Input/Output 1:
Input:
4
12 8 23 19
Output:
114
Explanation:
1st integer 12: 28 -> 11100 (11100 is divisible by 12)
2nd integer 8: 8 -> 1000 (1000 is divisible by 8)
3rd integer 23:53 -> 110101 (110101 is divisible by 23)
4th integer 19:25 -> 11001 (11001 is divisible by 19)
28+8+53 + 25 = 114.
Hence 114 is printed as the output.

Example Input/Output 2:
Input: 
3 
54 63 50
Output: 
2785

CODE:

package Skillrack;
import java.util.*;
public class Smallest_Binary_Number_Sum 
{
	public static void main(String[] args) 
  {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			int a=1;
			while(true)
			{
				int temp=a;
				StringBuilder sb=new StringBuilder();
			    while(temp>0)
			    {
			    	sb.append(String.valueOf(temp%2));
			    	temp/=2;
			    }
			    String st1=sb.reverse().toString();
			    long str = Long.parseLong(st1);
			    if(str%arr[i]==0)
			    {
			    	sum+=Integer.parseInt(st1,2);
			    	break;
			    }
			    else
			    {
			    	a++;
			    }
			}
		}
		System.out.print(sum);
	}
}
