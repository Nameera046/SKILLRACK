Digits Asterisks Pattern

The program must accept a string S containing only digits as the input. 
The program must print the digits in the string S based on the following conditions.
- The digits of the same value must be printed on the same line.
- The values of the digits must be printed in the order of their occurrence.
- The empty spaces in each row must be printed as asterisks.

Boundary Condition(s): 1 <= Length of S = 100
Input Format: The first line contains S.
Output Format:
The lines contain the digits and asterisks based on the given conditions.

Example Input/Output 1:
Input:
1225644789964
Output:
1**
22*
5**
66*
444
7**
8**
99*
Example:
Here S 1225644789964.
1 occurs one time.
2 occurs two times.
5 occurs one time.
6 occurs two times.
4 occurs three times.
7 occurs one time.
8 occurs one time.
9 occurs two times.

Example Input/Output 2:
Input:
1234567
Output:
1
2
3
4
5
6
7

package Skillrack;
import java.util.*;
public class DigitAsterisksPattern 
{
    public static void digitAsteriksPrint(LinkedHashMap<Character,Integer>h)
    {
        int max=0;
        for(Map.Entry<Character,Integer> entry:h.entrySet())
        {
            if(entry.getValue()>max)
            {
                max=entry.getValue();
            }
        }
        for(Map.Entry<Character,Integer> entry:h.entrySet())
        {
            for(int i=0;i<entry.getValue();i++)
            {
                System.out.print(entry.getKey()+" ");
            }
            if(entry.getValue()<max)
            {
                int temp=max;
                while(entry.getValue()<temp)
                {
                    System.out.print("* ");
                    temp--;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		LinkedHashMap<Character,Integer> h=new LinkedHashMap<>();
		for(int i=0;i<str.length();i++)
		{
		    char ch=str.charAt(i);
		    h.put(ch,h.getOrDefault(ch,0)+1);
		}
		digitAsteriksPrint(h);
	}
}

--Time complexity: O(n^2) in the worst case due to pattern printing.
--Space complexity: O(n) for storing character counts.
