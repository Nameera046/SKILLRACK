String Circular Print

A string S and an integer N is passed as input.
The program must traverse and print N alphabet letters in the string circularly.
Note: All the alphabets in the string S is only in lowercase.

Boundary Condition(s):
2 Length of String <= 1000

Input Format:
The first line contains the string S.
The second line contains N.
Output Format:
The first line contains the N alphabet letters.

Example Input/Output 1:
Input:
hello
7
Output:
hellohe

Example Input/Output 2:
Input:
yum
7
Output:
yumyumy

-------CODE----------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
		StringBuilder sb=new StringBuilder(s);
		while(sb.length()<n)
		{
		    sb.append(s);
		}
		System.out.print(sb.substring(0,n));
	}
}

---Time Complexity : O(n)
---Space Complexity : O(n)
