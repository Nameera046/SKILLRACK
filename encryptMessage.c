FUNCTION EncryptMessage

The function/method encryptMessage accepts two arguments message and key representing two string values. 
The string message contains only lower case alphabets. The string key contains only unique lower case alphabets.

The function/method encrypt Message must form a new string by encrypting the given message based on the following conditions.
- All 26 lower case alphabets from a to z must be mapped with the alphabets in the string key.
- If the number of alphabets in the key is less than 26, then the missing lower case alphabets must be added to key in alphabetical order.
For each alphabet CH in the message, the function must find the alphabet from the key which is mapped to CH and form the encrypted string.
Finally, the function must return the encrypted string.
Your task is to implement the function encryptMessage so that the program runs successfully.
IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:
Input:
skillrack
master
Output:
pgdhhomsg

Explanation:
Message = "skillrack"
Key = "master"
Here the number of alphabets in the key is less than 26. So the missing lower case alphabets are added in alphabetical order.
abcdefghijklmnopqrstuvwxyz (26 lower case alphabets)
masterbcdfghijklnopquvwxyz (encryption key)
So "skillrack" is encrypted as "pgdhhomsg".

Example Input/Output 2:
Input:
computerscience
abcghimnostuy
Output:
ceyfqphkicohdch

code:

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
char* encryptMessage(char *message, char *key)
{
    int msglen=strlen(message);
    char *result = (char*)malloc(msglen + 1);
    char alphabets[27];
    int k=0;
    for(char i='a';i<='z';i++)
    {
        alphabets[k++]=i;
    }
    alphabets[k]='\0';
    printf("%s",alphabets);
    char keystr[27];
    int keylen=strlen(key);
    for(int i=0;i<keylen;i++)
    {
        keystr[i]=key[i];
    }
    keystr[keylen] = '\0';
    int len=keylen;
    for(char i='a';i<='z';i++)
    {
        int flag=0;
        for(int j=0;j<keylen;j++)
        {
            if(key[j]==i)
            {
                flag=1;
                break;
            }
            else
            {
                flag=0;
            }
        }
        if (flag==0)
        {
            keystr[len++]=i;
        }
    }
    keystr[len] = '\0';
    printf("\n%s",keystr);
    int a=0;
    for(int i=0;i<strlen(message);i++)
    {
        int index=0;
        for(int j=0;j<strlen(alphabets);j++)
        {
            if(message[i]==alphabets[j])
            {
                index=j;
                break;
            }
        }
        result[a++]=keystr[index];
    }
    result[a] = '\0';
    return result;
}
int main()
{
    char message[10000];
    char key[10000];
    scanf("%s %s",message,key);
    char *encrypted =encryptMessage(message,key);
    printf("\n%s\n",encrypted);
}

Time Complexity : O(n+k)
Space Complexity : O(n)
