function concatAndConvertToOctal

The function/method concatAndConvertToOctal accepts two arguments - SIZE and arr. The integer SIZE represents the size of the integer array arr.
The function/method concatAndConvertToOctal must find the binary representation of each integer in the given array. 
Then the function must concatenate all the binary representations and print its the octal equivalent.
Your task is to implement the function concatAndConvertToOctal so that the program runs successfully.
IMPORTANT: Do not write the main() function as it is already defined.
Boundary Condition(s):
1 <= SIZE <= 100
1 <= Each integer value <= 10^6

Example Input/Output 1:
Input:
5 
45 127 32 19 25
Output: 2677701171
Explanation:
45->101101 
32->100000
127->1111111
19 > 10011
25 > 11001
The concatenated binary representation is given below.
10110111111111000001001111001
The octal equivalent is 2677701171.

Example Input/Output 2:
Input:
4 
9 10 4 2
Output: 
11522

CODE:

#include<stdio.h>
#include<math.h>
#include<ctype.h>
#include<stdlib.h>
void concatAndConvertToOctal(int n, int arr[])
{
    int k=0;
    char *str=NULL;
    for(int i=0;i<n;i++)
    {
        int index=0;
        char *binary=NULL;
        int temp=arr[i];
        while(temp>0)
        {
            binary=realloc(binary,(index+2));
            binary[index++]=(temp%2)+'0';
            temp/=2;
        }
        binary[index]='\0';
        for(int j=index-1;j>=0;j--)
        {
            str=realloc(str,(k+2));
            str[k++]=binary[j];
        }
    }
    str[k]='\0';
    long long int res=0;
    int power=1;
    int *result=0;
    int a=0;
    int bc=0;
    for(int i=k-1;i>=0;i--)
    {
        res+=(str[i]-'0')*power;
        power*=2;
        bc++;
        if (bc == 3 || i == 0)
        {
            result=realloc(result,(a+1)* sizeof(int));
            result[a++]=res;
            res = 0;
            power=1;
            bc=0;
        }
    }
    for(int i=a-1;i>=0;i--)
    {
        printf("%d",result[i]);
    }
}
int main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    concatAndConvertToOctal(n,arr);
}

- Time complexity: O(n * log M)
- Space complexity: O(n * log M)
