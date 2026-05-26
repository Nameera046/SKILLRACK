Lucky Draw Winner

N players(with jersey numbered from 1 to N) sat in a line to play a game. me. A number K is randomly drawn out from a box. 
On each draw, the player at the position K is eliminated from the game. Print the jersey number of the winner after N-1 draws.
Note: After each elimination, the positions are filled by the person next to it and hence there is no gap between players after elimination.

Boundary Condition(s):
2< N < 50

Input Format:
The first line contains the value of N.
The second line contain N values separated by space(s).
The third line contain N-1 values separated by space(s).
Output Format:
The first line contains the jersey number of the winner.

Example Input/Output 1:
Input:
6
100 200 300 400 500 600
14231
Output:
400
Explanation:
The initial jersey numbers of the players are, 100 200 300 400 500 600
After removing player at position 1, the jersey numbers of the remaining players are 200 300 400 500 600
After removing player at position 4, the jersey numbers of the remaining players are 200 300 400 600
After removing player at position 2, the jersey numbers of the remaining players are 200 400 600
After removing player at position 3, the jersey numbers of the remaining players are 200 and 400
After removing player at position 1, the jersey number of the remaining player is 400

Example Input/Output 2:
Input:
11
7 18 10 5 25 17 16 12 34 99 26
2586423422
Output:
7

--------------------CODE--------------------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> l=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
		    int a=sc.nextInt();
		    l.add(a);
		}
		int[] random=new int[n-1];
		for(int i=0;i<n-1;i++)
		{
		    random[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
		    int no=random[i]-1;
		    l.remove(l.get(no));
		}
		for(int a:l)
		{
		    System.out.print(a+" ");
		}
	}
}

--Time Complexity : O(n^2)
--Space Complexity : O(n)
