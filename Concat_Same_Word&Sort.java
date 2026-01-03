Concat Same Words & Sort

The program must accept a string S containing multiple words in lower case as the input. The program must concatenate the words in S based on the following conditions.
- If two words are same in the given string, then the program must concatenate those words as a single word.
- After concatenating all possible words, then the program must print the words in sorted order.

Boundary Condition(s): 3 <= Length of S <= 1000
Input Format:
The first line contains S.
Output Format:
The first line contains the words separated by a space based on the given conditions.

Example Input/Output 1:
Input:
cat code cat code moon earth cat
Output:
cat catcat codecode earth moon
Explanation:
catcat= catcat
code code = codecode
So the words [catcat, codecode, moon, earth, cat] are printed in sorted order.

Example Input/Output 2:
Input:
xyz a b c c d e e e a b xyz
Output:
aa bb cc d e ee xyzxyz
Max Execution Time Limit: 50 millisecs

CODE : 

package Skillrack;
import java.util.*;
public class concate_Same_word_and_sort 
{
	public static void main(String[] args) 
  {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] s1=str.split(" ");
		Arrays.sort(s1);
		String[] s2=new String[s1.length];
		int k=0;
		boolean[] used = new boolean[s1.length];
		for (int i = 0; i < s1.length; i++) 
		{
		    if (used[i]) continue;
		    int count = 1;
		    used[i] = true;
		    for (int j = i + 1; j < s1.length; j++) 
		    {
		        if (!used[j] && s1[i].equals(s1[j])) 
		        {
		            count++;
		            used[j] = true;
		        }
		    }
		    if (count % 2 == 1) 
		    {
		        s2[k++] = s1[i];
		    }
		    for (int p = 0; p < count / 2; p++) 
		    {
		        s2[k++] = s1[i] + s1[i];
		    }
		}
		for(int i=0;i<k;i++)
		{
			System.out.print(s2[i]+" ");
		}
	}
}

-Time Complexity : O(m^2)
- Space Complexity : O(m)

Optimised code package Skillrack;
import java.util.*;

public class concate_Same_word_and_sort 
{
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s1 = str.split(" ");
        Arrays.sort(s1);
        int i = 0;
        while (i < s1.length) 
        {
            int count = 1;
            while (i + count < s1.length && s1[i].equals(s1[i + count])) 
            {
                count++;
            }
            if (count % 2 == 1) 
            {
                System.out.print(s1[i] + " ");
            }
            for (int p = 0; p < count / 2; p++) 
            {
                System.out.print(s1[i] + s1[i] + " ");
            }
            i += count;
        }
    }
}

-Time Complexity : O(m)
- Space Complexity : O(1)
