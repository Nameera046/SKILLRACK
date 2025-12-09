function concat Binary

The function/method concat Binary accepts two arguments num1 and num2 representing two integer values. 
The integer num2 contains only 1s and Os denoting the binary representation of an integer X.
The function/method concatBinary must concatenate the binary representation of num1 and X.
Then the function must return an integer representing the decimal equivalent of the concatenated the binary representation.
Your task is to implement the function concatBinary so that the program runs successfully.

Example Input/Output 1:
Input:
5 110
Output: 
46
Explanation:
Here num1 = 5 and num2 = 110.
The binary representation of 5 is 101.
The concatenation of 101 and 110 is 101110.
The decimal equivalent of 101110 is 46.

Example Input/Output 2:
Input:
425 10011
Output: 
13619

Explanation:
Here num1 = 425 and num2 = 10011.
The binary representation of 425 is 110101001.
The concatenation of 110101001 and 10011 is 11010100110011.
The decimal equivalent of 11010100110011 is 13619.

code:

#include<stdio.h>
#include<string.h>
#include<math.h>
int concatbinary(int num1,int num2)
{
    int temp=num1;
    char binary[1000000];
    int k=0;
    while(temp>0)
    {
        binary[k++]=(temp%2)+'0';
        temp/=2;
    }
    binary[k]='\0';
    int len = strlen(binary);
    for (int i = 0; i < len / 2; i++)
    {
        char t = binary[i];
        binary[i] = binary[len - 1 - i];
        binary[len - 1 - i] = t;
    }
    sprintf(binary+len,"%d",num2);
    int result=0;
    int l=strlen(binary);
    for(int i=0,j=l-1;i<l;i++,j--)
    {
        result+=(binary[j]-'0')*pow(2,i);
    }
    return result;
}
int main()
{
    int num1,num2;
    scanf("%d %d",&num1,&num2);
    printf("\n%d",concatbinary(num1,num2));

}


Time Complexity : O(log n1 + log n2)
Space Complexity: O(log n1 + log n2)
