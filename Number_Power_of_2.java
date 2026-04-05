Number Power of 2

A positive integer N is passed as the input. 
The program must print YES if N is a power of 2. 
Else the program must print NO.

Boundary Condition(s):
1<=N<=999999999999999999

Input Format:
The first line contains the value of N.
Output Format:
The first line contains YES or NO

Example Input/Output 1:
Input:
16
Output: YES

Example Input/Output 2:
Input:
12
Output: NO

-------CODE--------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		long n=sc.nextLong();
    		if(n>0 && (n&(n-1))==0)
    		{
    		    System.out.println("YES");
    		}
    		else
    		{
    		    System.out.println("NO");
    		}
	  }
}

---Time Complexity :O(1)
---Space Complexity : O(1)
