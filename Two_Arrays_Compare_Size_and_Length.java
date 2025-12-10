Two arrays - comare size and Length
  
The program must accept two integer arrays Al and A2 as the input. The program must print YES if both arrays have the same size and the same digits used to form integers. Else the program must print NO as the output. Then the program must print the sum of integers in the arrays A1 and A2 as the output.
Note: The maximum size of both arrays Al and A2 is 100.
Boundary Condition(s):
1 Each integer value <= 10^8
Input Format:
The first line contains integer values separated by a space representing the array Al.
The second line contains integer values separated by a space representing the array A2.
Output Format:
The first line contains YES or NO.
The second line contains the sum of integers in the arrays Al and A2 separated by a space only if YES is printed.
  
Example Input/Output 1:
Input:
12 801 6 8100 88 61000 1 21
Output:
YES 8919 61110
Explanation:
Both arrays A1 and A2 have an equal size 4.
The same digits are used in both arrays.
So YES is printed as the output
The sum of integers in A1 is 8919.
The sum of integers in A2 is 61110.

Example Input/Output 2:
Input: 
16 98 12 98 456 21 12 456 9898 16 21
Output: 
NO
  
Example Input/Output 3:
Input: 
71 571 757 71
Output: 
NO
Explanation:
Both arrays Al and A2 have an equal size 2.
The 2 integers in Al are formed using two 7s, two Is and one 5.
The 2 integers in A2 are formed using three 7s, one 1 and one 5.
Hence NO is printed as the output.

CODE:

  package Skillrack;
import java.util.*;
public class Two_Array_Compae_Size_and_digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String[] s1=str1.split(" ");
		String[] s2=str2.split(" ");
		if(s1.length==s2.length)
		{
			StringBuilder sb1=new StringBuilder();
			StringBuilder sb2=new StringBuilder();
			for(int i=0;i<s1.length;i++)
			{
				sb1.append(s1[i]);
			}
			String ssb2=sb1.toString();
			for(int i=0;i<s2.length;i++)
			{
				sb2.append(s2[i]);
			}
			String ssb1=sb2.toString();
			String[] ss1=ssb1.split("");
			String[] ss2=ssb2.split("");
			if(sb1.length()==sb2.length() &&(Arrays.toString(ss1).equals(Arrays.toString(ss2))))
			{
				System.out.println("YES");
				int sum1=0,sum2=0;
				for(int i=0;i<s1.length;i++)
				{
					sum1+=Integer.parseInt(s1[i]);
				}
				for(int i=0;i<s2.length;i++)
				{
					sum2+=Integer.parseInt(s2[i]);
				}
				System.out.println(sum1+" "+sum2);
			}
			else
			{
				System.out.println("NO");
			}
		}
		else
		{
			System.out.println("NO");
		}
	}

}

Time Complexity : O(n)
Space Complexity : O(n)
