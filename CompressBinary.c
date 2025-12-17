function compressBinary

The function/method compressBinary accepts an argument N representing an integer value.
The function/method compressBinary must compress the binary representation of N by replacing the consecutive 1s and Os with their sum. 
Then the program must return an integer representing the result of the binary compression.
Your task is to implement the function compressBinary so that the program runs successfully.

Boundary Condition(s):
1 <= N <= 10^5
  
Example Input/Output 1:
Input:
120
Output: 
40

Explanation:
The binary representation of 120 is 1111000.
After compressing the binary representation of 120, the binary representation becomes 40.
1111000-> (1+1+1+1)(0+0+0) -> 40
Hence 40 is printed as the output.
  
Example Input/Output 2:
Input:
2506
Output: 10301010
Explanation:
The binary representation of 2506 is 100111001010.
After compressing the binary representation of 2506, the binary representation becomes 10301010.
100111001010 -> (1)(0+0)(1+1+1)(0+0)(1)(0) (1) (0) -> 10301010
Hence 10301010 is printed as the output.

CODE : 

#include<stdio.h>
long long int compressBinary(int n)
{
    int binary[100];
    int k=0,m=0;
    int res[100];
    while(n>0)
    {
        binary[k++]=n%2;
        n/=2;
    }
    for (int i = 0; i < k / 2; i++)
    {
        int temp = binary[i];
        binary[i] = binary[k - i - 1];
        binary[k - i - 1] = temp;
    }
    binary[k]='\0';
    int sum=binary[0];
    for(int i=1;i<k;i++)
    {
        if(binary[i-1]==binary[i])
        {
            sum+=binary[i];
        }
        else
        {
            res[m++]=sum;
            sum=binary[i];
        }
    }
    res[m++]=sum;
    long long int ret=0;
    for(int i=0;i<m;i++)
    {
        int temp = res[i];
        if(temp == 0)
        {
            ret = ret * 10;
        }
        else
        {
            int digits[10], d = 0;
            while(temp > 0)
            {
                digits[d++] = temp % 10;
                temp /= 10;
            }
            for(int j = d - 1; j >= 0; j--)
            {
                ret = ret * 10 + digits[j];
            }
        }
    }
    return ret;
}
int main()
{
    int n;
    scanf("%d",&n);
    long long int result;
    result=compressBinary(n);
    printf("%lld",result);
}

- Time Complexity : O(log n)
- Space Complexity : O(1)
