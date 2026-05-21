Alternate From To Print

An array of N integers is given as input. The program must print the 1st to 2nd element in ascending order, print from 2nd to 3rd element
in descending order, print from 3rd to 4th element in ascending order and so on.

Boundary Condition(s):
3 <= N <= 100

Input Format:
The first line contains N.
The second line contains N integers separated by space(s).
Output Format:
The first line contains the integer values separated by space(s).

Example Input/Output 1:
Input:
5
1 5 10 20 28
Output:
1 2 3 4 5 10 9 8 7 6 5 10 11 12 13 14 15 16 17 18 19 20 28 27 26 25 24 23 22 21 20

Example Input/Output 2:
Input:
4
1 10 17 25
Output:
1 2 3 4 5 6 7 8 9 10 17 16 15 14 13 12 11 10 17 18 19 20 21 22 23 24 25

-----------CODE------------

import java.util.*;
public class Hello 
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
		int swap=0;
		for(int i=0;i<n-1;i++)
		{
		    if(swap==0)
		    {
    		    for(int j=arr[i];j<=arr[i+1];j++)
    		    {
    		        System.out.print(j+" ");
    		    }
    		    swap=1;
		    }
		    else if(swap==1)
		    {
		        for(int j=arr[i+1];j>=arr[i];j--)
		        {
		            System.out.print(j+" ");
		        }
		        swap=0;
		    }
		}
    }
}

--Time Complexity : O(n)
--Space Complexity : O(1)
