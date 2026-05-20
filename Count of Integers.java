Count of Integers

Accept two lists of integers with size M and N as input. 
The program must print count of the integers in the first list which is less than are equal to the integers at same positions in the second list.

Boundary Condition(s):
1 <= M, N < 999
1 <= M integers <= 99
1 <= N integers <= 99

Input Format:
The first line contains the value of M and N
separated by space(s).
The second line contains M integers separated
by space(s).
The third line contains N integers separated by space(s).
Output Format:
The first line contains the count of integers.

Example Input/Output 1:
Input:
5 4
2 3 4 5 6
3 4 6 2
Output: 3

Example Input/Output 2:
Input:
2 3
23 12
34 12 23
Output: 
2

---------CODE----------

import java.util.*;
public class Hello 
{

    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		int n=sc.nextInt();
    		int m=sc.nextInt();
    		int[] a1=new int[n];
    		int[] a2=new int[m];
    		for(int i=0;i<n;i++)
    		{
    		    a1[i]=sc.nextInt();
    		}
    		for(int i=0;i<m;i++)
    		{
    		    a2[i]=sc.nextInt();
    		}
    		int count=0;
    		if(n<m)
    		{
    		    for(int i=0;i<n;i++)
    		    {
    		        if(a1[i]<=a2[i])
    		        {
    		            count++;
    		        }
    		    }
    		}
    		else
    		{
    		    for(int i=0;i<m;i++)
    		    {
    		        if(a1[i]<=a2[i])
    		        {
    		            count++;
    		        }
    		    }
    		}
    		System.out.print(count);
	  }
}

--Time Complexity : O(n)
--Space Complexity : O(n)
