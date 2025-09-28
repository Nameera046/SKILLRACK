// Step Increasing Pattern
  
// The program must accept an integer N as the input. The program must print the desired pattern as shown in the Example Input/Output section.
// Boundary Condition(s): 1 <= N <= 50

// Input Format:
// The first line contains N.
// Output Format:
// The first N lines contain the desired pattern as shown in the Example Input/Output section.

// Example Input/Output 1:
// Input: 4
// Output:
// 1 
// 1 1 2 
// 1 1 2 1 2 3
// 1 1 2 1 2 3 1 2 3 4

// Explanation:
// Here N=4, so the pattern contains 4 lines of output.
// 1st step: 1 is printed.
// 2nd step: The integer in the previous step (1) is printed and then the integers from 1 to 2 are printed.
// 3rd step: The integers in the previous step (112) are printed and then the integers from 1 to 3 are printed.
// 4th step: The integers in the previous step (112123) are printed and then the integers from 1 to 4 are printed.

// Example Input/Output 2:
// Input: 5
// Output:
// 1 
// 1 1 2 
// 1 1 2 1 2 3
// 1 1 2 1 2 3 1 2 3 4
// 1 1 2 1 2 3 1 2 3 4 1 2 3 4 5

CODE:

import java.util.*;
public class step_increasing_pattern 
{
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	String[] str=new String[n+1];
    	StringBuilder sb=new StringBuilder();
    	for(int i=1;i<=n;i++)
    	{
    		for(int j=1;j<=i;j++)
    		{
    			sb.append(String.valueOf(j)).append(" ");
    		}
    		str[i]=sb.toString();
    	}
    	for(int i=1;i<=n;i++)
    	{
    		System.out.println(str[i]);
    	}
    }
}


112123123412345
