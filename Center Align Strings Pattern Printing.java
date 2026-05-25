Center Align Strings Pattern Printing

The program must accept a list of string values as the input. 
The program must center align the string values along with asterisks and hyphens as shown in the Example Input/Output section.

Boundary Condition(s):
1 <= Number of strings <= 20
0 <= Length of each string <= 50

Input Format:
The list of lines contain a string in each line.
Output Format:
The list of lines contain the center aligned string values along with asterisks and hyphens.

Example Input/Output 1:
Input:
This is a

hypothetical 
situation
Output:
**************
*-This is a-
*------------*
*hypothetical*
*-situation-*
**************

Example Input/Output 2:
Input:
Joe
waited 
for the
train
Output:
********
*-Joe-*
*-waited*
*for the*
*-train-*
********

-----------------------CODE----------------------------

import java.util.*;
public class Hello 
{

    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		String[] str=new String[20];
    		int i=0;
    		int max=Integer.MIN_VALUE;
    	    while(sc.hasNextLine())
    	    {
    	        str[i++]=sc.nextLine();
    	        max=Math.max(max,str[i-1].length());
    	    }
    	   for(int j=0;j<max+2;j++)
    	   {
    	       System.out.print("*");
    	   }
    	   System.out.println();
    	   for(int j=0;j<i;j++)
    	   {
    	       int diff=max-str[j].length();
    	       System.out.print("*");
    	       int mid=diff/2;
    	       if(diff%2!=0){
    	       for(int k=0;k<=mid;k++)
    	       {
    	           System.out.print("-");
    	       }
    	       System.out.print(str[j]);
    	       for(int k=mid+1;k<diff;k++)
    	       {
    	           System.out.print("-");
    	       }}
    	       if(diff%2==0)
    	       {
    	           for(int k=0;k<mid;k++)
    	           {
    	               System.out.print("-");
    	           }
    	           System.out.print(str[j]);
    	           for(int k=mid;k<diff;k++)
    	           {
    	               System.out.print("-");
    	           }
    	       }
    	       System.out.println("*");
    	   }
    	   for(int j=0;j<max+2;j++)
    	   {
    	       System.out.print("*");
    	   }
    	   System.out.println();
  	}
}

--Time Complexity : O(n * max) where n is number of input lines and max is the maximum line length; 
--Space Complexity : O(max) for the stored strings (due to fixed 20-line array, effectively constant with respect to input size, but proportional to the maximum line length).
