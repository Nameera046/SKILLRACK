Amount of Walters

There are W waiters in a restaurant and N families dining in. The waiters are serving the families in round robin fashion. 
Each family spends X amount for the waiter serving them.
The program must print the amount given to each waiter as the output.

Boundary Condition(s):
1 <= W <= 500
1 <= N <= 1000

Input Format:
The first line contains the value of W and N separated by a space.
The second line contains the amount given by each family separated by space(s).
Output Format:
The first line contains the amount received by each waiter separated by space(s).

Example Input/Output 1:
Input:
3 5
100 150 125 50 25
Output:
150 175 125
Explanation:
The first waiter recieved the amount of Rs.100 from the first family.
The second waiter received the amount of Rs.150 from the second family.
The third waiter received the amount of Rs.125 from the third family.
Again, the first waiter received the amount of Rs.50 from the fourth family. Now, the amount received by the first waiter in total is Rs.150 (100+50).
The second waiter received the amount of Rs.25 from the fifth family. Now, the amount received by the second waiter in total is Rs.175 (150 + 25). Hence, 150 175 125 is printed as output.

Example Input/Output 2:
Input:
7 5
100 150 100 200 50
Output:
100 150 100 200 5000

-----------------------CODE----------------------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    int[] res=new int[w];
	    Arrays.fill(res,0);
        for(int j=0;j<n;j++)
        {
            res[j%w]+=arr[j];
        }
        for(int i=0;i<w;i++)
        {
            System.out.print(res[i]+" ");
        }
	}
}

----Time Complexity : O(n+w)
----Space Complexity : O(n+w)
