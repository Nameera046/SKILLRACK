Group Words - Combinations

The program must accept a string 5 containing multiple words as the input. 
The program must group the words where each word is a combination of the other words. 
Then the program must print the groups of words in separate lines in the order of their occurrence.

Boundary Condition(s):
3 <= Length of S <= 1000
Input Format:
The first line contains S.
Output Format:
The lines contain the groups of words separated by a space based on the given conditions.

Example Input/Output 1:
Input:
neon nose ones race none noes care
Output:
neon none
nose ones noes
race care
Explanation:
Here S = "neon nose ones race none noes care".
1st group: neon none
2nd group: nose ones noes
3rd group: race care
In each group, each word is a combination of the other words in the group.
Hence the output is
neon none
nose ones noes
race care

Example Input/Output 2:
Input:
seven oil evens lio smart loi skill
Output:
seven evens
oil lio loi
smart
skill

package Skillrack;
import java.util.*;
public class Group_Word_Combinations 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String[] str=sc.nextLine().split(" ");
		List<String> l=new ArrayList<>();
		for(int i=0;i<str.length;i++)
		{
			l.add(str[i]);
		}
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)+" ");
			char[] c1=l.get(i).toCharArray();
			Arrays.sort(c1);
			l.remove(i);
			i--;
			for(int j=i+1;j<l.size();)
			{
				char[] c2=l.get(j).toCharArray();
				Arrays.sort(c2);
				if(Arrays.equals(c1,c2))
				{
					System.out.print(l.get(j)+" ");
					l.remove(j);
				}
				else
				{
					j++;
				}
			}
			System.out.println();
		}
	}
}

//Time Complexity : O(n^2)
//Space Complexity : O(n)

