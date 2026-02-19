Find Area- Radius or Diameter

The program must accept an integer Q as the input. 
If the value of Q is 1, then the radius of a circle is passed as the input. If the value of Q is 2, then the diameter of a circle is passed as the input. 
The program must print the area of the circle with the precision up to 2 decimal places as the output.

Example Input/Output 1:
Input:
1
5
Output:
78.57
Explanation:
Here the value of Q is 1 and the radius of a
circle is 5.
The area of the circle with the precision up to 2 decimal places is 78.57 ((22/7) * 5 * 5).

Example Input/Output 2:
Input:
2
7.5
Output:
44.20

---CODE----

package Skillrack;
import java.util.*;
public class Find_Area_radius_Or_diameter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		double par=sc.nextDouble();
		if(q==1)
		{
			double value=(22/7.0)*par*par;
			System.out.printf("%.2f", value);
		}
		else if(q==2)
		{
			double value=((22/7.0)*par*par)/4;
			System.out.printf("%.2f", value);
		}
	}
}

//--Time Complexity : O(1);
//--Space Complexity : O(1);
