Count of Concatenated Multiples

The program must accept an integer array of size N and an integer X as the input. 
The program must print the count of pairs in the array such that the concatenation(s) of two integers in the pair is a multiple of X. 
For example, the concatenations of 25 and 40 are 2540 and 4025.
Note: A pair cannot be formed with the integer at the same position in the array.

Boundary Conition(s): 2 <= N <= 100 1 <= x <= 999

Input Format:
The first line contains the value of N and X separated by space(s).
The second line contains N integers separated by space(s).
Output Format: The first line contains the count of pairs which are the multiples of X.

Example Input/Output 1: Input: 5 11 45 1 10 12 11
Output: 7
Explanation:
There are 7 pairs which produce the multiples of 11. They are
(10, 45) -> 1045
(1, 10) -> 110
(45, 1) -> 451 
(45, 10) -> 4510 
(12, 1) -> 121 
(10, 12) -> 1012 
(12, 10) -> 1210 
Hence the output is 7

Example Input/Output 2:
Input: 
3 2
12 12 11
Output:
2

-------------------------CODE-----------------------------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		int n=sc.nextInt(),x=sc.nextInt();
    		int[] arr=new int[n];
    		for(int i=0;i<n;i++)
    		{
    		    arr[i]=sc.nextInt();
    		}
    		int finalcount=0;
    		for(int i=0;i<n;i++)
    		{
    		    for(int j=0;j<n;j++)
    		    {
    		        if(i!=j)
    		        {
        		        int count=0;
        		        int temp=arr[j];
        		        while(temp>0)
        		        {
        		            count++;
        		            temp/=10;
        		        }
        		        int res=arr[i]*((int)Math.pow(10,count))+arr[j];
        		        if(res%x==0)
        		        {
        		            finalcount++;
        		        }
    		        }
    		    }
  	  	}
  		  System.out.println(finalcount);
	  }
}

-------Time Complexity : O(n^2 * log10(maxValue))
-------Space Complexity : O(n)
