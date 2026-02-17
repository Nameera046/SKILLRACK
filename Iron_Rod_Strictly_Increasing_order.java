Iron Rods Strictly Increasing Order

There are N iron rods arranged in a row based on the height in ascending order. 
A boy cuts the iron rods in strictly increasing order so that the absolute difference between the heights of every two consecutive iron rods is 1. 
The boy never cuts the first iron rod. After cutting the N-1 iron rods, he starts melting and making new iron rods with the remaining rods. 
The boy wants to place as many new rods as possible to the right side of the N rods without violating the strictly increasing order of height.
The program accepts N integers representing the heights of the N iron rods as the input. 
The program must print the heights of the iron rods after cutting and making the new rods as the output.

Boundary Condition(s):
2N 100 1 << Each integer value <= 10^5

Input Format:
The first line contains N.
The second line contains N integer values separated by a space representing the heights of the N iron rods.
Output Format:
The first line contains the integer values separated by a space representing the heights of the iron rods based on the given conditions.

Example Input/Output 1:
Input: 
4 
2 5 8 12
Output: 
2 3 4 5 6 7
Explanation:
After cutting the given 4 iron rods based on the given conditions, the 4 rods become 2 3 4 5.
The boy makes two more rods of heights 6 and 7 with the remaining rods (2, 4 and 7). Finally, he has 6 rods 2 3 4 5 6 7.

Example Input/Output 2:
Input:
5 
5 6 7 10 21
Output: 
5 6 7 8 9 10

Example Input/Output 3:
Input:
7
18 19 20 21 22 23 24
Output:
18 19 20 21 22 23 24

package Skillrack;
import java.util.*;
public class Iron_Rods_Strictly_Increasing_order {

	public static void  cutting_and_melting(int[] arr)
	{
		List<Integer> l=new ArrayList<>();
		l.add(arr[0]);
		int rem=0;
		for(int i=1;i<arr.length;i++)
		{
			int last=l.get(l.size()-1);
			if(arr[i]-last==1)
			{
				l.add(arr[i]);
			}
			else if(arr[i]-last>1)
			{
				int ad=last+1;
				l.add(ad);
				rem+=arr[i]-ad;
			}
		}
		while(rem>=l.get(l.size()-1))
		{
			int ad=l.get((l.size()-1))+1;
			l.add(ad);
			rem-=ad;
			
		}
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		cutting_and_melting(arr);
	}
}

//--Time Complexity : O(n+m);
//--Space Complexity : O(n+m);
