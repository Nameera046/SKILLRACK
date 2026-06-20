Longest Common Prefix.

The program must accept N string values as input. 
The program must print the longest common prefix string among N string values as the output. If there is no common prefix string then 
the program must print -1 as the output.

Boundary Condition(s):
2 <= N <= 1000
1 <= Length of each string <= 100

Input Format:
The first line contains the value of N.
The next N lines contain a string in each line.
Output Format:
The first line contains either the longest common prefix string among N string values or -1.

Example Input/Output 1:
Input:
4
encages
encrypt
envelop
environment
Output:
en
Explanation:
encages
encrypt
envelop
environment
The longest common prefix string is en.
Hence the output is en

Example Input/Output 2:
Input:
3
flower
lower
flyover
Output:
-1

-------------------------CODE------------------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] str=new String[n];
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
		    str[i]=sc.nextLine();
		    if(str[i].length()<min)
		    {
		        min=str[i].length();
		    }
		}
		int j;
		int finalflag=0;
		StringBuilder sb=new StringBuilder();
        for(int i=0;i<min;i++)
        {
            int flag=0;
            for(j=1;j<n;j++)
            {
                if(str[j].charAt(i)!=str[j-1].charAt(i))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                finalflag=1;
                sb.append(str[j-1].charAt(i));
            }
            else if(flag==1 && finalflag==0)
            {
                System.out.print("-1");
                break;
            }
        }
        System.out.print(sb.toString());
	}
}

----Time Complexity : O(m*n)
----Space Complexity : O(l)  => l represents the length of the stringBuilder.
