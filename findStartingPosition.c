function findStarting Position

The function/method findStarting Position accepts four arguments R, C, matrix and str. The integers R and C represent the size of the character matrix. 
The given matrix contains the string str in any of its columns(i.e., the string str occurs exactly in one column in forward or reverse order).
The function/method findStarting Position must return an array of size 2 representing the position of the first character of the string in the matrix.
Note: The first character and the last character of the given string are always distinct.
Your task is to implement the function findStarting Position so that the program runs successfully.
IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1
Input:
4 5
a b c d e
f l o i c 
k o o n o
c c l d e
cool
Output: 1 3
Explanation:
The string "cool" occurs in the 3rd column of the matrix(starting from the 1st row). Hence the output is 13

Example Input/Output 2:
Input:
4 5
a a g d e 
o v d o b
f o y k y 
f s c l r 
bye
Output:
3 5

CODE:

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int* findstartingposition(int r, int c,char mat[r][c], char *str)
{
    int len = strlen(str);
    int pos[2];
    for(int i = 0; i < c; i++)
    {
        for(int j = 0; j < r; j++)
        {
            if(mat[j][i]==str[0])
            {
                if(j+len-1<=r-1)
                {
                    int flag=0;
                    for(int k=0;k<len;k++)
                    {
                        if(mat[j+k][i]!=str[k])
                        {
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0)
                    {
                        pos[0]=j+1;
                        pos[1]=i+1;
                        return pos;
                    }
                }
                else if(j+len-1>=strlen(str))
                {
                    int flag=0;
                    for(int k=0;k<strlen(str);k++)
                    {
                        if(mat[j-k][i]!=str[k])
                        {
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0)
                    {
                        pos[0]=j+1;
                        pos[1]=i+1;
                        return pos;
                    }
                }
            }

        }
    }
}
int main()
{
    int r,c;
    scanf("%d %d",&r,&c);
    char mat[r][c];
    for(int i=0; i<r; i++)
    {
        for(int j=0; j<c; j++)
        {
            scanf(" %c",&mat[i][j]);
        }
    }
    char str[100];
    scanf("%s",str);
    int *pos=findstartingposition(r,c,mat,str);
    printf("%d %d",pos[0],pos[1]);
}
