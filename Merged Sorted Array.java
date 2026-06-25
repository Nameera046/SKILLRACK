Merged Sorted Array

The program must accept two sorted arrays of size M and N as input. The program must print the merged sorted array as the output.

Boundary Condition(s):
1 <= M, N <= 20

Input Format:
The first line contains the value of M and N separated by space.
The second line contains the M elements separated by space(s).
The third line contains the N elements separated by space(s).
Output Format:
The first line contains the merged sorted array
separated by space(s).

Example Input/Output 1:
Input:
4 3
9 7 7 4
7 6 3
Output:
9 7 7 7 6 4 3

Example Input/Output 2:
Input:
54
12 11 10 9 8 
8 7 6 5
Output:
12 11 10 9 8 8 7 6 5

------------------CODE---------------------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		int m=sc.nextInt();
    		int n=sc.nextInt();
    		int[] a1=new int[m];
    		int[] a2=new int[n];
    		for(int i=0;i<m;i++)
    		{
    		    a1[i]=sc.nextInt();
    		}
    		for(int i=0;i<n;i++)
    		{
    		    a2[i]=sc.nextInt();
    		}
        int[] res=new int[m+n];
        for(int i=0;i<m;i++)
        {
            res[i]=a1[i];
        }
        for(int i=0;i<n;i++)
        {
            res[i+m]=a2[i];
        }
        Arrays.sort(res);
        for(int i=m+n-1;i>=0;i--)
        {
            System.out.print(res[i]+" ");
        }
	  }
}

------Time Complexity :  O((m + n) log(m + n)).
------Space Complexity : O(m+n)
