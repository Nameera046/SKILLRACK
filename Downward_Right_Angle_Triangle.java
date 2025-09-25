// DOWNWARD RIGHT ANGLE TRIANGLE

// The program must accept an integer N as the input. The program must print the desired pattern as shown in the Example Input/Output section.
// Proceed to Solve the Program
// Boundary Condition(s):

// 2 <= N <= 50

// Input Format:
// The first line contains N.
// Output Format:
// The first N lines contain the desired pattern as shown in the Example Input/Output section.

// Example Input/Output 1:
// Input:
// 3
// Output:
// *-*-*-*-*
// --*-*-*--
// ----*----

// Explanation:
// Here N-3, so the pattern contains 3 lines of output.
// The asterisks in the pattern represent the two right-angle triangles and the hyphens in the pattern represent the empty spaces.

// Example Input/Output 2:
// Input:
// 5
// Output:
// *-*-*-*-*-*-*-*-*
// --*-----*-----*--
// ----*---*---*----
// ------*-*-*------
// --------*--------

CODE:

package rightanglepattern;
import java.util.*;

public class rightangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<=(2*n-2);j++) 
            {
                if(i==0) 
                {
                    System.out.print(((i+j)%2==0)?"*":"-");
                }
                else if(j==((n-1)*2) || j==i*2) 
                {   
                    System.out.print("*");
                }
                else {
                    System.out.print("-");
                }
            }
            for(int j=(2*n-3);j>=0;j--) 
            {
                if(i==0) {
                    System.out.print(((i+j)%2==0)?"*":"-");
                }
                else if(j==i*2) 
                {
                    System.out.print("*");
                }
                else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
