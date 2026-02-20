function get Total Price

The function/method getTotalPrice accepts an argument str representing a text. The text contains the prices of some items as floating point values.
The function/method getTotalPrice must return a floating point value representing the total price of the items mentioned in the text.
Your task is to implement the function getTotalPrice so that the program runs successfully.
Note: The total price will be printed with the precision up to 2 decimal places.

Example Input/Output 1:
Input:
Cost of 5 pens is 50.98 rupees. Cost of a pencil is 4.25.
Output
55.23
Explanation:
There are two prices (50.98 and 4.25) mentioned in the given text.
So their sum is 55.23 which is printed as the output.

Example Input/Output 2:
Input:
A is 5.60, B is 2.14, C is 100.58 and D is 50.6.
Output:
158.92

#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include<stdlib.h>
double getTotalPrice(char *str)
{
    double total=0.0;
    int i=0;
    while(str[i]!='\0')
    {
        if(isdigit(str[i]))
        {
            int k=0,flag1=0,flag2=0;
            char bin[1000000];
            while(isdigit(str[i])||str[i]!='.')
            {
                if(str[i]=='.')
                {
                    flag1=1;
                }
                else if(flag1)
                {
                    flag2=1;
                }
                bin[k++]=str[i++];
            }
            bin[k]='\0';
            if(flag1 && flag2)
            {
                total+=atof(bin);
            }
        }
        else
        {
            i++;
        }
    }
    return total;
}
int main() 
{
    char str[1000];
    fgets(str, sizeof(str), stdin);
    double result=getTotalPrice(str);
    printf("%d",result);
    return 0;
}
// Time complexity: O(n)
// Space complexity: O(1)
