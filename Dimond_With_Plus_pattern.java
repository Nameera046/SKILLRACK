Diamond with Plus Pattern
  
The program must accept an integer N as the input. The program must print (2*N)-1 lines of pattern as shown in the Example Input/Output section. 
The asterisks in the pattern indicate the diamond and plus symbols. The hyphens in the pattern indicate the empty spaces.

Boundary Condition(s):
2N<=50
  
Input Format:
The first line contains N.

Output Format:
The first (2*N)-1 lines contain the desired pattern as shown in the Example Input/Output section.

Example Input/Output 1:
Input:
5
Output:
--------*
------*-*-*
----*---*---*
--*-----*-----*
*-*-*-*-*-*-*-*-*
--*-----*-----*
----*---*---*
------*-*-*
--------*
  
Explanation:
Here N-5, so the pattern contains 9 lines ((2*5)-1) of output.

Example Input/Output 2:
Input:
3
Output:
----*
--*-*-*
*-*-*-*-*
--*-*-*
----*
  
Example Input/Output 3:
Input:
6
Output:
----------*
--------*-*-*
------*---*---*
----*-----*-----*
--*-------*-------*
*-*-*-*-*-*-*-*-*-*-*
--*-------*-------*
----*-----*-----*
------*---*---*
--------*-*-*
----------*

CODE :

package Skillrack;
import java.util.*;
public class Diamond_With_Plus_Pattern 
{
	public static void main(String[] args) 
  {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 0; i < 2 * n - 1; i++) 
		{
		    int mi = (i < n) ? i : (2 * n - 2 - i);
		    for (int j = 0; j <= 2 * (Math.abs(mi + (n - 1))); j++) 
		    {
		        if (j == 2 * n - 2 || (mi == n - 1 && j % 2 == 0) || j == 2 * (Math.abs(mi - (n - 1))) || j == 2 * (Math.abs(mi + (n - 1)))) 
		        {
		            System.out.print("*");
		        } 
		        else 
		        {
		            System.out.print("-");
		        }
		    }
		    System.out.println();
		}
	}
}

//- Time Complexity: O(n^2)
//- Space Complexity: O(1)
