Split Binary & Sort Integers

The program must accept N integers as the input. For each integer X among the N integers, the program must form two integers by dividing the binary representation of X into two equal halves. 
If the number of bits in the binary representation of X is odd, then consider the middle bit for both halves.
Finally, the program must print the resulting N*2 integers in sorted order.
  
Boundary Condition(s): 1 <= N <= 100 1 - Each integer value <= 10^8

Input Format:
The first line contains N.
The second line contains N integers separated by a space.

Output Format:
The first line contains the resulting N*2 integers in sorted order separated by a space.

Example Input/Output 1:
Input:
4
14 23 10 51
Output:
2 2 2 3 3 5 6 7  
Explanation:
14 > 1110 -> 11, 10 > 3, 2
23 -> 10111 -> 101, 111 -> 5, 7
10 -> 1010 → 10, 10 -> 2, 2
51 -> 110011 -> 110, 011 -> 6, 3
So the 8 integers are printed in sorted order.
  
Example Input/Output 2:
Input:
5 
34 2 69 51 30
Output:
0 1 2 3 4 5 6 6 7 8 

CODE : 

package Skillrack;
import java.util.*;
public class Split_Binary_and_Sort_integer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		String[] binary=new String[n];
		for(int i=0;i<n;i++)
		{
			int temp=arr[i];
			StringBuilder sb=new StringBuilder();
			while(temp>0)
			{
				sb.append(String.valueOf(temp%2));
				temp/=2;
			}
			binary[i]=sb.reverse().toString();
		}
		int[] res=new int[binary.length*2];
		int a=0;
		for(int i=0;i<n;i++)
		{
			int mid=binary[i].length()/2;
			if((binary[i].length())%2==0)
			{
				int sum=0;
				for(int j=mid-1,k=0;j>=0;j--,k++)
				{
					sum+=(binary[i].charAt(j)-'0')*(int)(Math.pow(2,k));
				}
				res[a++]=sum;
				sum=0;
				for(int j=binary[i].length()-1,k=0;j>=mid;j--,k++)
				{
					sum+=(binary[i].charAt(j)-'0')*(int)(Math.pow(2,k));
				}
				res[a++]=sum;
			}
			else
			{
				int sum=0;
				for(int j=mid,k=0;j>=0;j--,k++)
				{
					sum+=(binary[i].charAt(j)-'0')*(int)(Math.pow(2,k));
				}
				res[a++]=sum;
				sum=0;
				for(int j=binary[i].length()-1,k=0;j>=mid;j--,k++)
				{
					sum+=(binary[i].charAt(j)-'0')*(int)(Math.pow(2,k));
				}
				res[a++]=sum;
			}
		}
    Arrays.sort(res);
		for(int i=0;i<a;i++)
		{
			System.out.print(res[i]+" ");
		}
	}
}

//-Time Complexity: O(n * log M)
//-Space Complexity: O(n * log M)
