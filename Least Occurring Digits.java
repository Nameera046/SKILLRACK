Least Occurring Digits

A series of N integers is passed as input. The program must print the least occurring digit(s) in series of integers in ascending order.

Boundary Condition(s): 1 <= N <= 1000

Input Format:
The first line contains the series of integers separated by space(s).
Output Format:
The first line contains the least repeated digits in ascending order separated by a space.

Example Input/Output 1: Input: 35 81 78 84 53
Output:
147
Example Input/Output 2: Input: 12 21 68 55 71 29 60 879
Output: 0

----------------CODE---------------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] str=s.split(" ");
		Map<Integer,Integer> h=new HashMap<>();
		for(int i=0;i<str.length;i++)
		{
		    long k=Long.parseLong(str[i]);
		    while(k>0)
		    {
		        int temp=(int)(k%10);
		        h.put(temp,h.getOrDefault(temp,0)+1);
		        k/=10;
		    }
		}
		int flag=1;
		int min=Integer.MAX_VALUE;
		for(int m:h.values())
		{
		    min=Math.min(m,min);
		}
		for(Map.Entry<Integer,Integer> entry:h.entrySet())
		{
		  //  System.out.println(entry.getKey()+" "+entry.getValue());
		    if(entry.getValue()==min)
		    {
		        System.out.print(entry.getKey()+" ");
		        flag=0;
		    }
		}
		if(flag==1)
		{
		    System.out.print(0);
		}
	}
}

--Time Complexity : O(n) - n--> total Number of digits
--Space Complexity : O(1)
