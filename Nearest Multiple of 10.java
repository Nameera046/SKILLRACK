Nearest Multiple of 10

The program must accept an integer N as the input. The program must print the nearest multiple of 10 as the output.
Note: If the value of N has two nearest multiples, then the smaller multiple should be printed as the output.

Boundary Condition(s): 10 <= N <= 999999999

Input Format:
The first line contains the value of N.

Output Format:
The first line contains the nearest multiple of 10.

Example Input/Output 1:
Input: 551
Output: 550

Example Input/Output 2:
Input: 9999999
Output: 10000000

---------------------CODE----------------------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		int n=sc.nextInt();
    		int tempinc=n;
    		int tempdec=n;
    		while(true)
    		{
    		     if((tempdec--)%10==0)
    		     {
    		         System.out.print(tempdec+1);
    		         break;
    		     }
    		     if((tempinc++)%10==0)
    		     {
    		         System.out.print(tempinc-1);
    		         break;
    		     }
    		}
	  }
}

----Time Complexity : O(1)
----Space Complexity : O(1)
