TRIONIC ARRAY I

You are given an integer array nums of length n.
An array is trionic if there exist indices 0 < p < q < n − 1 such that:
nums[0...p] is strictly increasing,
nums[p...q] is strictly decreasing,
nums[q...n − 1] is strictly increasing.
Return true if nums is trionic, otherwise return false.

Example 1:
Input: nums = [1,3,5,4,2,6]
Output: true
Explanation:
Pick p = 2, q = 4:
nums[0...2] = [1, 3, 5] is strictly increasing (1 < 3 < 5).
nums[2...4] = [5, 4, 2] is strictly decreasing (5 > 4 > 2).
nums[4...5] = [2, 6] is strictly increasing (2 < 6).

Example 2:
Input: nums = [2,1,3]
Output: false
Explanation:
There is no way to pick p and q to form the required three segments.

Constraints:
3 <= n <= 100
-1000 <= nums[i] <= 1000


-------CODE--------


package Skillrack;
import java.util.*;
public class Trionic_Array_1 
{
    public static boolean isTrionic(int[] nums)
    {
      	int i=0,inc=0,dec=0,sinc=0;
      	while(i<nums.length-1)
      	{
      		while(i<nums.length-1 && nums[i]<nums[i+1])
      		{
      			inc=1;
      			i++;
      		}
      		if(i<nums.length-1 && inc==1)
      		{
      			while(i<nums.length-1 && nums[i]>nums[i+1])
      			{
      				dec=1;
      				i++;
      			}
      		}
      		if(i<nums.length-1 && inc==1 && dec==1 )
      		{
      			while(i<nums.length-1 && nums[i]<nums[i+1])
      			{
      				sinc=1;
      				i++;
      			}
      		}
      	}
      	if(inc==1 && dec==1 && sinc==1)
      	{
      		return true;
      	}
      	return false;
    }
  	public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		int n=sc.nextInt();
    		int[] nums=new int[n];
    		for(int i=0;i<n;i++)
    		{
    			nums[i]=sc.nextInt();
    		}
    		boolean result=isTrionic(nums);
    		System.out.println(result);
  	}
}

//-Time Complexity : O(n)
//-Space Complexity : O(1)


-----Optimised Code------

  
package Skillrack;
import java.util.*;
public class Trionic_Array_1 {
    public boolean isTrionic(int[] nums) 
    {
        int i=0;
        while(i<nums.length-1 && nums[i]<nums[i+1])
        {
            i++;
        }
        if(i==0 || i==nums.length-1) 
            return false;
        while (i<nums.length-1 && nums[i]>nums[i+1])
        {
            i++;
        }
        if(i==nums.length-1) 
            return false;
        while (i<nums.length-1 && nums[i]<nums[i+1])
        {
            i++;
        }
        return i==nums.length-1;
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextInt();
		}
		boolean result=isTrionic(nums);
		System.out.println(result);
	}
}

//-Time Complexity : O(n)
//-Space Complexity : O(1)
