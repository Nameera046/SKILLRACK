// Increment/Decrement - Find Sum

// The program must accept N string values representing N integers as the input. Each integer may or may not have an increment operator or a decrement operator. 
// The program must increment or decrement the values of the integers by 1 based on the operator. Finally, the program must print the sum of N resulting integers as the output.
// Boundary Condition(s):
// 1 <= N <= 100
// -10^6 <= Each integer value <= 10^6

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.
// Output Format:
// The first line contains an integer representing the sum of the N resulting integer values.

// Example Input/Output 1:
// Input:
// 4++ 3 2-- 10++ 15
// Output:
// 35
// Explanation:
// 4++ => 5
// 2-- => 1
// 10++ => 11
// The revised integer values are 5, 3, 1, 11 and 15.
// The sum of the revised integer values is 35.

// Example Input/Output 2:
// Input:
// 4
// -5++ -6-- 5++ 7--
// Output:
// 1

CODE:

package Increment_Decrement_find_Sum;
import java.util.*;
public class increment_decrement_find_sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    sc.nextLine();
	    int sum=0;
	    String[] str = sc.nextLine().split(" ");
	    for(int i=0;i<n;i++)
	    {
	        int increment=0,decrement=0;
	    	for(int j=str[i].length()-1;j>=str[i].length()-2;j--)
	    	{
	    		if(str[i].charAt(j)=='+')
	    		{
	    			increment++;
	    		}
	    		else
	    		{
	    			decrement++;
	    		}
	    	}
	    	int a=0;
	    	StringBuilder sb=new StringBuilder();
	    	if(str[i].length()>2)
	    	{
	    		for(int j=0;j<str[i].length()-2;j++)
	    		{
	    			sb.append(str[i].charAt(j));
	    		}
	    		if(increment==2)
	    		{
	    			a=Integer.parseInt(sb.toString());
	    			a++;
	    		}
	    		else if(decrement==2)
	    		{
	    			a=Integer.parseInt(sb.toString());
	    			a--;
	    		}
	    		else
	    		{
	    			a=Integer.parseInt(sb.toString());
	    		}
	    	}
	    	else
	    	{
	    		sb.append(str[i]);
	    		a=Integer.parseInt(sb.toString());
	    		
	    	}
	    		sum+=a;
	    }
	    System.out.println(sum);
	}
}
