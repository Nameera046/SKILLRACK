Three Digits - Balanced Pattern

The program must accept three string values S1, S2 and S3 of equal length as the input. 
  All three string values contain only nonzero digits. In the given three string values, the sum of the digits that occur in 
  the same position is always equal to 9. For each digit D1, D2 and D3 of the three string values, the program must print D1 asterisks, 
  D2 hyphens and D3 asterisks vertically as shown in the Example Input/Output section.
  
Boundary Condition(s):
1 <= Length of S1, S2, S3 <= 100
Input Format:
The first line contains S1.
The second line contains S2.
The third line contains S3.
Output Format:
The first nine lines contain the asterisks and hyphens based on the given conditions.

Example Input/Output 1:
Input:
2134
5212
2653
Output:
****
*-**
--**
-*-*
-**-
-**-
-***
****
****
Explanation:
Here S1=2134, S2-5212, S3-2653.
The first digit in the three string values are 2, 5 and 2. So 2 asterisks, 5 hyphens and 2 asterisks are printed vertically in the first column.
The second digit in the three string values are 1, 2 and 6. So 1 asterisk, 2 hyphens and 6 asterisks are printed vertically in the second column.
The third digit in the three string values are 3, 1 and 5. So 3 asterisks, 1 hyphen and 5 asterisks are printed vertically in the third column.
The fourth digit in the three string values are 4, 2 and 3. So 4 asterisks, 2 hyphens and 3 asterisks are printed vertically in the fourth column.

Code:

package Skillrack;
import java.util.*;
public class Three_digit_Balanced_Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String d1=sc.nextLine(),d2=sc.nextLine(),d3=sc.nextLine();
		int j=0;
		String[][] mat=new String[100][100];
		for(int k=0;k<d1.length();k++)
		{
			j=0;
			int a=d1.charAt(k)-'0';
			for(int i=0;i<a;i++)
			{
				mat[k][j++]="*";
			}
			int b=d2.charAt(k)-'0';
			for(int i=0;i<b;i++)
			{
				mat[k][j++]="-";
			}
			int c=d3.charAt(k)-'0';
			for(int i=0;i<c;i++)
			{
				mat[k][j++]="*";
			}
		}
		for(int m=0;m<j;m++)
		{
			for(int i=0;i<d1.length();i++)
			{
			     System.out.print(mat[i][m]);
			}
			System.out.println();
		}
	}

}

Time Complexity: O(m*n)
Space Complexity: O(m*n)
