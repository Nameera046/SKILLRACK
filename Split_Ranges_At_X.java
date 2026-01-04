Split Ranges at X

The program must accept N ranges and an integer X as the input. If the value X is present in a range A-B (both exclusive), 
then the A-X and X-B. Then the program must print the ranges in ascending order based on the start value.
If two or more ranges start with those ranges in ascending order based on the end value.
Boundary Condition(s):
1 <= N <= 100
1A<B<= 1000 1 <X<=1000
Input Format:
The first line contains N.
The second line contains N ranges separated by a space
The third line contains X

Output Format:
The lines contain the ranges based on the given conditions.

Example Input/Output 1:
Input
4
5-152-8 12-15-1-20
10
Output:
1-10
2-8
5-10
10-15
10-20
12-15
Explanation: 
Here N-4 and X=10.
1st range 5-15 contains 10. So it is divided into two ranges as 5-10 and 10-15.
2nd range 2-8 does not contain 10.
3d range 12-15 does not contain 10.
4th range 1-20 contains 10. So it is divided into two ranges as 1-10 and 10-20.
1-10
2-8
5-10
10-15
10-20
12-15

Example Input/Output 2:
Input
7
1-20 1-10 17-28 10-204-119-23 10-15
10
Output:
1-10
1-10
4-10
9-10
10-11
10-15
10-20
10-20
10-23
17-28

CODE: 

package Skillrack;
import java.util.*;
public class Split_Ranges_At_X 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
		    str[i]=sc.next();
		}
		int k=sc.nextInt();
		String[] res=new String[n*2];
		int a=0;
		for(int i=0;i<n;i++)
		{
		    if((Integer.parseInt(str[i].split("-")[0]))<k && (Integer.parseInt(str[i].split("-")[1]))>k)
		    {
		        res[a++]=Integer.parseInt(str[i].split("-")[0])+"-"+k;
		        res[a++]=k+"-"+Integer.parseInt(str[i].split("-")[1]);
		    }
		    else
		    {
		        res[a++] =Integer.parseInt(str[i].split("-")[0])+"-"+Integer.parseInt(str[i].split("-")[1]);
		    }
		}
		Arrays.sort(res,0,a,(x,y)->{
		    int xs=Integer.parseInt(x.split("-")[0]);
		    int ys=Integer.parseInt(y.split("-")[0]);
		    if(xs==ys)
		    {
		        int xe=Integer.parseInt(x.split("-")[1]);
		        int ye=Integer.parseInt(y.split("-")[1]);
		        return Integer.compare(xe,ye);
		    }
		    return Integer.compare(xs,ys);
		});
		for(int i=0;i<a;i++)
		{
		    System.out.println(res[i]);
		}
	}
}

//Time complexity: O(n log n)
//Space complexity: O(n)
