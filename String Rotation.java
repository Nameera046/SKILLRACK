String Rotation

The program must accept the values of two string values (in clock wise rotation) S1 and S2 as input. 
If S2 is the rotated version of S1, then print YES as the output. Else print NO as the output.

Boundary Condition(s):
2 <= Length of the string S1 and S2 <= 10000

Input Format:
The first line contains the string value S1.
The second line contains the string value S2.
Output Format:
The first line contains either YES or NO.

Example Input/Output 1:
Input:
SkillRack
ackSkillR
Output:
YES

Example Input/Output 2:
Input:
skillrack
illrackks
Output:
NO

----------------------------CODE--------------------------------

import java.util.*;
public class Hello {
    public static boolean rotated(String s1,String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        int index=0;
        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)==s1.charAt(0))
            {
                index=i;
                break;
            }
        }
        StringBuilder sb=new StringBuilder();
        sb.append(s2.substring(index,s2.length())).append(s2.substring(0,index));
        String s=sb.toString();
        if(s1.equals(s))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(!rotated(s1,s2))
		{
		    System.out.print("NO");
		}
		else
		{
		    System.out.print("YES");
		}
	}
}

-----Time Complexity : O(n)
-----Space Complexity : O(n)
