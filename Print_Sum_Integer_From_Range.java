// Print Sum Integer From Range

// The program must accept N ranges as the input. For each range X-Y, the program must form an integer by concatenating the digits from X to Y. 
// Then the program must print the sum of those N integers as the output.
  
// Boundary Condition(s):
// 2<= N <= 100 0 <= X, Y <= 9
  
// Input Format:
// The first line contains N.
// The second line contains N ranges separated by a space.
// Output Format:
// The first line contains an integer representing the sum of the N resulting integers.
  
// Example Input/Output 1:
// Input:
// 3
// 5-9 2-0 7-9
// Output: 57788
// Explanation:
// 5-9 => 56789
// 2-0 => 210
// 7-9 => 789
// 56789+210+789=57788.
  
// Example Input/Output 2:
// Input:
// 4
// 0-99-05-11-5
// Output: 10000066665

CODE:

package PrintSumIntegerFromRange;
import java.util.*;

public class printsumIntegerFromrange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine(); 
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.nextLine();
		}

		long sum=0;
		for(int i=0;i<n;i++)
		{
			int x=str[i].charAt(0)-'0';
			int y=str[i].charAt(2)-'0';
			StringBuilder sb=new StringBuilder();
			if(x<y)
			{
				for(int j=x;j<=y;j++)
				{
					sb.append(String.valueOf(j));
				}
			}
			else if(x>y)
			{
				for(int j=x;j>=y;j--)
				{
					sb.append(String.valueOf(j));
				}
			}
			String s=sb.toString();
			Long num=Long.parseLong(s);
			sum+=num;
		}
		System.out.println(sum);
	}
}
