// Function String To Decimal

// The function/method string To Decimal accepts an argument str representing a string value. The string str contains only alphabets.
// The function/method string To Decimal must return an integer X whose binary representation is formed by replacing each odd ASCII alphabet with 1 and each even ASCII alphabet with 0 in the given string.
// Your task is to implement the function string ToDecimal so that the program runs successfully.
// IMPORTANT: Do not write the main() function as it is already defined.

// Boundary Condition(s):
// 1 <= Length of the string str <= 50

// Example Input/Output 1: 
// Input: Moon
// Output: 14

// Explanation:
// The ASCII value of M is 77.
// The ASCII value of o is 111.
// The ASCII value of n is 110.
// So Moon-> 1110 -> 14.

// Example Input/Output 2: 
// Input: Southindia
// Output: 915

//   CODE:

#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<math.h>
long long int functionStringToDecimal(char *str)
{
    char *binary=(char *)malloc((strlen(str))*sizeof(char));
    for(int i=0; i<strlen(str); i++)
    {
        int a=(int)(str[i]);
        if(a%2==0)
        {
            binary[i]='0';
        }
        else
        {
            binary[i]='1';
        }
    }
    binary[strlen(str)] = '\0';
    long long int sum=0;
    for (int i = strlen(binary) - 1,j=0; i >= 0; i--)
    {
        long long int bit = binary[i] - '0';
        sum += bit * pow(2, j);
        j++;
    }
    return sum;
}
int main()
{
    char str[51];
    scanf("%s",str);
    printf("%lld",functionStringToDecimal(str));
}
