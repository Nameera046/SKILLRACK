Square Submatrix Same Unit Digit

An integer matrix of size R*C is passed as the input. Another integer N is also passed as the input. 
The program must print Yes if there is a submatrix of size N*N where all the integers are having the same unit digit. 
Else the program must print No as the output.

Boundary Condition(s):
1<R, C < 100 1 <= Matrix element value <= 1000 1 <= N <= 10
Input Format:
The first line contains R and C separated by a space.
The next R lines contain C values each separated by a space.
The R+2nd line contains N.
Output Format:
The first line contains Yes or No.

Example Input/Output 1:
Input:
5 6
1 2 2 2 3 5
5 4 4 8 11 9 
7 12 2 66 8 4 
9 71 901 8 9 13 
1 1 1 3 2 5
2
Output:
Yes
Explanation:
The submatrix of size 2*2 has unit digit as 1 for all the values.
71 901
11

Example Input/Output 2:
Input:
7 6
2 60 11 56 29 31
23 73 83 33 63 23
46 23 3 63 63 83
91 43 33 60 53 33
88 63 61 93 33 77
29 53 51 23 23 83
64 4 34 78 53 75
5
Output: No

CODE: 

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
  		Scanner sc=new Scanner(System.in);
  		int a=sc.nextInt();
  		int b=sc.nextInt();
  		int[][] c=new int[a][b];
  		int d=0,e=0,f=0,g=0,h=0,i=0;
  		for(d=0;d<a;d++)
  		{
  		    for(e=0;e<b;e++)
  		    {
  		        c[d][e]=sc.nextInt();
  		    }
  		}
  		int k=sc.nextInt();
  		for(d=0;d<a-k+1;d++)
  		{
  		    for(e=0;e<b-k+1;e++)
  		    {
  		        h=1;
  		        i=c[d][e]%10;
  		        for(f=d;f<d+k;f++)
  		        {
  		            for(g=e;g<e+k;g++)
  		            {
  		                if(c[f][g]%10!=i) h=0;
  		            }
  		        }
  		        if(h==1)
  		        {
  		            System.out.print("Yes");
  		            break;
  		        }
  		    }
  		    if(h==1)
  		    {
  		        break;
  		    }
  		}
  		if(h==0)
  		{
  		    System.out.print("No");
  		}
	 }
}
