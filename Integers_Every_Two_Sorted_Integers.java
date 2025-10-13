Integers Every Two Sorted Integers.

The program must accept N unique integers as the input. The program must print N-1 lines of output based on the following conditions.
- In the 1st line, the program must print the integers from the smallest integer to the second smallest integer.
- In the 2nd line, the program must print the integers from the second smallest integer to the third smallest integer.
- In the 3rd line, the program must print the integers from the third smallest integer to the fourth smallest integer.
Similarly, the program must print the integers in the remaining lines as the output.
Boundary Condition(s):
2 N 100
1 Each integer value <= 10^5
Input Format:
The first line contains N.
The second line contains N integer values separated by a space.
Output Format:
The first N-1 lines, each contains the integer values separated by a space.
  
Example Input/Output 1:
Input:
5
30 50 10 20 40
Output:
10 20
20 10 50 30
30 50 10 20 40
40 20 10 50
Explanation:
1st line: The integers from the smallest integer to the second smallest integer are printed. 10 20
2nd line: The integers from the second smallest integer to the third smallest integer are printed. 20 10 50 30
3rd line: The integers from the third smallest integer to the fourth smallest integer are printed. 30 50 10 20 40
4th line: The integers from the fourth smallest integer to the fifth smallest integer are printed.
40 20 10 50

Example Input/Output 2:
Input:
8
75 60 16 67 99 64 19 87
Output:
16 67 99 64 19
19 64 99 67 16 60
60 16 67 99 64
64 99 67
67 16 60 75
75 60 16 67 99 64 19 87
87 19 64 99

CODE:

import java.util.*;
public class integer_Every_tow_sorted_integer 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] arr1=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			arr1[i]=arr[i];
		}
		Arrays.sort(arr1);
		int a=0,b=a+1,aindex=0,bindex=0,k=0;
		String[] str=new String[n-1];
		int z=0;
		while(k<n-1)
		{
			for(int i=0;i<n;i++)
			{
				if(arr1[a]==arr[i])
				{
					aindex=i;
				}
				else if(arr1[b]==arr[i])
				{
					bindex=i;
				}
			}
			StringBuilder sb=new StringBuilder();
			if(aindex>bindex)
			{
				for(int m=aindex;m>=bindex;m--)
				{
					sb.append(arr[m]).append(" ");
				}
			}
			else if(aindex<bindex)
			{
				for(int m=aindex;m<=bindex;m++)
				{
					sb.append(arr[m]).append(" ");
				}
			}
			str[z++]=sb.toString();
			a++;
			b++;
			k++;
		}
		for(int i=0;i<k;i++)
		{
			System.out.println(str[i]);
		}
	}
}

// Time Complexity: O(n^2)
// Space Complexity: O(n)
