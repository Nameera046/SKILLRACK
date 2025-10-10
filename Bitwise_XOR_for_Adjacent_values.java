// Bitwise XOR Every Two Adjacent Values

// The program must accept N integers as the input. 
// The program must perform bitwise XOR operation between every two adjacent values and print the results. 
// Then the program must repeat the above process on the previous result till the result becomes a single integer.

// Boundary Condition(s):
// 2 <= N < 1000
// 1 <= Each integer value <= 10^5
  
// Input Format:
// The first line contains N.
// The second line contains N integer values separated by a space.
// Output Format:
// The first N-1 lines, each contains integer values separated by a space.
  
// Example Input/Output 1:
// Input:
// 4 
// 1 2 4 8
// Output:
// 3 6 12
// 5 10
// 15

// Explanation:
// Here N=4 and the given 4 integers are 1, 2, 4 and 8.
// The value of 1 XOR 2 is 3.
// The value of 2 XOR 4 is 6.
// The value of 4 XOR 8 is 12.
// The value of 3 XOR 6 is 5.
// The value of 6 XOR 12 is 10.
// The value of 5 XOR 10 is 15.
// Hence the output is
// 3 6 12 5 10 15

// Example Input/Output 2:
// Input:
// 5 
// 10 23 7 16 28
// Output:
// 29 16 23 12
// 13 7 27
// 10 28 
// 22

CODE: 
package ButWise_XOR_Every_Two_Adjacent_Values;
import java.util.*;
public class bitwiseXOReverytowadjacentvalues {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		while(n>=1)
		{
			for(int i=0;i<n-1;i++)
			{
				arr[i]=arr[i]^arr[i+1];
				System.out.print(arr[i]+" ");
			}
			n--;
      if(n>1)
      {
			  System.out.println();
      }
		}
	}
}
