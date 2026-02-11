Remove Unit Digit - Previous and next

The program must accept a list of N integers and an integer T as the input. The program must remove T unit digits in the given list of integers based on the following conditions.
The program must start removing the unit digits from the 1st integer.
If the removed unit digit is even, then the program must remove the unit digit of the next integer. Else the program must remove the unit digit of the previous integer.
Similarly, the program must remove Tunit digits in the given list of integers.
- Once all the digits in an integer are removed, then the integer itself must be removed from the given list.
- Consider the given list of integers in circular fashion when finding the previous and next integers.
Finally, the program must print the sum S of the modified integers in the list as the output. If all Integers are removed, then the program must print -1 as the output.

Boundary Condition(s):
1- Fach integer value 10 B
2 = N = 100
1-T-1000

Input Format:
The first line contains N.
The second line contains N integers separated
by a space.
The third line contains T.
Output Format:
The first line contains 5 or -1.

Example Input/Output 1:
Input:
4
87369 4012 22312 39845
6
Output: 3903

Explanation:
Here N-4 and T-6.
t = 1-8736 4012 22312 39845 (The unit digit of the 1st integer is removed).
t = 2 - 8736 4012 22312 3984 (The unit digit of the 4th integer is removed).
t = 3 - 8736 4012 2231 3984 (The unit digit of the 3rd integer is removed).
t = 4 - 8736 4012 2231 398 (The unit digit of the 4th integer is removed).
t = 5 - 873 4012 2231 398 (The unit digit of the 1st integer is removed).
t = 6 - 873 401 2231 398 (The unit digit of the 2nd integer is removed).
Now the sum of the modified integers is 3903 (873+401+2231+398).
So 3903 is printed as the output.

Example Input/Output 2:
Input:
4 22 44 33 55 7
Output: 5
Explanation:
Here N = 4 and T = 7
t-1-244 33 55 1-2-2433 55 t = 3 24 3 55
t = 4 -> 2 * 3.5! (X indicates the integer to be removed
1-5-2X55 (X indicates the integer to be removed)
1-6 X 55 (X indicates the integer to be removed) t-7-5

Example Input/Output 3:
Proceed to Sove the Program
Hence 5 is printed as the output.

----CODE-----

package Skillrack;
import java.util.*;

public class Remove_Unit_digit_Previous_and_Next 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int k = 0, i = 0;
        while (k < t && n > 0) 
        {
            int a = arr[i] % 10;
            arr[i] = arr[i] / 10;
            if (arr[i] <= 0) 
            {
                for (int b = i; b < n - 1; b++) 
                {
                    arr[b] = arr[b + 1];
                }
                n--;     
                if (i >= n) 
                { 
                    i = 0;
                }
            }

            if (n == 0) 
            	break;
            if (a % 2 == 0) 
            {
                i++;
            } 
            else 
            {
                i--;
            }
            if (i < 0) 
            {
                i = n - 1;
            } 
            else if (i >= n) 
            {
                i = 0;
            }

            k++;
        }

        int sum = 0;
        for (int j = 0; j < n; j++) 
        { 
            sum += arr[j];
        }

        System.out.println(sum);
    }
}

- Worst-case time complexity: O(t * n)
- Space complexity: O(n)
