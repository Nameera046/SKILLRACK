Print Xth Number that can be formed with digits in N

The program must accept two integers N and X as input. 
The program must print the Xth number from 1 which can be formed using the digits in N. 
If there is no Xth number then the program must print -1 as the output.

Boundary Condition(s): 1 <= N, X <= 999999999

Input Format:
The first line contains the value of N.
The second line contains the value of X.
Output Format:
The first line contains the Xth number or -1.

Example Input/Output 1:
Input:
231
9
Output: 32
Explanation:
The N = 123 forms the sequential order of numbers are 1 2 3 12 13 21 23 31 32 123 132 213 231 312 321.
Then, the 9th number in the sequence is 32.
So, 32 is printed as the output.

Example Input/Output 2:
Input:
100 4
Output: -1
Explanation:
The N = 100 forms the sequential order of numbers are 1 10 100.
Hence there is no 4th number.
SO, -1 is printed as the output.

-----------------------------CODE------------------------------

import java.util.*;
public class Hello 
{
    static TreeSet<Long> s=new TreeSet<>();
    static void generate(char[] arr, boolean[] used,String c)
    {
        if(c.length()>0)
        {
            s.add(Long.parseLong(c));
        }
        for(int i=0;i<arr.length;i++)
        {
            if(used[i])
            {
                continue;
            }
            if(c.length()==0 && arr[i]=='0')
            {
                continue;
            }
            used[i]=true;
            generate(arr,used,c+arr[i]);
            used[i]=false;
        }
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int x=sc.nextInt();
		char[] arr=n.toCharArray();
		boolean[] used=new boolean[arr.length];
		generate(arr,used,"");
		if(x>s.size())
		{
		    System.out.print(-1);
		    return;
		}
		int count=1;
		for(long num:s)
		{
		    if(count==x)
		    {
		        System.out.print(num);
		        return;
		    }
		    count++;
		}
	}
}

----Time Complexity : O(n!) in worst case.
----Space Complexity : O(n! · n) in the worst case.
