Students and Queries

There are N students in a class. The program must accept the roll number and the marks in three subjects(A, B, C) of each student as the input. The program also accepts Q queries as the input. 
Each query contains two lines, where the first line contains a character CH and the second line contains a string $ representing a condition. The value of CH
can be any one of the following.
-It indicates all four fields (Roll Number, A, B and C
A-It indicates the field A (the marks in the subject A)
B-It indicates the field B (the marks in the subject B).
C-It indicates the field C (the marks in the subject Q.
The string S contains the subject name (A, B or C), an operator (>, < or =) and an integer value. For each query, the program must print the details of the students based on the
character CH and the condition S. if there are no students for the given query, then the program must print -1 as the output
Not For each query, the details of the students must be printed in the order of their occurrence

Boundary Condition(s):
1 <= N, Q <= 100
1 <= Roll Number, Marks in each subject (A, B, C) <= 100

Input Format:
The first line contains N
The next N lines, each contains the roll number and the marks in three subjects(A, B, C) of each student.
The N+2nd line contains Q.
The next Q pairs of lines, each contains the character CH in the first line and the string S in the second line.
Output Format:
The lines contain the details of the students based on the character CH and the condition Sor-1.

Example Input/Output 1:
Input:
4
150 60.80
2.99 64 90
3 70 90 80
4.60 70 95
3
A>50
A
B<70
B=95
Output:
2 99 64 90
3.70 90 80
4 60 70 95
50
99
-1
Explanation.
1 query: CH = and the condition is A>50.
All four fields of the students who scored more than 50 marks in the subject A are printed.
2 99 64 90
3 70 90 80
4 60 70 95
2nd query: CH = A and the condition is B<70.
The marks in the subject A of the students who scored less than 70 marks in the subject B are printed.
50
99
3d query: CH = B and the condition is B=95.
There are no students having 95 marks in the subject B
So-1 is printed.

-----CODE-------

package Skillrack;
import java.util.*;
public class Students_and_Queries {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] mat=new int[n][4];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<4;j++)
		    {
		        mat[i][j]=sc.nextInt();
		    }
		}
		int q=sc.nextInt();
		sc.nextLine();
		String[] quer=new String[q*2];
		for(int i=0;i<q*2;i++)
		{
		    quer[i]=sc.nextLine();
		}
		for(int i=0;i<q*2;i+=2)
		{
		    String ch=quer[i];
		    String sub=quer[i+1].substring(0,1);
		    String op=quer[i+1].substring(1,2);
		    int value=Integer.parseInt(quer[i+1].substring(2));
		    int col=-1;
		    if(sub.equals("A"))
		        col=1;
		    else if(sub.equals("B"))
		        col=2;
		    else if(sub.equals("C"))
		        col=3;
		    boolean found=false;
		    for(int j=0;j<n;j++)
		    {
		        boolean condition=false;
		        if(op.equals("="))
		        {
		            condition=mat[j][col]==value;
		        }
		        else if(op.equals("<"))
		        {
		            condition=mat[j][col]<value;
		        }
		        else if(op.equals(">"))
		        {
		            condition=mat[j][col]>value;
		        }
		        if(condition)
		        {
		            found=true;
		            if(ch.equals("*"))
		            {
		                for(int k=0;k<4;k++)
		                {
		                    System.out.print(mat[j][k]+" ");
		                }
		                System.out.println();
		            }
		            if(ch.equals("A"))
		            {
		                System.out.println(mat[j][1]);
		            }
		            else if(ch.equals("B"))
		            {
		                System.out.println(mat[j][2]);
		            }
		            else if(ch.equals("C"))
		            {
		                System.out.println(mat[j][3]);
		            }
		        }
		    }
		    if(!found)
		    {
		        System.out.println("-1");
		    }
		}
	}
}
//
--The time complexity is O(nq) because for each of the q queries, the code iterates through all n rows of the matrix, resulting in a total of n multiplied by q operations. 
--The space complexity is O(n + q) due to the storage requirements for the matrix (O(n)) and the query strings (O(q)).
