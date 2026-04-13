Pattern Lower Left Plus Symbol

Given an integer N as input, the program must print the pattern as shown in the Example Input/Output section.
Boundary Condition(s): 1 <= N <= 50

Input Format:
The first line contains value of integer N
Output Format:
The first N lines contain the pattern as shown in following examples.

Example Input/Output 1:
Input:
3
Output:
333
+22
++1

------------CODE--------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int k=n;
    	for(int i=0;i<n;i++)
    	{
    	    for(int j=0;j<n;j++)
    	    {
    	        if(j<i)
    	        {
    	            System.out.print("+ ");
    	        }
    	        else
    	        {
    	            System.out.print(k+" ");
    	        }
    	    }
    	    k--;
    	    System.out.println();
    	}
	}
}


  --Time Complexity: O(n^2)
  --Space Complexity : O(n^2)
