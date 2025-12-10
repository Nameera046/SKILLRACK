Split String into Words Length

The program must accept an integer N, a string S and N integers as the input. 
  The string S contains N words without any space. The N integers represent the length of words in the string S. The program must sort the words in the string S based on their length.
  If two or more words have the same length, then the program must sort those words in the order of their occurrence. Finally, the program must print the revised string S as the output.

Boundary Condition(s):
2 <= N <= 100
2 <= Length of S <= 10^4
1 <= Each integer value < 100
Input Format:
The first line contains N.
The second line contains S.
The third line contains N integers separated by a space.
Output Format:
The first line contains the revised string S.

Example Input/Output 1:
Input:
4
lioncattigerrat
4353
Output:
catratliontiger
Explanation:
There are 4 words in the given string.
4→ lion
3 -> cat
5-> tiger
3 -> rat
After sorting the words based on their length, the string S becomes
catratliontiger

Example Input/Output 2:
Input:
7
applegrapesmangocuckooPineappleNoodlesPizza
5656975
Output: 
applemangoPizzagrapescuckooNoodlesPineapple

CODE: 

package Skillrack;
import java.util.*;
public class Split_String_into_Words_length 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		sc.nextLine();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		sc.nextLine();
		String[] str1=new String[n];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			 StringBuilder sb=new StringBuilder();
		     for(int j=0;j<arr[i] && index<str.length() ;j++)
		     {
		    		 sb.append(str.charAt(index));
		    		 index++;
		     }
		     str1[i]=sb.toString();
		}
       for(int i = 1; i < n; i++)
        {
            String key = str1[i];
            int j = i - 1;
            
            while (j >= 0 && str1[j].length() > key.length())
            {
                str1[j + 1] = str1[j];
                j--;
            }
            str1[j + 1] = key;
        }
		for(int i=0;i<str1.length;i++)
		{
			System.out.print(str1[i]);
		}
	}
}

Time Complexity : O(n^2 +m)
Space Complexity: O(n+m)
