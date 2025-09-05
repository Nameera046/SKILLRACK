
// You are given two integers num1 and num2.
// In one operation, you can choose integer i in the range [0, 60] and subtract 2i + num2 from num1.
// Return the integer denoting the minimum number of operations needed to make num1 equal to 0.
// If it is impossible to make num1 equal to 0, return -1.

// Sample INPUT1:
//        num1 = 3, num2 = -2
//        OUPUT1:3 
// Explanation: We can make 3 equal to 0 with the following operations:
// - We choose i = 2 and subtract 22 + (-2) from 3, 3 - (4 + (-2)) = 1.
// - We choose i = 2 and subtract 22 + (-2) from 1, 1 - (4 + (-2)) = -1.
// - We choose i = 0 and subtract 20 + (-2) from -1, (-1) - (1 + (-2)) = 0.
// It can be proven, that 3 is the minimum number of operations that we need to perform.

//   Sample INPUT2:
//        num1 = 5, num2 = 7
//        OUPUT2: -1
  
CODE:
import java.util.*;
public class Solutions
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int num1=sc.nextInt(),num2=sc.nextInt();
      for(int i=1;i<=60;i++)
        {
          Long x=1L*num1-1L*num2*i;
          if(x<i)
          {
            flag=1;
            break;
          }
          if(x>=Long.bitCount(x))
          {
            flag=2;
            System.out.println(i);
            break;
          }
        }
      if(flag==1||flag==0)
      {
      System.out.print("-1");
      }
    }
 }
