Tap Code Decryption

The program must accept a string S and a character matrix of size 5*5 as the input. 
The string S represents a tap code that contains dots and space characters. 
The 5*5 matrix represents the tap code table which contains 26 unique lower case alphabets, where exactly one cell contains two alphabets separated by a slash symbol (/). 
The program must decrypt the given tap code and find the string value using the given tap code table. 
Every pair of groups of dots in the string S represents the row and column position of an alphabet in the tap code table. 
Finally, the program must print the decrypted string value as the output. 
The program must consider the alphabet on the left side of the slash symbol when decrypting the tap code.

Boundary Condition(s):
1 <= Number of pairs of groups of dots 100

Input Format:
The first line contains S.
The next 5 lines contain the character matrix representing the tap code table.

Output Format:
The first line contains the decrypted string value.

Example Input/Output 1:
Input:
a b c/k d e
f g h i j 
I m n o p 
q r s t u 
v w x y z
Output: 
store
Explanation:
1st pair of groups of dots: It represents the position (4, 3). So the alphabet is s.
2nd pair of groups of dots: It represents the position (4, 4). So the alphabet is t.
3rd pair of groups of dots: It represents the position (3, 4). So the alphabet is o.
4th pair of groups of dots: It represents the position (4, 2). So the alphabet is r.
5th pair of groups of dots:..... It represents the position (1, 5). So the alphabet is e.

Example Input/Output 2: 
Input:
a b c d e 
f g h i j 
I m n o p 
q/k r s t u 
v w x y z
Output: 
question

package Skillrack;
import java.util.*;
public class Tap_Code_decriptions 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[][] mat=new String[5][5];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				mat[i][j]=sc.next();
			}
		}
		List<Integer> l=new ArrayList<>();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				l.add(count);
				count=0;
			}
			else
			{
				count++;
			}
		}
		l.add(count);
		String result="";
		for(int i=0;i<l.size()-1;i+=2)
		{
			int r=l.get(i)-1;
			int c=l.get(i+1)-1;
            result=result+mat[r][c].charAt(0);
		}
		System.out.print(result);
	}
}

-- Time Complexity : O(n)
-- Space Complexity : O(n)
