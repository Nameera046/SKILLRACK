Max Door Number Sum

There is a town in which H houses are situated in each of the S streets. 
Each house has a door number which is an positive integer. So these S*H door numbers form a matrix.
From any house you can navigate to the house in the east(right) or to the house located south (bottom). 
Thus the navigation ends when there is no house in the east or in the south.
The program must print the maximum possible sum of the door numbers traversed during the above mentioned navigation.

Input Format:
The first line will S and H separated by a space.
Next S lines will each contain H positive integer values (representing the door numbers) separated by a space.
Output Format:
The first line will contain the maximum possible sum of the door numbers traversed.

Boundary Conditions:
2<=S,H <= 500 1 << DoorNumber <= 10000

Example Input/Output 1:
Input:
3 3
15 25 30
45 25 60
70 75 10
Output: 215
Explanation:
The maximum possible sum of 215 is obtained when we follow 15->45->70->75->10

Example Input/Output 2:
Input:
4 4
4 10 10 4
4 9 9 4
2 2 10 1
9 9 2 7
Output: 52
Explanation:
The maximum possible sum of 52 is obtained
when we follow 4->10->10->9->10->2->

------CODE-------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
    		Scanner sc=new Scanner(System.in);
    		int r=sc.nextInt(),c=sc.nextInt();
    		int[][] mat=new int[r][c];
    		for(int i=0;i<r;i++)
    		{
    		    for(int j=0;j<c;j++)
    		    {
    		        mat[i][j]=sc.nextInt();
    		    }
    		}
        int[][] dp=new int[r+1][c+1];
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                dp[i][j]=mat[i-1][j-1]+Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
    		System.out.println(dp[r][c]);
	  }
}


---Time Complexity : O(r*c)
---Space Complexity : O(r*c)
