Left Rotation of Numbers

The program must accept a list of integers and a list of rotation count as input. 
The program must print the rotated integers (anti-clockwise) as output.

Boundary Condition(s):
1 <= Size of the integers list <= 30
1 <= Size of the rotations list <= 16

Input Format:
The first line contains the list of integers separated by space(s).
The second line contains the list of rotations separated by space(s).
Output Format:
The list of lines contain the rotated integers.

Example Input/Output 1:
Input:
1 2 3 4 5
1 2 3
Output: 
2 3 4 5 1 
3 4 5 1 2 
4 5 1 2 3

Example Input/Output 2:
Input: 
45 67 89 
3 4
Output: 
45 67 89 
67 89 45

---------------------COE-----------------------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String[] s1=sc.nextLine().split(" ");
        String[] s2=sc.nextLine().split(" ");
        for(int i=0;i<s2.length;i++)
        {
            int k=(Integer.parseInt(s2[i]))%(s1.length);
            for(int j=k;j<s1.length;j++)
            {
                System.out.print(s1[j]+" ");
            }
            for(int j=0;j<k;j++)
            {
                System.out.print(s1[j]+" ");
            }
            System.out.println();
        }
  	}
}

------Time Complexity : O(m*n)
------Space Complexity ; O(m+n)
