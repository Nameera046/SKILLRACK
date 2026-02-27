Sort Alphabets Odd ASCII

The program must accept a string S containing only alphabets as the input.
The program must sort the alphabets having odd ASCII values in their positions and keep the other alphabets in their same positions in the string S. 
Then the program must print the modified string S as the output.

Boundary Condition(s): 2 Length of S <= 100

Input Format:
The first line contains S.
Output Format:
The first line contains the modified string S.

Example Input/Output 1:
Input:
skillrack
Output:
acillrkks
Explanation:
Here S = "skillrack".
The alphabets that are having the odd ASCII values are s, k, i, a, c and k.
After sorting the alphabets based on the given conditions, the string becomes acillrkks.
Hence the output is acillrkks.

Example Input/Output 2:
Input:
DOWNLOAD
Output: 
DAONLOWD

------------CODE-------------

package Skillrack;
import java.util.*;
public class sort_Alphabets_odd_ASCII 
{
    public static String sortOdd(String s)
    {
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]-'a'>arr[j]-'a')
                {
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) 
    {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    char[] arr= str.toCharArray();
	    StringBuilder sb=new StringBuilder();
	    for(int i=0;i<arr.length;i++)
	    {
	        if((arr[i]-'a'+1)%2!=0)
	        {
	            sb.append(arr[i]);
	        }
	    }
	    String s=sortOdd(sb.toString());
	    int k=0;
	    for(int i=0;i<arr.length;i++)
	    {
	        if((arr[i]-'a'+1)%2!=0)
	        {
	            arr[i]=s.charAt(k++);
	        }
	    }
	    for(int i=0;i<arr.length;i++)
	    {
	        System.out.print(arr[i]);
	    }
	}
}

---Time Complexity: O(n^2) in the worst case due to the bubble sort implementation.
---Space Complexity: O(n) for storing the input and extracted characters.
