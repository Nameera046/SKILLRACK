Replace Vowels by Consonants and Vice versa

The program must accept a string S as the input. The program must replace every vowel in the string S by the next consonant (alphabetical order) 
and replace every consonant in the string S by the next vowel (alphabetical order).
Finally, the program must print the modified string as the output.
Note: All the alphabets in the string S must be in lower case.

Boundary Condition(s):
1 <= Length of S <= 100

Input Format:
The first line contains the value of string S.
Output Format:
The first line contains the modified string.

Example Input/Output 1:
Input:
orange
Output: 
puboif

Example Input/Output 2:
Input:
mergesort
Output: 
ofuifupuu

---------------------------CODE---------------------------------

import java.util.*;
public class Hello 
{
    public static boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            return true;
        }
        return false;
    }
    public static char findNextConsonant(char ch)
    {
        int k=(ch-'a'+1);
        while(true)
        {
            char r=(char)((k%26)+'a');
            if(!isVowel(r))
            {
                return r;
            }
            k++;
        }
    }
    public static char findNextVowel(char ch)
    {
        int k=(ch-'a'+1);
        while(true)
        {
            char r=(char)((k%26)+'a');
            if(isVowel(r))
            {
                return r;
            }
            k++;
        }
    }
    public static void main(String[] args) 
    {
      	Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ans="";
        for(char s:str.toCharArray())
        {
            if(isVowel(s))
            {
                char ch=findNextConsonant(s);
                ans+=ch;
            }
            else
            {
                char ch=findNextVowel(s);
                ans+=ch;
            }
        }
        System.out.print(ans);
    }
}

-----Time Complexity : O(n)
-----Space Complexity : O(1)
