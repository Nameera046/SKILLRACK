// Sort Subarrays by First Integer

// The program must accept an array of N unique integers and an integer K as the input. The value of N is always divisible by K. 
// The program must split the given array into N/K subarrays of equal size K. 
// Then the program must sort the subarrays based on the first integer. Finally, the program must print the revised array as the output.
  
// Boundary Condition(s):
// 1 <= K <= N <= 1000
// 1 << Each integer value c = 10 ^ 5
  
// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.
// The third line contains K.
// Output Format:
// The first line contains the revised N integers separated by a space.

// Example Input/Output 1:
// Input:
// 9
// 30 38 33 50 55 59 10 15 12 
// 3
// Output:
// 10 15 12 30 38 33 50 55 59
// Explanation:
// Here N = 9 and K = 3
// 1st subarray: 30 38 33
// 2nd subarray: 50 55 59
// 3rd subarray: 10 15 12
// After sorting the 3 subarrays based on the first integer, the array becomes
// 10 15 12 30 38 33 50 55 59

// Example Input/Output 2:
// Input:
// 8
// 3 4 7 6 2 9 5 1 
// 2
// Output:
// 2 9 3 4 5 1 7 6  
// Explanation:
// Here N = 8 and K = 2
// 1st subarray: 3 4
// 2nd subarray: 7 6
// 3rd subarray: 2 9
// 4th subarray: 5 1
// After sorting the 4 subarrays based on the first integer, the array becomes
// 2 9 3 4 5 1 7 6

CODE:

package Sort_The_SubArray_By_first_integer;
import java.util.*;
public class sortTheSubArrayByFirstInteger 
{
	public static void main(String[] args) 
  {
    		Scanner sc=new Scanner(System.in);
    		int n=sc.nextInt();
    		sc.nextLine();
    		int[] arr=new int[n];
    		for(int i=0;i<n;i++)
    		{
    			arr[i]=sc.nextInt();
    		}
    		int k=sc.nextInt();
    		String[] str=new String[n/k];
    		int index=0;
    		for(int i=0;i<n;i+=k)
    		{
    			StringBuilder sb=new StringBuilder();
    			for(int j=i;j<i+k;j++)
    			{
    				sb.append(String.valueOf(arr[j]));
    			}
    			str[index++]=sb.toString();
    		}
        for(int i=0;i<index-1;i++)
        {
        	for(int j=i+1;j<index;j++)
        	{
        		if(str[i].charAt(0)-'0'>str[j].charAt(0)-'0')
            	{
            		String temp=str[i];
            		str[i]=str[j];
            		str[j]=temp;
            	}
        	}
        }
        for(int i=0;i<index;i++)
        {
        	System.out.println(str[i]);
        }
	}
}

//Time Complexity : O(n^2)
//Space Complexity : O(n)
