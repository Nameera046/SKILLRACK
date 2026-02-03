String Ladder Pattern

The program must accept two string values S1, S2 and an integer N as the input. The program must print the string ladder pattern based on the following conditions.
- The ladder must have N rungs, where each rung must be formed by the string S2.
- The rungs must be evenly spaced apart.
- The two rails of the ladder must be formed by the string S1 and the reverse of S1 alternatively as show in the Example Input/Output section.
The asterisks must be printed instead of the empty spaces in the string ladder pattern.
Note: The first and last characters of S1 and S2 are always same.

Boundary Condition(s):
5 Length of S1, S2 <= 100 1 N100

Input Format:
The first line contains S1.
The second line contains S2.
The third line contains N.

Output Format:
The lines contain the string ladder pattern as shown in the Example Input/Output section.

Example Input/Output 1:
Input:
classic
cryptic 
2
Output:
c * * * * * c 
l * * * * * l 
a * * * * * a 
s * * * * * s 
s * * * * * s 
i * * * * * i 
c r y p t i c 
i * * * * * i 
s * * * * * s 
s * * * * * s 
a * * * * * a 
l * * * * * l 
c r y p t i c 
l * * * * * l 
a * * * * * a 
s * * * * * s 
s * * * * * s 
i * * * * * i 
c * * * * * c 
Explanation:
Here S1 = classic, S2 = cryptic and N = 2. So the ladder has 2 rungs.
Each rung of the ladder is formed using the string S2.
The two rails of the ladder are formed using the string S1, reverse of S1 and S1.

Example Input/Output 2:
Input:
level 
label 
3
Output:
l * * * l 
e * * * e 
v * * * v 
e * * * e 
l a b e l 
e * * * e 
v * * * v 
e * * * e 
l a b e l 
e * * * e 
v * * * v 
e * * * e 
l a b e l 
e * * * e 
v * * * v 
e * * * e 
l * * * l 

-------CODE-------

package Skillrack;
import java.util.*;
public class String_ladder_pattern 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int a=sc.nextInt();
		int m=s1.length()*(a+1)-a;
		int n=s2.length();
		int k=0;
		char[][] mat=new char[m][n];
		StringBuilder sb=new StringBuilder();
		sb.append(s1);
		for(int i=0;i<m;i++)
		{
			if(i!=0 && i%(s1.length()-1)==0 && i!=m-1)
			{
				for(int j=0;j<n;j++)
				{
					mat[i][j]=s2.charAt(j);
				}
				k++;
				if(i%(s1.length()-1)==0)
				{
					sb.reverse();
					k=1;
				}
			}
			else 
			{
				for(int j=0;j<n;j++)
				{
					if(j==0 || j==n-1)
					{
						mat[i][j] = sb.charAt(k%sb.length());
					}
					else
					{
						mat[i][j]='*';
					}
				}
				k++;
				if(i!=0 && i%(s1.length()-1)==0)
				{
					sb.reverse();
					k=1;
				}
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}

// --Time Complexity: O(m * n) - Initializing the 2D character array 'mat' of size m x n: O(m * n)
// --Space Complexity: O(m * n) - The character matrix 'mat' of size m x n: O(m * n)
