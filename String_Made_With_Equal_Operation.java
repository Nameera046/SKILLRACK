Check if Strings Can be Made Equal With Operations I

You are given two strings s1 and s2, both of length 4, consisting of lowercase English letters.
You can apply the following operation on any of the two strings any number of times:
Choose any two indices i and j such that j - i = 2, then swap the two characters at those indices in the string.
Return true if you can make the strings s1 and s2 equal, and false otherwise.

Example 1:
Input: s1 = "abcd", s2 = "cdab"
Output: true
Explanation: We can do the following operations on s1:
- Choose the indices i = 0, j = 2. The resulting string is s1 = "cbad".
- Choose the indices i = 1, j = 3. The resulting string is s1 = "cdab" = s2.

Example 2:
Input: s1 = "abcd", s2 = "dacb"
Output: false
Explanation: It is not possible to make the two strings equal.

---------CODE-----------

import java.util.*
class Solution 
{
    public boolean canBeEqual(String s1, String s2) 
    {
        if(s1.equals(s2)) return true;
        for(int i=0;i<3;i++)
        {
            for(int j=i+1;j<4;j++)
            {
                if(j-i==2)
                {
                    char[] arr=s1.toCharArray();
                    char a=arr[j];
                    char b=arr[i];
                    arr[i]=a;
                    arr[j]=b;
                    String temp=new String(arr);
                    if(temp.equals(s2)) 
                    {
                        return true;
                    }
                    char[] arr2 = temp.toCharArray();
                    int x = (i == 0) ? 1 : 0;
                    int y = x + 2;
                    char c = arr2[y];
                    char d = arr2[x];
                    arr2[x] = c;
                    arr2[y] = d;
                    
                    if(new String(arr2).equals(s2)) return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        boolean result=canBeEqual(String s1, String s2)
        System.out.println(result);
    }
}

--Time Complexity: O(1)
--Space Complexity: O(1)
