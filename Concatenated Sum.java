Concatenated Sum

The program must accept two integer array of size M and N as input. The program must form a number X by combining the integers 
in the same order as in the first array and form a number Y by combining the integers in the same order as in the second array. 
Finally, the program must print the sum of X and Y as the output.

Boundary Condition(s):
1 <= M, N <= 100
1 <= Value of each integer in the array <= 9999

Input Format:
The first line contains the value of M and N separated by a space.
The second line contains M integers separated by space(s).
The third line contains N integers separated by space(s).
Output Format:
The first line contains the sum of X and Y.

Example Input/Output 1:
Input:
4 5
1 2 4 5 
5 7 3 12 6
Output: 574371
Explanation: X -> 1245 Y -> 573126
The sum of X and Y is 574371.
Hence the output is 574371

Example Input/Output 2:
Input: 
5 3 
2 4 8 1 1 
10 25 100
Output: 1049911
Explanation: X -> 24811 Y-> 1025100
The sum of X and Y is 1049911.
Hence the output is 1049911

-------------------CODE-----------------------

import java.util.*;
import java.math.BigInteger;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[] a1=new int[m];
		int[] a2=new int[n];
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<m;i++)
		{
		    sb.append(sc.nextInt());
		}
		StringBuilder sb1=new StringBuilder();
		for(int i=0;i<n;i++)
		{
		    sb1.append(sc.nextInt());
		}
		BigInteger n1=new BigInteger(sb.toString());
		BigInteger n2=new BigInteger(sb1.toString());
		System.out.print(n1.add(n2));
	}
}

-----Time Complexity : O(m+n)
-----Space Compelxity : O(m+n)
