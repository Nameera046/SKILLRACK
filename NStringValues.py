N String Values - First & Last

The program must accept N string values and an integer K as the input. The program must form a string S basedon the following conditions.
- The string S is formed by concatenating the first K characters from the string values present in the odd positions and the last K characters from the string values present in the even positions alternatively.
- Once K characters are used from the string values, they must be removed from the string values.
Similarly, the program must repeat the above processes until all the characters are removed from all the string values. If the number of characters in a string is less than K, 
then all the characters from the string must be used and removed from that string, and then the value of K must be incremented by 1.
Finally, the program must print the string S as the output.

Boundary Condition(s):
2 <= N <= 100
1 <= Length of each string <= 100
1 <= K <= 20

Input Format:
The first line contains N.
The next N lines, each contains a string value.
The N+2nd line contains K.
Output Format:
The first line contains S.

Example Input/Output 1:
Input:
4
skillrack
coding
pythonprogramming
2computers
4
Output:
skildingpythterslraccoonprocompukgrammin2g
Explanation:
The way in which the string S formed is given below.
skil + ding + pyth + ters + Irac + co + onpro + compu + k + grammin + 2 + g
Hence the output is
skildingpythterslraccoonprocompukgrammin2g

CODE :

a=int(input());b=[[0,input().strip()] for _ in range(a)]
c=int(input());d="";e=0
while not all(g[1]=='' for g in b):
    f=b[e][1]
    if f:
        if len(f)<c:d+=f;b[e][1]='';c+=1
        elif e%2==0:d+=f[:c];b[e][1]=f[c:]
        else:d+=f[-c:];b[e][1]=f[:-c]
    else:c+=1
    e=(e+1)%a
print(d)
