function sortBasedOnDigits

The function/method sortBasedonDigits accepts two arguments SIZE and arr. The integer SIZE represents the size of the integer array arr.
The function/method sortBasedonDigits must sort the integers in the given array based on digits starting from the most significant digit.

Example Input/Output 1:
Input:
6 
200 2 22 32 3 4
Output:
2 200 22 3 32 4
Explanation:
Here N-6 and the given 6 integers are 200 2 22 32 3 4.
After sorting the given array based on digits starting from the most significant digit, the array becomes 2 200 22 3 32 4.

Example Input/Output 2:
Input:
5 
124 1201 204 230 104
Output: 
104 1201 124 204 230

------------CODE------------

#include <stdio.h>
#include<string.h>
#include<ctype.h>
void sortBasedOnDigits(int SIZE, int arr[])
{
    char str1[20],str2[20];
    for(int i=0;i<SIZE-1;i++)
    {
        for(int j=0;j<SIZE-i-1;j++)
        {
            sprintf(str1,"%d",arr[j]);
            sprintf(str2,"%d",arr[j+1]);
            if(strcmp(str1,str2)>0)
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}
int main() {
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    sortBasedOnDigits(n,arr);
    for(int i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }
    return 0;
}

-- Time complexity: O(n^2), dominated by bubble sort.
-- Space complexity: O(1), as only fixed-size auxiliary variables are used.
