String Substring Count

A string S is passed as the input and another string E is also passed as the input. 
The program must print the number of times E appears in string S. The alphabets in both S and E will be in lower case.

Input Format:
The first line contains S.
The second line contains E.
Output Format:
The first line contains the number of times the string E is present in S.

Boundary Conditions:
2 Length of a String Value S and E << 500

Example Input/Output 1:
Input:
eye
Output:
6

--------python code-------

a=input().strip();b=input().strip()
c=len(a);d=len(b);e=0
for i in range(c-d+1):e+=1 if a[i:i+d]==b else 0
print(e)
