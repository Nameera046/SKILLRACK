Next Number Same Unit Digit

An array of N integers are given as input. The program must print the integers only if the unit digit of the current 
integer and the unit digit of the next integer are same.

Boundary Condition(s):
2 <= N <= 1000

Input Format:
The first line contains the value of N.
The second line contains N integers separated by space(s).
Output Format:
The first line contains integers separated by a space.

Example Input/Output 1:
Input:
6 12 834 94 485 285 905
Output: 
834 485 285

Example Input/Output 2:
Input:
6
91 41 74 192 32 45
Output: 
91 192

---------CODE------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
		    int a=arr[i]%10;
		    int b=arr[i+1]%10;
		    if(a==b)
		    {
		        System.out.print(arr[i]+" ");
		    }
		}
	}
}

--Time Complexity : O(n)
--Space Complexity : O(n)
