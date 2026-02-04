Couples Seating Arrangement

There are N seats in a row and some seats are already booked. 
The program must accept a string S representing the status of N seats. T
he character M indicates a male. The character F indicates a female. 
The character hash symbol (#) indicates an empty seat. 
The program must print the maximum number of couples that can be seated together in the empty seats based on the following condition.
The neighboring seats of couples must be of the same gender or empty.

Boundary Condition(s):
1<=N<=100

Input Format:
The first line contains N.
The second line contains S.

Output Format:
The first line contains the maximum number of couples that can be seated together in the empty seats.

Example Input/Output 1:
Input:
19
FF##MM##MFF##FFF###
Output:
2
Explanation:
A maximum of 2 couples can be seated in the row.
One of the possible ways is given below.
FFFMMM##MFF##FFFFM#

Example Input/Output 2:
Input:
18
####MM###M######M#
Output: 5

Example Input/Output 3:
Input:
16
##########F####M
Output:
6
Max Execution Time Limit: 50 millisecs

package Skillrack;
import java.util.*;
public class couples_Seating_Arrangement {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine().trim();
		char[] arr=str.toCharArray();
		int count=0;
		if(n==2 && arr[0]=='#' && arr[1]=='#')
		{
		    count=1;
		}
		else if(n>2)
		{
		for(int i=0;i<n-1;)
		{
		    if(arr[i]=='#' && arr[i+1]=='#')
		    {
		        if(i==0)
		        {
		            if(arr[i+2]=='F')
		            {
		                arr[i]='M';
		                arr[i+1]='F';
		                count++;
		            }
		            else if(arr[i+2]=='M')
		            {
		                arr[i]='F';
		                arr[i+1]='M';
		                count++;
		            }
		            else if(arr[i+2]=='#')
		            {
		                int temp=0,k=i;
		                while(k<n && arr[k]=='#')
		                {
		                    temp++;
		                    k++;
		                }
		                if(k==n)
		                {
		                    arr[i]='M';
		                    arr[i+1]='F';
		                    count++;
		                }
		                else if(k<n){
		                if((temp/2)%2==0 && arr[k]=='F')
		                {
    		                arr[i]='F';
    		                arr[i+1]='M';
    		                count++;
		                }
		                else if((temp/2)%2!=0 && arr[k]=='M')
		                {
		                    arr[i]='F';
		                    arr[i+1]='M';
		                    count++;
		                }
		                else if((temp/2)%2!=0 && arr[k]=='F')
		                {
		                    arr[i]='M';
		                    arr[i+1]='F';
		                    count++;
		                }
		                else if((temp/2)%2==0 && arr[k]=='M')
		                {
		                    arr[i]='M';
		                    arr[i+1]='F';
		                    count++;
		                }
		                }
		            }
		        }
		        else if(i!=0)
		        {
		            if(i+2<n && arr[i-1]=='F' && arr[i+2]=='M')
		            {
		               arr[i]='F';
		               arr[i+1]='M';
		               count++;
		            }
		            else if(i+2<n && arr[i-1]=='F' && arr[i+2]=='#')
		            {
		                arr[i]='F';
		                arr[i+1]='M';
		                count++;
		            }
		            else if(i+2<n && arr[i-1]=='M' && arr[i+2]=='F')
		            {
		                arr[i]='M';
		                arr[i+1]='F';
		                count++;
		            }
		            else if(i+2<n && arr[i-1]=='M' && arr[i+2]=='#')
		            {
		                arr[i]='M';
		                arr[i+1]='F';
		                count++;
		            }
		            else if(i+2>=n)
		            {
		                if(arr[i]=='#' && arr[i+1]=='#')
		                {
		                    if(arr[i-1]=='F')
		                    {
		                        arr[i]='F';
		                        arr[i+1]='M';
		                        count++;
		                    }
		                    else
		                    {
		                        arr[i]='M';
		                        arr[i+1]='F';
		                        count++;
		                    }
		                }
		            }
		        }
		        i+=2;
		    }
		    else
		    {
		        i+=1;
		    }
		}
		}
		System.out.println(count);
	}
}

-Time Complexity :
	Best-case: Θ(n)
	Average-case (typical inputs): Θ(n)
	Worst-case: O(n²)
-Space Complexity:
	O(n)
