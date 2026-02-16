Reverse bits of a given 32 bits signed integer.

Example 1:
Input: n = 43261596
Output: 964176192
Explanation:
Integer	 | Binary
43261596	00000010100101000001111010011100
964176192	00111001011110000010100101000000
  
Example 2:
Input: n = 2147483644
Output: 1073741822
Explanation:
Integer	   | Binary
2147483644	01111111111111111111111111111100
1073741822	00111111111111111111111111111110

---CODE-----
  
package sumoftheintegerdivisiblebyk;
import java.util.*;
public class Reverse_Bit {

	public static int reverseBit(int n)
	{
		int a=0;
		String word="";
		while(n>0)
		{
			a=n%2;
			word+=a;
			n/=2;
		}
		while(word.length()<32)
		{
			word+=0;
		}
		int sum=0;
		for(int i=word.length()-1,j=0;i>=0;i--,j++)
		{
			sum+=(word.charAt(i)-'0')*Math.pow(2,j);
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=reverseBit(n);
		System.out.println(result);
	}
}

// --Time Complexity : O(log n);
// --Space Complexity : O(1);

------------Optimised Code----------------------

package sumoftheintegerdivisiblebyk;
import java.util.*;
public class Reverse_Bit {

	public static int reverseBit(int n)
	{
		int sum=0;
		for(int i=0;i<32;i++)
		{
			sum<<=1;
			sum|=(n&1);
			n>>>=1;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=reverseBit(n);
		System.out.println(result);
	}
}

//--Time Complexity : O(log n);
//--Space Complexity : O(1);
