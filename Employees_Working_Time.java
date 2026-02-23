Employees Working Time

The program must accept the name, in-time and out-time (in 24-hr format HH:MM) of N employees as the input. 
The program must print the names of the employees in descending order based on their working time. 
If two or more employees have the same working time then those employees must be printed in chronological order based on their in-time. 
If two or more employees have the same working time and the same in-time then those employees must be printed in sorted order based on their names.

Boundary Condition(s):
1 N 50
1 Length of each employee's name = 10

Input Format:
The first line contains N.
The next N lines, each contains the name, in-time and out-time of an employee separated by a space.
Output Format:
The first N lines contain the names of the N employees based on the given conditions.

Example Input/Output 1:
Input:
7
Rajesh 08:45 16:45
Catherine 09:15 17:45
Deepa 08:00 18:00
Pravin 09:00 17:30
Jhanvi 08:45 16:45
Hector 09:00 18:00
Mambo 09:00 17:00
Output:
Deepa
Hector
Pravin
Catherine
Jhanvi
Rajesh
Mambo
Here N-7, the name, in-time and out-time of 7 employees are given below.
Explanation:
Rajesh 08:45 16:45
Catherine 09:15 17:45
Deepa 08:00 18:00
Pravin 09:00 17:30
Jhanvi 08:45 16:45
Hector 09:00 18:00
Mambo 09:00 17:00
After sorting the names of the employees based on the given conditions, the names of the employees become
Deepa
Hector
Pravin
Catherine
Jhanvi
Rajesh
Mambo

Example Input/Output 2:
Input:
6
Bhuvana 16:00 23:00
Anu 11:00 23:00
Hector 09:30 16:30
John 10:15 20:15
Ramesh 09:30 16:29
Anita 09:30 16:30
Output:
Anu
John
Anita
Hector
Bhuvana
Ramesh

package Skillrack;
import java.util.*;
public class Employees_Working_Time 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[][] res=new String[n][3];
		for(int i=0;i<n;i++)
		{
			String[] temp = sc.nextLine().split(" ");
		    for(int j = 0; j < 3; j++)
		    {
		        res[i][j] = temp[j];
		    }
		}
		for(int i=0;i<n;i++)
		{
			int st1=0,ed1=0;
			String[] st=res[i][1].split(":");
			st1+=Integer.parseInt(st[0])*60+Integer.parseInt(st[1]);
			String[] ed=res[i][2].split(":");
			ed1+=Integer.parseInt(ed[0])*60+Integer.parseInt(ed[1]);
			res[i][1]=String.valueOf(st1);
			int r=ed1-st1;
			res[i][2]=String.valueOf(r);
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(Integer.parseInt(res[i][1])>Integer.parseInt(res[j][1]))
				{
					String[] temp=res[i];
					res[i]=res[j];
					res[j]=temp;
				}
			}
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int a=Integer.parseInt(res[i][2]);
				int b=Integer.parseInt(res[j][2]);
				int o=Integer.parseInt(res[i][1]);
				int p=Integer.parseInt(res[j][1]);
				if(a<b)
				{
					String[] temp=res[i];
					res[i]=res[j];
					res[j]=temp;
				}
				if(a==b)
				{
					if(p<o)
					{
						String[] temp=res[i];
						res[i]=res[j];
						res[j]=temp;
					}
					else if(p==o)
					{
						int k=0;
						int min=res[i][0].length()<res[j][0].length()?res[i][0].length():res[j][0].length();
						while(k<min)
						{
							if(res[j][0].charAt(k++)-'0'<res[i][0].charAt(k++)-'0')
							{
								String[] temp=res[i];
								res[i]=res[j];
								res[j]=temp;
								break;
							}
							k++;
						}
					}
				}
			}
		}
		for(int i=0;i<n;i++)
		{
				System.out.println(res[i][0]);
		}
	}
}
