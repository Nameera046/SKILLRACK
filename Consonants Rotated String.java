Consonants Rotated String

The program must accept the value of a string S and an integer N as input. 
The program must rotate the consonants (anti-clockwise direction) in the string by N times. Finally, the program must print the rotated string as the output.

Boundary Condition(s):
2 <= Length of String S <= 1000 1 <= N <= 50

Input Format:
The first line contains the value S and value of N separated by a space.
Output Format:
The first line contains the rotated string.

Example Input/Output 1:
Input:
aabaajaaks 2
Output: aakaasaabj

Example Input/Output 2:
Input:
helloworld 5
Output: 
ledhololwr

-----------------------------------------------------CODE----------------------------------------------------------

import java.util.*;
public class Hello 
{
    public static boolean isconstant(char ch)
    {
        if(ch!='a'&& ch!='A'&& ch!='e'&& ch!='E' && ch!='i' && ch!='I' && ch!='o' && ch!='O' && ch!='u' && ch!='U')
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		String str=sc.next();
    		int n=sc.nextInt();
    		StringBuilder sb=new StringBuilder();
    		for(int i=0;i<str.length();i++)
    		{
    		    if(isconstant(str.charAt(i)))
    		    {
    		        sb.append(str.charAt(i));
    		    }
    		}
    		char[] cons=sb.toString().toCharArray();
    		while(n>0)
    		{
    		    char temp=cons[0];
    		    int i=1;
    		    for(i=1;i<cons.length;i++)
    		    {
    		        cons[i-1]=cons[i];
    		    }
    		    cons[i-1]=temp;
    		    n--;
    		}
    		char[] s=str.toCharArray();
    		int k=0;
    		for(int i=0;i<str.length();i++)
    		{
    		    if(isconstant(str.charAt(i)))
    		    {
                    s[i]=cons[k++];
    		    }
    		}
    		for(int i=0;i<s.length;i++)
    		{
    		    System.out.print(s[i]);
    		}
  	}
}

-----Time Complexity : O(len(str))
-----Space Complexity : O(len(str))
