Reduce Array-Subtract side

The program must accept an array of N integers as the input. The program must print the output based on the following conditions.
For each integer X in the array, the program must decrement the value of X by the size of the array.
Then the program must remove Os and negative integers from the revised array.
Then the program must print all the integers in the revised array only if the size is greater than 0.
Then the program must repeat the above three processes till the size of the array becomes Q
Note: There will be at least one integer greater than N in the given array.

Boundary Condition(s):
1<=N<=100
1 <= Each integer value <= 10^4

Input Format:
The first line contains N.
The second line contains N integers separated by a space.

Output Format:
The lines contain the integer values based on the given conditions.

Example input/Output 1:
Input:
6 
24 23 14 21 20 15
Output:
18 17 8 15 14 9 
12 11 2 9 8 3 
6 5 3 2 
2 1 

Example Input/Output 2:

Input: 
2 
15 16

Output: 
13 14 
11 12 
9 10 
7 8 
5 6 
3 4 
1 2

CODE : 

package Skillrack;
import java.util.*;
public class Reduce_Array_Decrease_Size 
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
		while(n>0)
		{
			int k=0;
			for(int i=0;i<n;i++)
			{
                 arr[i]-=n;
                 if(arr[i]>0)
                 {
                	 arr[k++]=arr[i];
                 }
			}
			for(int i=0;i<k;i++)
			{
				System.out.print(arr[i]+" ");
			}
			n=k;
			if(n>0)
			{
				System.out.println();
			}
		}
	}
}

//-Time Complexity - O(n^2)
//-Space Complexity - O(n)
