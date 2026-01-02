function findSumDifferent Base

The function/method findSumDifferentBase accepts an argument str. The string str contains integers separated by a space, but the base of each integer 
is denoted by the preceding alphabet in that integer.
The base values of the integers can be any of the following.
B or b - Binary
O or o Octal
D or d - Decimal
H or h - Hexadecimal
The function/method findSumDifferentBase must find the decimal equivalent of each integer in the given string. Then the function must return an integer representing the 
sum of the obtained decimal values.
Your task is to implement the function findSumDifferentBase so that the program runs successfully.

Example Input/Output 1:
Input:
b1110 d150 023 H2AF
Output:
870
Explanation:
There are four integers in the given string.
b1110 -> Binary to Decimal -> 14.
d150 -> Decimal -> 150.
023 -> Octal to Decimal -> 19.
H2AF -> Hexadecimal to Decimal -> 687.
14+150+19+687=870.

Example Input/Output 2:
Input:
D10 B10 010 H10 HEF 067 b11 D89
Output:
422

Max Execution Time Limit: 50 millisecs


CODE:

#include<stdlib.h>
#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include<math.h>
int findSumDifferentBase(char *str)
{
    char *token=strtok(str," ");
    int sum=0;
    while(token!=NULL)
    {
        int num=0;
        int len=strlen(token);
        if(token[0]=='b'|| token[0]=='B')
        {
            for(int j=len-1,k=0;j>0;j--,k++)
            {
                num+=(token[j]-'0')*(1<<k);
            }
        }
        else if(token[0]=='d'|| token[0]=='D')
        {
            num=atoi(token+1);
        }
        else if(token[0]=='o'|| token[0]=='O')
        {
            for(int j=len-1,k=0;j>0;j--,k++)
            {
                num+=(token[j]-'0')*pow(8,k);
            }
        }
        else if(token[0]=='h'|| token[0]=='H')
        {
            for(int j=len-1,k=0;j>0;j--,k++)
            {
                if(isdigit(token[j]))
                {
                    num+=(token[j]-'0')*pow(16,k);
                }
                else
                {
                    num+=(toupper(token[j])-'A'+10)*pow(16,k);
                }
            }
        }
        sum+=num;
        token=strtok(NULL," ");
    }
    return sum;
}

int main()
{
    char str[10000];
    scanf("%s",str);
    printf(findSumDifferentBase(str));
}

- Time complexity: O(N * L), where N is the number of tokens and L is the maximum token length.
- Space complexity: O(1) (excluding input storage).
