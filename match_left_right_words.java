Match Left and Right Words

The program must accept two string values S1 and S2 as the input. The string S1 contains the left part of certain words and the string S2 contains the right part of 
the same words in any order. The right part of each word starts with the last letter of the left part of the corresponding word. For each left part in S1, 
the program must find the right part from S2 and print the original word by combining the left and right parts. If two or more right parts in S2 match the same left part, 
then consider the first occurring right part in S2.
Boundary Condition(s):
2 Length of S1, S2 <= 1000
Input Format:
The first line contains S1.
The second line contains S2.
Output Format:
The first line contains the words separated by a space based on the given conditions.

Example Input/Output 1:
Input:
char sc pineapp remot
creen te rger ple
Output:
charger screen pineapple remote
Explanation:
char+rger charger
sc + creen = screen
pineapp + ple = pineapple
remot + te = remote

Example Input/Output 2:
Input:
lemo yello wo 
on ow orld
Output:
lemon yellow world
Explanation:
lemo->on lemon
yello->ow yellow
wo->orld world

CODE:

package Skillrack;
import java.util.*;
public class matchleftandRigthWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] s1=sc.nextLine().split(" ");
		String[] s2=sc.nextLine().split(" ");
		String[] str=new String[s1.length+1];
		int j=0;
		for(String s:s1)
		{
			StringBuilder sb=new StringBuilder();
			for(String k:s2)
			{
				if(s.charAt(s.length()-1)==k.charAt(0))
				{
					sb.append(s.substring(0,s.length()-1)).append(k);
					str[j++]=sb.toString();
					break;
				}
			}
		}
		for(int i=0;i<j;i++)
		{
			System.out.print(str[i]+" ");
		}
	}

}

//Time Complexity - O(n*m)
//-Space Complexity - O(n*k)
