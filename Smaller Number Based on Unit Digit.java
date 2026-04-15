Smaller Number Based on Unit Digit

Accept two numbers as number1 and number2. If both the unit digits are equal print the larger number. 
Otherwise, print the number with the smaller unit digit.

Boundary Condition(s):
1 <= number 1, number2<=99999999

Input Format:
The first line contains the values of number1 and number2 separated by space.
Output Format:
The first line contains the output number.

Example Input/Output 1:
Input:
505 725
Output:
725

Example Input/Output 2:
Input: 
56 8811
Output: 
8811

-------CODE-------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		int n1=sc.nextInt();
    		int n2=sc.nextInt();
    		if(n1%10==n2%10)
    		{
    		    System.out.println(Math.max(n1,n2));
    		}
    		else
    		{
    		    if(n1%10<n2%10)
    		    {
    		        System.out.println(n1);
    		    }
    		    else
    		    {
    		        System.out.println(n2);
    		    }
    		}
  	}
}

--Time Complexity : O(1)
--Space Complexity : O(1)
