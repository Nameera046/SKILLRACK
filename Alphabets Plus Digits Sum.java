Alphabets Plus Digits Sum

The program must accept a string S which has alphabets and digits as the input. The program must find the sum of all the digits as D. Then the program must print the alphabets which are D positions from the alphabets present in the string.
Note:
The output must be in lowercase.

Boundary Condition(s): Length of the S is from 3 to 100.

Input Format:
The first line contains the string S.
Output Format:
The first line contains the modified alphabets.

Example Input/Output 1:
Input:
435acl
Output:
mox
Explanation:
The digits are 4, 3, 5. The sum = 4 + 3 + 5 = 12
The alphabets are a, c, I. So a + 12 = m c + 12 = 0 1 12 = x

Example Input/Output 2:
Input:
1121ZU
Output: ez
Explanation:
The digits are 1, 1, 2, 1. The sum = 1 + 1 + 2 + 1 = 5 .
The alphabets are Z, U. So z + 5 = e (circularly), u 5 = z

---------------------CODE-----------------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int sum=0;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                sum+=ch-'0';
            }
        }

        sum=sum%26;
        System.out.println(sum);

        if(sum==0)
        {
            System.out.print("/");
            return;
        }

        for(int i=0;i<s.length();i++)
        {
            char ch=Character.toLowerCase(s.charAt(i));

            if(Character.isLetter(ch))
            {
                System.out.println(
                    (char)((((ch-'a')+sum)%26)+'a')
                );
            }
        }

        System.out.print("/");
    }
}

--Time Complexity : O(n) - n--> s.length()
--Space Complexity : O(1)
