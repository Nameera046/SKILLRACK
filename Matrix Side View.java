Matrix Side View

The program must accept a character matrix of size R*C and a character X as input. 
If the character X is L or I, then the program must print the first alphabet in each row when traversing from left to right. 
Else if the character X is R or r, then the program must
print the first alphabet in each row when traversing from right to left.
Note: At least one alphabet will be present in each row.

Boundary Condition(s):
2 <= R, C <= 100

Input Format:
The first line contains the value of R and C separated by a space.
The next R lines contain C characters each separated by space(s).
The R+2th line contains the character X.
Output Format:
The first line contains R characters.

Example Input/Output 1:
Input:
4 6
e-y-rk
-xi---
---atq
-m--pa
L

Output:
exam

------------------------------code---------------------------------------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		int m=sc.nextInt(),n=sc.nextInt();
    		char[][] ch=new char[m][n];
    		for(int i=0;i<m;i++)
    		{
    		    for(int j=0;j<n;j++)
    		    {
    		        ch[i][j]=sc.next().charAt(0);
    		    }
    		}
    		char k=sc.next().charAt(0);
        if(k=='L'||k=='l')
        {
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(Character.isLetter(ch[i][j]))
                    {
                        sb.append(ch[i][j]);
                        break;
                    }
                }
            }
            System.out.print(sb.toString());
        }
        else if(k=='R'||k=='r')
        {
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<m;i++)
            {
                for(int j=n-1;j>=0;j--)
                {
                    if(Character.isLetter(ch[i][j]))
                    {
                        sb.append(ch[i][j]);
                        break;
                    }
                }
            }
            System.out.print(sb.toString());
        }
  	}
}

----Time Complexity : O(mn)
----Space Complexity : O(mn)
