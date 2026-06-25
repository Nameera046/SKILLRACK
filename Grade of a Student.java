Grade of a Student

The marks scored by a student is given as the input to the program. 
The program must print the corresponding grade based on the below conditions.

Conditions:
S Grade: 80 <= marks <= 100
A Grade: 60 <= marks < 80
B Grade: 50 <= marks < 60
C Grade: marks < 50

Example Input/Output 1:
Input:
95
Output:
S

Example Input/Output 2:
Input:
34
Output:
C

--------------------CODE--------------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=80 && n<=100)
		{
		    System.out.print("S");
		}
		else if(n>=60 && n<80)
		{
		    System.out.print("A");
		}
		else if(n>=50 && n<60)
		{
		    System.out.print("B");
		}
		else if(n<50)
		{
		    System.out.print("C");
		}
	}
}

---Time Complexity : O(1)
---Space Complexity : O(1)
