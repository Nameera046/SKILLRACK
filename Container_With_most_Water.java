Container With most Water

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.

Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:
Input: height = [1,1]
Output: 1

Constraints:
n == height.length
2 <= n <= 10^5
0 <= height[i] <= 10^4

----CODE------
import java.util.*;
public class Container_With_most_Water
{
  public int maxArea(int[] height) 
  {
          int max=Integer.MIN_VALUE;
          int i=0,j=height.length-1;
          while(i<j)
          {
              long capacity=(long)(j-i)*Math.min(height[i],height[j]);
              if(capacity>max)
              {
                  max=(int)capacity;
              }
              if(height[i]<height[j])
              {
                  i++;
              }
              else
              {
                  j--;
              }
          }
          return max;
      }
  }
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] height=new int[n];
      for(int i=0;i<n;i++)
        {
          height[i]=sc.nextInt();
        }
       int result= maxArea(height);
      System.out.print(result);
  }
}
- Time complexity: O(n)
- Space complexity: O(1)
