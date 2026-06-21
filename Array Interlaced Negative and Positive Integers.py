Array Interlaced Negative and Positive Integers

The program must accept an integer array of size N as input. 
The program must print the negative integers interlaced with the positive integers as in the same order in the given array.

Boundary Condition(s):
1 <= N <= 1000

Input Format:
The first line contains the value of N.
The second line contains N integers separated by space(s).
Output Format:
The first line contains the negative integers interlaced with the positive integers separated by space(s).

Example Input/Output 1:
Input:
5
20 30 40-16-27
Output:
-16 20-27 30 40

Example Input/Output 2:
Input:
4
2 10 8 5
Output: 
2 10 8 5

------------------------CODE-------------------------------

a=int(input());b=list(map(int,input().split()));c=d=0
e,f=[g for g in b if g<0],[g for g in b if g>0]
while c<len(e) and d<len(f): print(e[c],f[c],end=" ");c+=1;d+=1
while c<len(e):print(e[c],end=" ");c+=1
while d<len(f):print(f[d],end=" ");d+=1

------time complexity: O(n).
------Space complexity: O(n)
