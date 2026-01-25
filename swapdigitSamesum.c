function swapDigitsSameSum

The function/method swapDigitsSameSum accepts two arguments ptr1 and ptr2 representing the addresses of two intger values X and Y. The number of digits in X and Y are always not equal.
The function/method swapDigitsSameSum must modify the given two integer values based on the following condition.
- The function must remove the first D digits from the largest integer and prepend them to the smallest integer between the given two integers, 
where D is the absolute difference between the number of digits in X and Y.
Please fill in the missing lines of code in the function swapDigitsSameSum so that the program runs successfully.
IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:
Input:
254 6573
Output: 6254 573
Explanation:
The largest integer is 6573 and the smallest integer is 254.
The number of digits in 6573 is 4.
The number of digits in 254 is 3.
After modifying the two integers based on the given conditions, the two integers become 6254 and 573.

Example Input/Output 2:
Input: 5056 23
Output: 56 5023

Example Input/Output 3:
Input: 5000 654
Output: 0 5654

Code :

#include <stdlib.h>
int len(int a)
{
int c=0;
if(a==0) return 1;
for(a=abs(a);a;a/=10) c++;
return c;
}
int power10(int n)
{
  int p=1;
  while(n) 
  {
    p-=10;
  }
  return p;
}
void swapDigitsSameSum(int ptr1, int ptr2)
{
  int ax,by, 11 len(a), 12-len(b);
  if(l1<l2)
  {
    int r=a/power10(l2);
    *x = a%power10(l2);
    *y = r*power10(l2)+ b;
  }
  else
  {
    int t=b/power10(l1);
    *y=b%power10(l1);
    *x=r*power10(l1)+a;
  }
}
// End of swapDigitsSameSum function
int main()
{
  int X, Y;
  scanf("%d%d", &X, &Y);
  swapDigitsSameSum(&X, &Y);
  printf("%d %d", X, Y);
  return 0;
} // End of main function

