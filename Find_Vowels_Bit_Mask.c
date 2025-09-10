// function findVowels BitMask

//   The function/method findVowelsBitMask accepts an argument str representing a string value
//   The function/method findVowels BitMask must return an integer value X whose binary representation indicates the presence of vowels in the given string by ignoring case. 
//   The 5 vowels (aeiou or AEIOU) are mapped to 5 bits in the binary representation of X starting from LSB(least significant bit). The presence of the vowels must be 
//   indicated by the set bits in the binary representation of X.
//   Your task is to implement the function findVowelsBitMask so that the program runs successfully.


// Example Input/Output 1:
// Input:
// SkillRack
// Output: 5

// Explanation:
//     There are two vowels 'i' and 'a' in the string "SkillRack".
//     So the binary representation of X = 00101.
//     The 1st bit from LSB indicates the presence of the vowel 'a'.
//     The 3rd bit from LSB indicates the presence of the vowel 'T.
//     The decimal equivalent of 00101 is 5.

// Example Input/Output 2:
// Input:
// Archaeologist
// Output: 15
// Explanation:
//   The binary representation of 15 is 01111.
//   The last four bits indicate the presence of the vowels 'o', 'i', 'e' and 'a'.

CODE:

#include<stdio.h>
#include<string.h>
#include<math.h>
int vowelsBitMask(char str[])
{
    int bit[5]= {0};
    int len=strlen(str);
    for(int i=len-1; i>=0; i--)
    {
        if(str[i]=='a'||str[i]=='A')
        {
            bit[4]=1;
        }
        else if(str[i]=='e'||str[i]=='E')
        {
            bit[3]=1;
        }
        else if(str[i]=='i'||str[i]=='I')
        {
            bit[2]=1;
        }
        else if(str[i]=='o'||str[i]=='O')
        {
            bit[1]=1;
        }
        else if(str[i]=='u'||str[i]=='U')
        {
            bit[0]=1;
        }
    }
    int sum=0;
    for(int i=0,j=4; i<5; i++,j--)
    {
        sum+=bit[j]*pow(2,i);
    }
    return sum;
}
int main()
{
    char str[100];
    int bit[5]= {0};
    scanf("%s",str);
    printf("%d",vowelsBitMask(str));
}
