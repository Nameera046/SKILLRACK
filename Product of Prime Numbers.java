Product of Prime Numbers in the Given Range
Accept a start value X and an end value Y as input. The program must print the product of prime numbers in the given range X and Y.

Boundary Condition(s):
1 <= X, Y <= 999

Input Format:
The first line contains the start value and the end value.
Output Format:
The first line contains the product of prime numbers in the given range.

Example Input/Output 1:
Input:
2 10
Output:
210
Explanation:
Prime numbers in the given range 2 to 10 are 2,3,5,7. Product of the prime numbers is 210 (2*3*5*7 = 210). Thus, the output is 210.

Example Input/Output 2:
Input: 30 40
Output:
1147

----------CODE----------

import java.util.*;
public class Hello 
{
    public static boolean isprime(int x)
    {
        if(x<2) return false;
        if(x==2) return true;
        for(int i=2;i*i<=x;i++)
        {
            if(x%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		int x=sc.nextInt();
    		int y=sc.nextInt();
    		int prod=1;
    		for(int i=x;i<=y;i++)
    		{
    		    if(isprime(i))
    		    {
    		        prod*=i;
    		    }
    		}
    		System.out.print(prod);
   	}
}

--Time Complexity : O((y - x + 1) * sqrt(y))
--Space Complexity : O(1)
