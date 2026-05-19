Pattern Printing Numeric Sequence
Accept R rows and C columns as input. The program must print the pattern as shown in the Example Input/Output section as the output.
Boundary Condition(s):
1 R, C 100
Input Format:
The first line contains the value of R and C.
Output Format:
The first R lines contain the desired pattern.
Example Input/Output 1: 
Input:
4 6
Output:
123456
234567
345678 
456789

Example Input/output 2:
Input:
5 4
Output:
1 2 3 4 
2 3 4 5 
3 4 5 6 
4 5 6 7 
5 6 7 8

----------CODE-------------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		    for(int j=i;j<i+m;j++)
		    {
		        System.out.print(j);
		    }
		    System.out.println();
		}
	}
}

--Time Complexity : O(n*m)
--Space Complexity : O(1)
