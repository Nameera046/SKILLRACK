Move to Beginning Operations Count

The program must accept a string S and two integers X, Y as the input. 
The program must perform the following two operations alternately on the given string S until the string becomes the original string.
Move the last X characters to the beginning.
Move the last Y characters to the beginning.
Finally, the program must print the number of operations performed on the given string S as the output.

Boundary Condition(s):
1 <= Length of S <= 100 1 X, Y Length of S

Input Format:
The first line contains S.
The second line contains X and Y separated by a space.
Output Format:
The first line contains an integer representing the number of operations performed on the given string S.

Example Input/Output 1:
Input:
high
1 2
Output: 3
Explanation:
Here X = 1 and Y = 2.
1st operation: high -> hhig
2nd operation: hhig -> ighh
3rd operation: ighh -> high

Example Input/Output 2:
Input:
SkillRack 
3 1
Output: 13
Explanation:
Here X3 and Y = 1.
1st operation: SkillRack → ackSkillR
2nd operation: ackSkillR -> RackSkill
3rd operation: RackSkill -> illRackSk
4th operation: illRackSk -> killRackS
5th operation: killRackS -> ckSkillRa
6th operation: ckSkillRa -> ackSkillR
7th operation: ackSkillR -> IIRackSki
8th operation: IIRackSki -> illRackSk
9th operation: illRackSk -> kSkillRac
10th operation: kSkillRac > ckSkillRa
11th operation: ckSkillRa → IRackSkil
12th operation: IRackSkil -> IIRackSki
13th operation: IIRackSki -> SkillRack


---------------CODE-----------------

package Skillrack;
import java.util.*;
public class Move_To_Beginning_Operations_Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int count=0;
		StringBuilder sb=new StringBuilder();
		String str1=sb.append(str.substring(str.length()-x,str.length())).append(str.substring(0,str.length()-x)).toString();
		System.out.println(str1);
		count++;
		while(!str1.equals(str))
		{
			sb.setLength(0);
			str1=sb.append(str1.substring(str1.length()-y,str1.length())).append(str1.substring(0,str1.length()-y)).toString();
			System.out.println(str1);
			count++;
			sb.setLength(0);
			str1=sb.append(str1.substring(str1.length()-x,str1.length())).append(str1.substring(0,str1.length()-x)).toString();
			System.out.println(str1);
			count++;
		}
		System.out.println(count);
	}
}

--Time Complexity: O(n^2) in the worst case.
--Space Complexity: O(n).
