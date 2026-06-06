String Triangle Pattern

Accept an integer N and a string S as input. The program must print the last N characters of each word of S in the desired pattern 
as shown in the Example Input/Output section.
Note
Each word in S contains more than N characters.
If there is no word to fill the pattern then use *.

Boundary Condition(s):
2 <= N <= 10
Length of the string S is between 1 and 1000.

Input Format:
The first line contains the integer N.
The second line contains the string S.
Output Format:
The list of lines contain the last N characters in the desired pattern.

Example Input/Output 1:
Input:
3 
apple mango orange
Output:
ple 
ngo nge

Example Input/Output 2:
Input:
2 
ask happy word letter king
Output: 
sk
py rd
er ng **
Explanation:
The last 2 characters of the first word in S is "sk".
The first line of the output must contain one word. So, "sk" is printed.
The last 2 characters of the second and third word are "py" and "rd".
The second line of the output must contain two words separated by space(s). So, "py" and "rd" printed.
The last 2 characters of the fourth and fifth word are "er" and "ng".
The third line of the output must contain three words separated by space(s). But here, there are two words only. So, "er" and "ng" is printed.
Then, for the third word "**" is printed.

--------------------------CODE---------------------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		String[] str=s.trim().split("\\s+");
        String[] res=new String[str.length];
		for(int i=0;i<str.length;i++)
		{
		    res[i]=str[i].substring((str[i].length()-n));
		}
		int row=0,total=0;
		while(total<res.length)
		{
		    row++;
		    total+=row;
		}
		int k=0,j=0;
		for(int i=0;i<row;i++)
		{
		    for(j=0;j<=i;j++)
		    {
		        if(k<res.length)
		        {
		             System.out.print(res[k++]+" ");
		        }
		        else
		        {
		            for(int a=0;a<n;a++)
		            {
		                System.out.print("*");
		            }
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
	}
}

-----Time Complexity : O(W)
-----Space Complexity : O(W)
