Alternate X Characters

Accept a string S and a position X as input. 
The program must print the alternate X characters in the string by printing the first X characters and ignoring the next X characters.
This process is repeated until the last character is reached.

Boundary Condition(s):
2 <= Length of String, S <= 1000 2 < X <= 10

Input Format:
The first line contains the string S.
The second line contains the value of X.
Output Format:
The first line contains the string with alternate X characters.

Example Input/Output 1:
Input:
helloworld
3
Output:
helorl

Example Input/Output 2:
Input:
environmentalpollution
5
Output:
envirtalpoon

----------------CODE-------------------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
  	   	Scanner sc=new Scanner(System.in);
  	    String str=sc.nextLine();
  	   // sc.nextLine();
  	    int n=sc.nextInt();
  	    int j;
  	    for(int i=0;i<str.length();i+=n)
  	    {
  	        for(j=i;j<i+n && j<str.length();j++)
  	        {
  	            System.out.print(str.charAt(j));
  	        }
  	        i=j;
  	    }
	  }
}
--Time Complexity : O(m)
--Space Complexity : O(1)
