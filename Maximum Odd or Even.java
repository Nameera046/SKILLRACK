Maximum Odd or Even

The program must accept N integers as input.
For each integer the program must print the output based on the following conditions.
- If the current integer is odd then the program must print the maximum odd integer present before the current integer which is also greater than the current integer
- If the current integer is even then the program must print the maximum even integer present after the current integer which is also greater than the current integer.
- If there is no maximum odd or even integer which is also greater than the current integer is found, then the program must print the current integer as the output.

Boundary Condition(s): 2 <= N < 100

Input Format:
The first line contains the value of N.
The second line contains the N integers separated by space(s).
Output Format:
The first line contains N integers based on the conditions separated by a space.

Example Input/Output 1:
Input:
6 
4 5 3 7 6 3
Output: \
6 5 5 7 6 7
Explanation:
4 is an even integer and the maximum even integer after 4 is 6. So 6 is printed.
5 is an odd integer and there is no odd integer before 5. So the current integer 5 is printed.
3 is an odd integer and the maximum odd integer that occurs before 3 is 5. So 5 is printed.
7 is an odd integer and the maximum odd integer that occurs before 7 is 5. But 5 is not greater than the current integer 7. So 7 is printed.
6 is an even integer and there is no even integer after 6. So the current integer 6 is printed.
3 is an odd integer and the maximum odd integer that occurs before 3 is 7 so 7 is printed.

Example Input/Output 2:
Input:
7
10 5 8 16 11 7 66
Output:
66 5 66 66 11 11 66

----------------------------CODE--------------------------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int[] res=new int[n];
		for(int i=0;i<n;i++)
		{
		    int flag=0;
		    if(arr[i]%2==0)
		    {
		        int emax=Integer.MIN_VALUE;
		        for(int j=i;j<n;j++)
		        {
		            if(arr[j]%2==0 && arr[j]>emax)
		            {
		                emax=arr[j];
		                flag=1;
		            }
		        }
		        if(flag!=0)
		        {
		        res[i]=emax;
		        }
		        else
		        {
		            res[i]=arr[i];
		        }
		    }
		    else if(arr[i]%2!=0)
		    {
		        int omax=Integer.MIN_VALUE;
		        for(int j=0;j<=i;j++)
		        {
		            if(arr[j]%2!=0 && arr[j]>omax)
		            {
		                omax=arr[j];
		                flag=1;
		            }
		        }
		        if(flag!=0)
		        {
		        res[i]=omax;
		        }
		        else
		        {
		            res[i]=arr[i];
		        }
		    }
		    System.out.print(res[i]+" ");
		}
	}
}

--Time Complexity : O(n^2)
--Space Complexity :O(n)
