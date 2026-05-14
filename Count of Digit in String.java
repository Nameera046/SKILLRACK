Count of Digit in String

Accept N strings and an integer X as input. The program must print the count of the given digit in each string as the output.

Boundary Condition(s):
2 <= N <= 99
0 <= x <= 9
1 <= Length of string <= 100

Input Format:
The first line contains the value of N.
The second line contains the value of X.
The third line contains N strings separated by space(s).
Output Format:
The first line contains the count of the given digits in each string separated by a space.

Example Input/Output 1:
Input:
3
4
8464 3746234 4743734
Output:
2 2 3

Example Input/Output 2:
Input:
2
4
hello4rake34984 morningg4766467
Output:
3 2

--------CODE--------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		int n=sc.nextInt();
    		int x=sc.nextInt();
    		sc.nextLine();
    		String[] str=new String[n];
    		for(int i=0;i<n;i++)
    		{
    		    str[i]=sc.next();
    		}
    		for(int i=0;i<n;i++)
    		{
    		    int count=0;
    		    for(int j=0;j<str[i].length();j++)
    		    {
    		        if(str[i].charAt(j)-'0'==x)
    		        {
    		            count++;
    		        }
    		    }
    		    System.out.print(count+" ");
    		}
	  }
}

--Time Complexity : O(n*L)
--Space Complexity : O(n)
