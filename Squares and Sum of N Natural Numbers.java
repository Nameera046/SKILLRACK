Squares and Sum of N Natural Numbers

The program must accept an integer N as the input. The program must print the squares of natural numbers from 1. 
The squares must be printed up to the cube of N in the first line. The second line must contain the sum of these squares.

Boundary Condition(s):
1 <= N <= 50

Input Format:
The first line contains the value of N.
Output Format:
The first line contains the squares of N natural number.
The second line contains the sum of the squares of N natural numbers.

Example Input/Output 1:
Input ;
5
Output:
14 9 16 25 36 49 64 81 100 121
506
Explanation:
The N value is 5.
The squares must be printed up to the cube of 5 that is 125.
so the values 1 4 9 16 25 36 49 64 81 100 121 are printed.
The sum of these squares is 506.

Example Input/Output 2:
Input:
10
Output:
1 4 9 16 25 36 49 64 81 100 121 144 169 196 225 256 289 324 361 400 441 484 529 576 625 676 729 784 841 900 961
10416

--------------------------CODE-----------------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cube=n*n*n;
		int sum=0;
		for(int i=1;i<=cube;i++)
		{
		    if(i*i<=cube)
		    {
		        System.out.print(i*i+" ");
		        sum+=i*i;
		    }
		    else if(i*i>cube)
		    {
		        System.out.println();
		        break;
		    }
		}
		System.out.println(sum);
	}
}

---Time Complexity : O(n^(3/2)).
---Space Complexity : O(1).
