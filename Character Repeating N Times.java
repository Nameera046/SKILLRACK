Character Repeating N. Times

A string S and an integer N are passed as input.
The program must print the characters occurring exactly N times in the order of their occurrence.

Boundary Condition(s):
1<= N < 100
1 <= Length of String <= 1000

Input Format:
The first line contains the string and N value separated by space(s).
Output Format:
The first line contains the specified output.

Example Input/Output 1:
Input:
attack 2
Output:
at

Example Input/Output 2:
Input:
implementation 2
Output:
iment

---------CODE-----------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=sc.nextInt();
		sc.nextLine();
		Map<Character,Integer> h=new LinkedHashMap<>();
		for(int i=0;i<str.length();i++)
		{
		    char ch=str.charAt(i);
		    h.put(ch,h.getOrDefault(ch,0)+1);
		}
		for(Map.Entry<Character,Integer> entry:h.entrySet())
		{
		    if(entry.getValue()==n)
		    {
		        System.out.print(entry.getKey());
		    }
		}
	}
}
