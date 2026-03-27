Electornic Display Maximum Value

Electronic Display Maxima Value

In a four-digit electronic display, each digit is displayed using seven segments. The program must accept an integer N representing the number of segments to display an integer X. The program must print the maximum possible four-digit integer X that can be displayed using N segments as the output.
The number of segments required to display each digit is given below.
0-6
1-2
2-5
3-5
4-4
5-5
6-6
7-3
8-7
9-6

Boundary Condition(s):
8< N <28

Input Format:
The first line contains N.
Output Format:
The first line contains X.

Example Input/Output 1:
Input: 13
Output: 9711
Explanation: Here N = 13.
The maximum possible four-digit integer that can be displayed using 13 segments is 9711 (9+7+1+1-13).

Example Input/Output 2:
Input: 10
Output: 7711

Example Input/Output 3:
Input: 18
Output: 9977

--------CODE-----------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		int[] segments={6,2,5,5,4,5,6,3,7,6};
		int n=sc.nextInt();
		for(int d1=9;d1>=1;d1--)
		{
		    for(int d2=9;d2>=0;d2--)
		    {
		        for(int d3=9;d3>=0;d3--)
		        {
		            for(int d4=9;d4>=0;d4--)
		            {
		                if(segments[d1]+segments[d2]+segments[d3]+segments[d4]==n)
		                {
		                    System.out.println(""+d1+d2+d3+d4);
		                    return;
		                }
		            }
		        }
		    }
		}
	}

- Time complexity: O(1) (fixed number of iterations, specifically 9000)
- Space complexity: O(1)
}
