Same Characters in Zigzag Matrix

Accept a matrix of size NXN containing only characters as input. 
The program must print the characters which are in the same positions in the forward and the reverse zig-zag traversal. 
If there is no character in the same position in such traversal then print -1 as the output.

Boundary Condition(s):
2< N << 20

Input Format:
The first line contains the value of N.
The next N lines contain N characters separated by space.

Output Format:
The first line contains the characters which are in the same positions in the forward and the reverse zig-zag traversal separated by space(s) or-1.

Example Input/Output 1:
Input:
5 
a b c d e 
k l m n o 
f g h i j 
f g h i j 
k r c f a
Output:
a c h m
Explanation:
In the forward traversal, the matrix contains b, d, e, j, i, g, f, k, l,, n, o, j, i, h, g, f, k, r, c, f and a.
In the reverse traversal, the matrix contains, f, , r, k, f, g, i, j, o, n,, I, k, f, g, h, i, j, e, d, c, b and a.
While traversing in the forward and reverse direction, the characters in the same positions are a, c, h and m as highlighted in blue color.

Example Input/Output 2:
Input:
6 
g l m n n o 
t s v u h r 
m o h n g i
r h v v s t 
o g i g f e
o c b d f g
Output:
g r h v s t g o

Example Input/Output 3:
Input:
4 
a b c d
f g h i
k l m n
f g h i
Output: 
-1

--------------------CODE-------------------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		int n=sc.nextInt();
    		char[][] arr=new char[n][n];
    		for(int i=0;i<n;i++)
    		{
    		    for(int j=0;j<n;j++)
    		    {
    		        arr[i][j]=sc.next().charAt(0);
    		    }
    		}
    		StringBuilder sb=new StringBuilder();
    		int k=0;
    		for(int i=0;i<n;i++)
    		{
    		    if(k==0)
    		    {
    		        for(int j=0;j<n;j++)
    		        {
    		            sb.append(String.valueOf(arr[i][j]));
    		        }
    		        k=1;
    		    }
    		    else if(k==1)
    		    {
        		    for(int j=n-1;j>=0;j--)
        		    {
        		        sb.append(String.valueOf(arr[i][j]));
        		    }
        		    k=0;
    		    }
    		}
    		k=0;
    		StringBuilder sb1=new StringBuilder();
    		for(int i=n-1;i>=0;i--)
    		{
    		    if(k==0)
    		    {
        		   for(int j=n-1;j>=0;j--)
        		   {
        		       sb1.append(String.valueOf(arr[i][j]));
        		   }
        		   k=1;
    		    }
    		    else if(k==1)
    		    {
    		        for(int j=0;j<n;j++)
    		        {
    		            sb1.append(String.valueOf(arr[i][j]));
    		        }
    		        k=0;
    		    }
    		}
    		String str1=sb.toString();
    		String str2=sb1.toString();
    		int flag=0;
    		String ans="";
    		for(int i=0;i<str1.length();i++)
    		{
    		    if(str1.charAt(i)==str2.charAt(i))
    		    {
    		        flag=1;
    		        ans+=String.valueOf(str1.charAt(i));
    		    }
    		}
    		if(flag==0)
    		{
    		    System.out.println("-1");
    		}
    		else
    		{
    		    for(int i=0;i<(ans.length()+1)/2;i++)
    		    {
    		        System.out.print(ans.charAt(i)+" ");
    		    }
    		}
   	}
}

---Time Complexity : O(n*n)
---Space Complexity : O(n*n)
