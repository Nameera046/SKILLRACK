Longest Balanced SubArray

You are given an integer array nums.
A subarray is called balanced if the number of distinct even numbers in the subarray is equal to the number of distinct odd numbers.
Return the length of the longest balanced subarray.

Example 1:
Input: nums = [2,5,4,3]
Output: 4
Explanation:
The longest balanced subarray is [2, 5, 4, 3].
It has 2 distinct even numbers [2, 4] and 2 distinct odd numbers [5, 3]. Thus, the answer is 4.

Example 2:
Input: nums = [3,2,2,5,4]
Output: 5
Explanation:
The longest balanced subarray is [3, 2, 2, 5, 4].
It has 2 distinct even numbers [2, 4] and 2 distinct odd numbers [3, 5]. Thus, the answer is 5.

Example 3:
Input: nums = [1,2,3,2]
Output: 3
Explanation:
The longest balanced subarray is [2, 3, 2].
It has 1 distinct even number [2] and 1 distinct odd number [3]. Thus, the answer is 3.

------CODE-------

import java.util.*;
import java.util.Scanner;

public class Longest_Balanced_SubArray {
	public static int LongestBalancedSubArray(int[] nums)
	{
		int maxlen=0;
		for(int i=0;i<nums.length;i++)
		{
			Set<Integer> s=new HashSet<>();
			int ec=0,oc=0;
			for(int j=i;j<nums.length;j++)
			{
				if(s.add(nums[j]))
				{
					if(nums[j]%2==0)
					{
						ec++;
					}
					else if(nums[j]%2!=0)
					{
						oc++;
					}
				}
				if(ec==oc)
				{
					maxlen=Math.max(maxlen, j-i+1);
				}
			}
		}
		return maxlen;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextInt();
		}
		int result=LongestBalancedSubArray(nums);
		System.out.println(result);
	}
}

//- Time complexity: O(n^2)
//- Space complexity: O(n)
