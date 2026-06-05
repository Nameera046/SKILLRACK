Unique Embedded Decimal values

The program must accept an integer N as the input. The program must print the numbers that can be formed from 
the binary representation of N while traversing sequentially from start to end.

Boundary Condition(s): 1<= N < 999999999

Input Format: 
The first line contains the value of N.
Output Format:
The first line contains the numbers that can be formed from the binary representation of N.

Example Input/Output 1:
Input:
12
Output: 
1 3 6 12 2 4 0
Explanation:
The binary representation of 12 - 1100 can form the following order of binary representations 1 11 110 1100 10 100 0 in sequence.
So, their corresponding decimal values 13 6 12 24 0 are printed as output.

Example Input/Output 2:
Input: 7
Output: 
1 3 7

------------------------CODE-----------------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  n=sc.nextInt();
		if(n==1) return 1;
		StringBuilder sb=new StringBuilder();
		int temp=n;
		while(temp>0)
		{
		    sb.append(String.valueOf(temp%2));
		    temp/=2;
		}
		String s=sb.reverse().toString();
		Set<Integer> se=new LinkedHashSet<>();
		for(int i=0;i<s.length()-1;i++)
		{
		    for(int j=i;j<s.length();j++)
		    {
		        int sum=0;
		        StringBuilder sb1=new StringBuilder();
		        for(int k=i;k<=j;k++)
		        {
		          sb1.append(s.charAt(k));
		        }
    		    String s2=sb1.toString();
    		    for(int l=0,k=s2.length()-1;k>=0;l++,k--)
    		    {
    		        sum+=Math.pow(2,l)*(s2.charAt(k)-'0');
    		    }
    		    se.add(sum);
		    }
		}
		for(int l:se)
		{
		    System.out.print(l+" ");
		}
	}
}

---Time Complexity :  O(m^3), where m ≈ log2 n.
---Space Complexity :  O(m^2), worst case.
