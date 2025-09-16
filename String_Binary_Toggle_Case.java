// String-Binary Toggle Case
  
// The prograrn must accept a string S and an integer X as the input. The program must print two string values based on the following conditions.
// For each 1s from MSB in the binary representation of X, the program must toggle the characters in the same position to upper case and for each Os,
// the program must toggle the characters to lower case. The remaining characters in the string S must not be altered. Then the program must print the 
// modified string in the first line of output.
// - For each is from LSB in the binary representation of X, the program must toggle the characters in the same position to upper case and for each Os, 
//   the program must toggle the characters to lower case. The remaining characters in the string S must not be altered. Then the program must print the 
//   modified string in the second line of output.
  
// Note: The length of the string S is always greater than or equal to the number of bits in the binary representation of X.

// Boundary Condition(s):
// 1 <= Length of S <= 100 1 <= x <= 10^8

// Input Format:
// The first line contains S.
// The second line contains X.
// Output Format:
// The first line contains a string value.
// The second line contains a string value.

// Example Input/Output 1:
// Input:
// BasketBall
// 23
// Output:
// BaSKEtBall 
// BaskeTbALL

// Explanation:
// Here the given string is BasketBall and the value of K is 23.
// The binary representation of 23 is 10111.
// BasketBall -> BaSKEtBall
// BasketBall -> BaskeTbALL
  
// Example Input/Output 2:
// Input:
// PAPER
// 10
// Output:
// PaPeR
// PApEr

CODE:
package string_binary_toggle_case;
import java.util.*;

public class string_binary_toggle_case 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=sc.nextInt();
		int temp=n;
		String binary="";
		while(temp>0)
		{
			binary=(temp%2)+binary;
			temp/=2;
		}
		System.out.println(binary);
		StringBuilder result=new StringBuilder();
		for(int i=0;i<binary.length();i++)
		{
			if(binary.charAt(i)=='1')
			{
				result.append(Character.toUpperCase(str.charAt(i)));
			}
			else if(binary.charAt(i)=='0')
			{
				result.append(Character.toLowerCase(str.charAt(i)));
			}
		}
		if (binary.length() < str.length()) 
		{
            result.append(str.substring(binary.length()));
        }
		String revStr = new StringBuilder(str).reverse().toString();
        String revBin = new StringBuilder(binary).reverse().toString();
        StringBuilder revResult = new StringBuilder();
        for (int i = 0; i < revBin.length(); i++) 
        {
            if (revBin.charAt(i) == '1') 
            {
                revResult.append(Character.toUpperCase(revStr.charAt(i)));
            }
            else if (revBin.charAt(i) == '0') 
            {
                revResult.append(Character.toLowerCase(revStr.charAt(i)));
            }
        }
        if (revBin.length() < revStr.length()) 
        {
            revResult.append(revStr.substring(revBin.length()));
        }
        String result1 = revResult.reverse().toString();
		System.out.println(result);
		System.out.println(result1);
	}

}

