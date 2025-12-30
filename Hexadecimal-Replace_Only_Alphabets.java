Hexadecimal - Replace Only Alphabets

The program must accept N hexadecimal values as the input. For each hexadecimal value H,
  the program must replace each alphabet with the corresponding decimal value in H. 
  Then the program must print the sum of the N revised values by considering them as decimal values.

Boundary Condition(s):
1<=N<=100
1 <= Decimal equivalent of H <= 10^6

Input Format:
The first line contains N.
The second line contains N hexadecimal values separated by a space.
Output Format:
The first line contains an integer representing the sum of the N revised values based on the given conditions.
  
Example Input/Output 1:
Input:
4
5FA 34B C10 529
Output: 
56660

Explanation:
5FA -> 51510 
  34B -> 3411
  C10 -> 1210 
  529 -> 529 
  51510+3411+1210+529 = 56660.

Example Input/Output 2:
Input:
3
ABCD 1234 EF
Output: 
10113862

Explanation:
ABCD -> 10111213 
1234 -> 1234
EF -> 1415 
10111213 +1234+1415 10113862.

CODE:

package Skillrack;
import java.util.*;

public class Hexadecimal_Replace_Only_Alphabets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			String str=sc.next().trim();
			StringBuilder sb=new StringBuilder();
			for(char ch:str.toCharArray())
			{
				if(Character.isDigit(ch))
				{
					sb.append(ch);
				}
				else
				{
					sb.append(ch-'A'+10);
				}
			}
			sum+=Integer.parseInt(sb.toString());
		}
		System.out.print(sum);
	}
}

//-Time Complexity - O(n*m)
//-Space Complexity - O(m);
