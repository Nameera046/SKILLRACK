function contains ConcatenatedWord

The function/method containsConcatenatedWord accepts an argument str. The string str contains multiple words separated by a space.
The function/method contains Concatenated Word must return 1 if the given str contains a word which is equal to the concatenation of any two words in any order. 
Else the function must return 0.
Your task is to implement the function contains Concatenated Word so that the program runs successfully.
IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:
Input:
rat lion cat ratcat tiger
Output:
1
Explanation:
rat + cat ratcat, which is equal to the 4th word in the given string.
Hence 1 is printed.

Example Input/Output 2:
Input:
rat lion cat ratcatpig tiger
Output: 0

Example Input/Output 3:
Input:
zebra fox monkey donkey wolf donkeyfox
Output: 1

CODE :

#include<stdio.h>
#include<string.h>
int concatenatedwords(char *a)
{
    char b[100][1000];
    int c=0;
    char *d=strtok(a," ");
    while(d)
    {
        strcpy(b[c++],d);
        d=strtok(NULL," ");
    }
    for(int e=0;e<c;e++)
    {
        for(int f=0;f<c;f++)
        {
            char g[10000];
            strcpy(g,b[e]);
            strcat(g,b[f]);
            for(int h=0;h<c;h++)
            {
                if(strcmp(g,b[h])==0)return 1;
            }
        }
    }
    return 0;
}
int main()
{
    char str[2000];
    scanf("%[^\n]",str);
    int result=concatenatedwords(str);
    printf("%d",result);
}

-Time Complexity:** O(c^3 * L)
-Space Complexity:** O(c * 1000 + 10000)
