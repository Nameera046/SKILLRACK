// Count Common Set Bits
// The program must accept N integers as the input. The program must print the number of set bits that occur 
//   in the same positions from LSB(Least Significant Bit) of the given N integers as the output.

// Boundary Condition(s):
//   1 <= N <= 100
//   1 <= Each integer value <= 10^8

// Input Format:
//     The first line contains N.
//     The second line contains N integer values separated by a space.

// Output Format:
//     The first line contains an integer representing the number of set bits that occur in the same positions from LSB.

// Example Input/Output 1:
//     Input:
//     4
//     11 75-57 59
//     Output: 2

// Explanation:
//   11->0001011
//   75-> 1001011 57-> 0111001
//   59-> 0111011

// 1st bit from LSB of all 4 integers are equal to 1.
// 4th bit from LSB of all 4 integers are equal to 1.
// So 2 printed as the output.

// Example Input/Output 2:
//     Input: 5 
//     486 495 299 431 511
//     Output: 3

CODE:
import java.util.*;
public class countCommonSetBits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
        for(int i=0;i<n;i++)
        {
        	int temp=arr[i];
        	String binary="";
        	while(temp>0)
        	{
        		binary=(temp%2)+binary;
        		temp/=2;
        	}
        	str[i]=binary;
        }
        int min=str[0].length();
        String minstr=str[0];
        for(int i=1;i<n;i++)
        {
        	if(str[i].length()<min)
        	{
        		min=str[i].length();
        		minstr=str[i];
        	}
        }
        int count=0;
        for(int i=0; i<min;i++)
        {
            int flag=0;
            char c = minstr.charAt(min-1-i); 
            for(int j=0;j<n;j++)
            {
                if(str[j].charAt(str[j].length()-1-i)!=c)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0 && c=='1')
            {
                count++;
            }
        }
        System.out.println(count);
	}

}
