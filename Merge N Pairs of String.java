Merge N Pairs of String

The program must accept an integer N and N pairs of strings. 
Then the program must merge every pair of strings and print the merged string.

Boundary Condition(s):
2 <= N <= 100
1 <= Length of String <= 1000

Input Format:
The first line contains N.
The next N lines contain two strings each.
Output Format:
The first N lines contain the merged strings.

Example Input/Output 1:
Input:
2
good bye
take care
Output:
gboyoed 
tcaakree

Example Input/Output 2:
Input:
3
cool buddy
think well
welcome tin
Output:
cbouodidy
twheilnlk
wteilncome

-------------------CODE--------------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        String[][] str=new String[n][2];
        for(int i=0;i<n;i++)
        {
            str[i][0]=sc.next();
            str[i][1]=sc.next();
        }
        for(int i=0;i<n;i++)
        {
            int a=0,b=0;
            StringBuilder sb=new StringBuilder();
            while(a<str[i][0].length() || b<str[i][1].length())
            {
                if(a<str[i][0].length())
                {
                    sb.append(str[i][0].charAt(a));
                    a++;
                }
                if(b<str[i][1].length())
                {
                    sb.append(str[i][1].charAt(b));
                    b++;
                }
            }
            if(a<str[i][0].length())
            {
                sb.append(str[i][0].substring(a,str[i][0].length()));
            }
            else if(b<str[i][1].length())
            {
                sb.append(str[i][1].substring(b,str[i][1].length()));
            }
            System.out.println(sb.toString());
        }
	}
}

--Time Complexity : O(len(s1) + len(s2)) 
--Space Complexity :  O(len(s1) + len(s2)) 
