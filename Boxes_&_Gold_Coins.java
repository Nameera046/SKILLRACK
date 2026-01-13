Boxes & Gold Coins

N boxes are arranged in a row. 
Each box contains a certain number of gold coins. 
Every day a boy comes and picks up the boxes only if the number of gold coins in the selected box is greater than to its left. 
The program must accept N integers representing the number of gold coins in the N boxes as the input. 
The program must print the minimum number of days that he can pick the boxes as the output.

Boundary Condition(s):
2 <= N <= 100
1 Number of gold coins in each box <= 10^5
Input Format:
The first line contains N.
The second line contains N integers separated by a space representing the number of gold coins in the N boxes
Output Format:
The first line contains an integer representing the minimum number of days that he can pick the boxes based on the given conditions.

Example Input/Output 1:
Input:
10 7 6 9 8 5 8 4 2 2 11
Output:
2
Explanation:
Initially, the 10 boxes are 7 6 9 8 5 8 4 2 2 11.
Day 1: He can pick the 3rd, 6th and 10th boxes.
After day 1, the boxes become 76854 2 2.
Day 2: He can pick the 3rd box.
After day 2, the boxes become 7 6 5 4 2 2.
Day 3: Now he has no boxes to pick.
So 2 printed as the output.

Example Input/Output 2:
nput:

7
5 4 7 3 6 9 8
Output: 2
Explanation:
Initially, the 7 boxes are 5 4 7 3 6 9 8.
Day 1: He can pick the 3rd, 5th and 6th boxes.
After day 1, the boxes become 5 4 3 8.
Day 2: He can pick the 4th box.
After day 2, the boxes become 5 4 3.
Day 3: Now he has no boxes to pick.
So 2 printed as the output.

Example Input/Output 3:
Input:
9
7 8 9 1 5 4 3 6 2
Output: 4

import java.util.*;
public class Boxes_And_gold_Coins {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a.add(sc.nextInt());
        }       
        int count=0; 
        while(true)
        {
            ArrayList<Integer> l=new ArrayList<>();
            l.add(a.get(0));
            int flag=0;
            for(int i=1;i<a.size();i++)
            {
                if(a.get(i)<=a.get(i-1))
                {
                    l.add(a.get(i));
                }
                else{
                    flag=1;
                    continue;
                }
            }
            if(flag==0)
            {
                break;
            }
            a=l;
            count++;
        }
        System.out.println(count);
    }
}

- Time complexity: O(n^2)
- Space complexity: O(n)
