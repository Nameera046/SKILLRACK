Distance From Origin

A point in a graph (x,y) is given as input. 
The program must print the distance between the given point and the origin with precision up to two decimal places.

Boundary Condition(s):
1 <= x, y <= 100

Input Format:
The first line contains the value of x and y separated by space(s).
Output Format:
The first line contains the distance with precision up to two decimal places.

Example Input/Output 1:
Input:
3 3
Output:
4.24

Example Input/Output 2:
Input:
4 0
Output:
4.00

-------------CODE---------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		double res=Math.sqrt((x*x)+(y*y));
		System.out.printf("%.2f",res);
	}
}

--Time Complexity ;O(1)
--Space Complexity : O(1)
