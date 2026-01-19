function find MinMaxin TwoArrays

The function/method findMinMaxInTwoArrays accepts five arguments - SIZE1, arr1, SIZE2, arr2 and K. The integer SIZE1 represents the size of the integer array arr1. 
The integer SIZE2 represents the size of the integer array arr2. K represents an integer value.
The function/method findMinMaxInTwoArrays must find the count of integers greater than K in the array arr1 as X and the count of integers smaller than K in the array arr2 as Y. 
Then the function must return an integer representing the maximum value between X and Y.
IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:
Input:
5 6
10 17 13 6 16
15 8 23 6 33 78
10
Output: 3
Explanation:
Here K = 10.
There are 3 integers greater than 10 in the 1st array 17, 13 and 16.
There are 2 integers smaller than 10 in the 2nd
array -> 8 and 6.
The maximum value between 3 and 2 is 3.
Hence 3 is printed as the output.

Example Input/Output 2:
Input:
7 6
68 92 94 12 34 93 14
90 27 37 26 12 83 
50
Output:
4

CODE:

#include<stdio.h>
int findminmax(int s1,int s2,int arr1[],int arr2[],int k)
{
    int c1=0,c2=0;
    for(int i=0;i<s1;i++)
    {
        if(arr1[i]>k)
        {
            c1++;
        }
    }
    for(int i=0;i<s2;i++)
    {
        if(arr2[i]<k)
        {
            c2++;
        }
    }
    if(c1>c2)
    {
        return c1;
    }
    else
    {
        return c2;
    }
}
int main()
{
    int size1,size2;
    scanf("%d %d",&size1,&size2);
    int arr1[size1],arr2[size2];
    for(int i=0;i<size1;i++)
    {
        scanf("%d",&arr1[i]);
    }
    for(int i=0;i<size2;i++)
    {
        scanf("%d",&arr2[i]);
    }
    int k;
    scanf("%d",&k);
    int result=findminmax(size1,size2,arr1,arr2,k);
    printf("%d",result);
}

-Time complexity is O(s1 + s2)// in the function it run s1 times + s2 times.
-space complexity is O(s1 + s2)// because of the arr1 and arr2 storage 
