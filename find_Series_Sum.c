//  findSeriesSum

// The function/method findSeriesSum accepts an argument str representing a string value. 
// The string str contains a series of integers but some integers are denoted by their binary representations.
// The function/method findSeriesSum must find the decimal value for each binary representation in the given string. 
// Then the function must return an integer representing the sum of all the integers present in the given series.

// Your task is to implement the function findSeriesSum so that the program runs successfully.
// IMPORTANT: Do not write the main() function as it is already defined.
// Boundary Condition(s): 1 <= Each integer value in the series <= 10^7

// Example Input/Output 1:
// Input: 
// 45 32 1010 5 10111 60
// Output: 
// 175
// Explanation:
// In the given series, two integers are denoted by their binary representations.
// 1010 -> 10 
// 10111 > 23
// Sum = 45+32+10+5+23+60175.
  
// Example Input/Output 2: Input: 10 111 1005 1114 101
// Output: 2133

CODE: 

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
int findseriessum(char* str);
int main()
{
    char str[101];
    fgets(str, sizeof(str), stdin);
    printf("%d",findseriessum(str));
}
int findseriessum(char* str)
{
    int arr[101],k=0,t=0,sum=0;
    char temp[30];
    for(int i=0;i<strlen(str);i++)
    {
        int btodec=0;
        if(str[i]!=' '&& str[i] != '\n' && str[i] != '\0')
        {
            temp[t++]=str[i];
        }
        else
        {
            temp[t]='\0';
            int flag=0;
            for(int m=0;m<t;m++)
            {
                if(temp[m]!='0' && temp[m]!='1')
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                for(int p=t-1,j=0;p>=0;p--)
                {
                    btodec+=((temp[p]-'0'))*pow(2,j);
                    j++;
                }
                arr[k++]=btodec;
            }
            else if(flag==1)
            {
                arr[k++]=atoi(temp);
            }
            t=0;
        }
    }
    for(int i=0;i<k;i++)
    {
        sum+=arr[i];
    }
    return sum;
}

// Time Complexity :O(n)
// Space Complexity: O(1)
