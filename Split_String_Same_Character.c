function splitStringSameCharacters

The function/method
splitStringSameCharacters accept an argument str representing a string value.
The function/method
splitStringSameCharacters must split the given string at which a character occurs exactly twice consecutively. Then the function must print the resulting words as the output.
Your task is to implement the function splitStringSameCharacters so that the program runs successfully.
IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:
Input:
moonlighttiger
Output:
mo onlight tiger
Explanation:
Here the given string is moonlighttiger.
The characters 'o' and 't' occur exactly twice consecutively.
After splitting the string at which the characters occur exactly twice consecutively, the string becomes mo onlight tiger

Example Input/Output 2:
Input:
aabbbccddddeeeeeeffgggg
Output:
a abbbc cddddeeeeeef fgggg

CODE:

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>

void splitStringSameCharacter(char *str)
{
    int i=0;
    while(str[i]!='\0')
    {
        int count=1;
        int st=i;
        while(str[i]==str[i+1] && str[i]!='\0')
        {
            count++;
            i++;
        }
        if(count==2)
        {
            printf("%c %c",str[st],str[st]);
        }
        else
        {
            for(int j=0;j<count;j++)
            {
                printf("%c",str[st]);
            }
        }
        i++;
    }
}
int main()
{
    int size = 1000;
    char *str = malloc(size);
    fgets(str, size, stdin);
    splitStringSameCharacter(str);
    return 0;
}
- Time complexity: O(n)
- Space complexity: O(1)
