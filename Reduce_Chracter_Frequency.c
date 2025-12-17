function reduce Character requency

The function/method reduceCharacter Frequency accepts two arguments str and K representing a string value and an integer value respectively.
The function/method reduceCharacter Frequency must remove the characters after their Kth occurrence in the given string(from left to right). 
Then the function must return the revised string as a new string.
Your task is to implement the function reduceCharacter Frequency so that the program runs successfully.
IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:
Input:
aabbabcdccbab
2
Output:
aabbcdc
Explanation:
Here the given string is aabbabcdccbab and K=2.
After removing the characters that occur more than 2 times in the given string, the string becomes aabbcdc.

Example Input/Output 2:
Input:
TOOLONGTOURtoolongtour
2
Output:
TOOLNGTURtoolngtur

CODE:

#include<stdio.h>
#include<string.h>
char* repeatedFrequency(char *str,int k)
{
    static char res[100];
    int freq[256]={0};
    int b=0;
    for(int i=0;i<strlen(str);i++)
    {
        if(freq[str[i]]>=k)
        {
            continue;
        }
        else{
            freq[str[i]]++;
            res[b++]=str[i];
        }
    }
    res[b]='\0';
    return res;
}
int main()
{
    char str[100];
    int k;
    scanf("%s %d",str,&k);
    char* result;
    result=repeatedFrequency(str,k);
    printf("%s",result);
}


- Time complexity: O(n) (assuming strlen is called once outside the loop)
- Space complexity: O(1)
