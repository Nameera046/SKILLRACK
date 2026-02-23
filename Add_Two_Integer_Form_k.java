Add Two Integers - Form K

The program must accept N integers and an integer K as the input. 
The program must calculate and print the number of ways W to form the integer K by adding two integers among N integers as the output. 
Also, the sign of the integers can be changed to form K.

Boundary Condition(s):
2 <= N < 1000 2^ * (- 10 ^ 5) <= K <2^ * (10^ ^ 5)
-10^5 Each integer value <= 10^5

Input Format:
The first line contains N and K separated by a space.
The second line contains N integers separated by a space.
Output Format:
The first line contains an integer representing the number of ways to form K based on the given conditions.

Example Input/Output 1:
Input:
3 5 
-2 3-3
Output: 2
Explanation:
The 2 possible ways are given below.
-2 and -3 = 2+3 = 5
-2 and 3 = 2+3 = 5

Example Input/Output 2:
Input:
5 -3
-1 -2 2 1 4
Output: 6
Explanation:
The 6 possible ways are given below.
-1 and - 2 = (- 1) + (- 2) = - 3
-1 and 2 = (- 1) + (- 2) = - 3
-1 and 4 = 1+(-4) = -3
-2 and 1 = (- 2) + (- 1) = - 3
2 and 1 = (- 2) + (- 1) = - 3
1 and 4 = 1+(-4) = -3

package Skillrack;
import java.util.*;
public class Add_Two_Integer_Form_K {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++) 
			{
				if(arr[i]+arr[j]==k)
				{
					count++;
				}
				else if(arr[i]+(arr[j]*-1)==k)
				{
					count++;
				}
				else if((arr[i]*-1)+arr[j]==k)
				{
					count++;
				}
				else if((arr[i]*-1)+(arr[j]*-1)==k)
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}


--Time Complexity : O(n^2)
--Space Complexity : O(n) --> array Storage otherwise O(1);
