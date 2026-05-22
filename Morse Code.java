Morse Code

A spaceship has exploded in the space and two survivors need to communicate with the station in the earth. 
Due to voice communication failure, they can get only beep sound. Each consecutive beep sound denotes an alphabet. 
For example, two consecutive beep sound means the alphabet b. 
The beep sounds are represented as 1's. Each consecutive beep sounds are given as input in each line. 
Help the crew to decode the message.
Note: Read the input carefully to avoid errors.

Boundary Condition(s):
1 <= Number of lines <= 100

Input Format:
The list of lines contain 1's separated by space.
Output Format:
The first line contains the corresponding alphabet.

Example Input/Output1:
Input:
1 
1 1
1 1 1
Output:
abc

----------------CODE-----------------=

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		StringBuilder sb=new StringBuilder();
    		while(sc.hasNextLine())
    		{
    		    String str=sc.nextLine();
    		    String[] s=str.split(" ");
    		    sb.append((char)('a'+s.length-1));
    		}
    		System.out.println(sb.toString());
	  }
}

-----Time Complexity : O(n)
-----Space Compleixyt : O(n)
