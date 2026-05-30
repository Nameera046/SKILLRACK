Evaluate Expression Operators as Words

The program must accept a string S representing an arithmetic expression. The expression contains the integer values and the operators in words (plus for +, minus for, multiply for * and divide for /).
The program must evaluate the expression from left to right and print the resulting integer value as the output.
Note: The divide operator (/) must return the quotient when the numerator is divided by the denominator.

Boundary Condition(s): 8 <= Length of S <= 1000 1 <= Each integer value <= 100
Input Format: The first line contains S.
Output Format:
The first line contains an integer value representing the resulting integer.

Example Input/Output 1:
Input: 10 plus 20 minus 5 multiply 4 divide 50
Output: 2
Explanation:
S = 10 plus 20 minus 5 multiply 4 divide 50
10+20-5*4/50 30-5*4/50 = 25 * 4/50 = 100/50 = 2

Example Input/Output 2:
Input: 50 multiply 3 plus 21 plus 13 divide 3
Output: 61

import java.util.*;
public class Evaluate_the_Expression_Operator_as_word 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String[] str=sc.nextLine().split(" ");
        int sum=Integer.parseInt(str[0]);
        for(int i=1;i<str.length-1;i+=2)
        {
             String op=str[i];
             switch(op)
             {
                case "plus":
                    sum+=Integer.parseInt(str[i+1]);
                    break;
                case "minus":
                    sum-=Integer.parseInt(str[i+1]);
                    break;
                case "multiply":
                    sum*=Integer.parseInt(str[i+1]);
                    break;
                case "divide":
                    sum/=Integer.parseInt(str[i+1]);
                    break;
                default:
                    break;
             }
        }
        System.out.println(sum);
    }
}

-Time Complexity : O(n);
-Space Complexity : O(n);
