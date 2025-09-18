// SWEET_SEVENTEEN

// Given a maximum of four digits to the base 17(10 -> A, 11 -> B, 12 -> C, 16 -> G) as 
// input, output its decimal value.
// Input:
// 23GF
// Output:
// 10980

CODE:
import java.util.*;
public class sweet_Senteen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int sum=0;
		for(int i=str.length()-1,j=0;i>=0;i--,j++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				sum+=(str.charAt(i)-'0')*Math.pow(17, j);
			}
			else if(Character.isLetter(str.charAt(i)))
			{
				if(str.charAt(i)=='A')
				{
					sum+=10*Math.pow(17, j);
				}
				else if(str.charAt(i)=='B')
				{
					sum+=11*Math.pow(17, j);
				}
				else if(str.charAt(i)=='C')
				{
					sum+=12*Math.pow(17, j);
				}
				else if(str.charAt(i)=='D')
				{
					sum+=13*Math.pow(17, j);
				}
				else if(str.charAt(i)=='E')
				{
					sum+=14*Math.pow(17, j);
				}
				else if(str.charAt(i)=='F')
				{
					sum+=15*Math.pow(17, j);
				}
				else if(str.charAt(i)=='G')
				{
					sum+=16*Math.pow(17, j);
				}
			}
		}
		System.out.println(sum);
	}

}
