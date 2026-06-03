Border Center Asterisk Pattern

Accept an integer N as the input. The program must print the pattern as shown in the Example Input/Output section below. 
(Note:Integer N is always odd). Asterisk is printed along the border and in the center of the N*N matrix which is printed as the output.

Boundary Condition(s): 1 <= N <= 25

Input Format: 
The first line contains the value of N.
Output Format:
The N lines contain the desired pattern.

Example Input/Output 1:
Input: 
5
Ouput:
* * * * *
* 1 2 3 *
* 4 * 6 *
* 7 8 9 *
* * * * *

Example Input/Output 2:
Input: 3
Output: 
* * * 
* * *
* * *

---------------------CODE-------------------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mid=n/2;
		int k=1;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
    		    if(i==0 || j==0 || i==n-1 || j==n-1)
    		    {
    		        System.out.print("* ");
    		    }
    		    else if(i==mid && j==mid)
    		    {
    		        System.out.print("* ");
    		        k++;
    		    }
    		    else
    		    {
    		        System.out.print(k++ +" ");
    		    }
		    }
		    System.out.println();
		}
	}
}

--Time Complexity : O(n^2)
--Space Complexity : O(n^2)
