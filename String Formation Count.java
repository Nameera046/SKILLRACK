String Formation Count

The program must accept two string values of S1 and S2 as the input. 
The program must print the number of times S2 can be formed using the alphabets from S1.

Boundary Condition(s):
2 <= Length of String S1 <= 1000
2 <= Length of String S2 <= 100

Input Format:
The first line contains the value of string S1.
The second line contains the value of string S2.

Output Format:
The first line contains the number of times the string S2 can be formed with the alphabets from the string S1.

Example Input/Output 1:
Input:
hheelloojhsell hello
Output: 2
Explanation:
h is repeated 3 times.
e is repeated 3 times.
I is repeated 4 times.
o is repeated 2 times.
So, hello can be formed 2 times from the string hheelloojhsell.

Example Input/Output 2:
Input:
he rides cycle
he
Output: 
1

--------------------------CODE--------------------------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		String s1=sc.nextLine();
    		String s2=sc.nextLine();
    		HashMap<Character,Integer> c1=new HashMap<>();
    		HashMap<Character,Integer> c2=new HashMap<>();
    		for(char ch: s1.toCharArray())
    		{
    		    c1.put(ch,c1.getOrDefault(ch,0)+1);
    		}
    		for(char ch: s2.toCharArray())
    		{
    		    c2.put(ch,c2.getOrDefault(ch,0)+1);
    		}
    		int ans=Integer.MAX_VALUE;
    		for(char ch: c2.keySet())
    		{
    		    ans=Math.min(ans,c1.getOrDefault(ch,0)/c2.get(ch));
    		}
    		System.out.println(ans);
    	}
  }

--- Time complexity: O(n + m)
--- Space complexity: O(k + l)
