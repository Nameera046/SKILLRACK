Max Call Duration Call Logs

The program must accept the outgoing call logs of a mobile number as the input. 
Each call log contains the mobile number, call start time and end time. 
The program must print the mobile number having the maximum call duration. 
If there are two or more such mobile numbers having the maximum call duration, then the program must print them in the order of their occurrence.
Boundary Condition(s):
2<=N<=50

Input Format:
The first line contains N.
The next N lines, each contains the mobile number, call start time and end time separated by a space.
Output Format:
The lines contain the mobile number(s) having the maximum call duration.

Example Input/Output 1:
Input:
5
9876543210 07:08:00 07:09:32
9998887775 10:50:00 10:50:10
9876543210 10:50:45 10:55:00
9998887775 13:23:10 13:24:58
9998887775 17:05:27 17:06:40

Output:
9876543210

Explanation:
9876543210 (2 times) -> Total duration: 92 + 255 = 347 seconds.
9998887775 (3 times) -> Total duration: 10 + 108 = 73191 seconds.
The mobile number 9876543210 is having the maximum call duration.
Hence the output is 9876543210.

Example Input/Output 2:
Input:
6
9876543210 07:08:00 07:09:32
9998887775 10:50:00 10:50:10
9876543210 10:50:45 10:55:00
9998887775 13:23:10 13:24:58
9998887775 17:05:27 17:06:40
9998887775 17:10:00 17:12:36

Output:
9876543210
9998887775


------CODE--------

package Skillrack;
import java.util.*;
public class Max_Call_Duration_Call_Logs 
{
	public static void main(String[] args) 
  {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		Map<String,Integer> h=new LinkedHashMap<>();
		for(int i=0;i<n;i++)
		{
			String str=sc.nextLine();
			String[] parts=str.split(" ");
			String[] st=parts[1].split(":");
			String[] ed=parts[2].split(":");
			int sum1=Integer.parseInt(st[0])*3600+Integer.parseInt(st[1])*60+Integer.parseInt(st[2]);
			int sum2=Integer.parseInt(ed[0])*3600+Integer.parseInt(ed[1])*60+Integer.parseInt(ed[2]);
			int diff=(Math.abs(sum1-sum2));
			h.put(parts[0], h.getOrDefault(parts[0],0)+diff);
		}
		int maxlen=Collections.max(h.values());
		for(Map.Entry<String,Integer> entry:h.entrySet())
		{
			if(entry.getValue()==maxlen)
			{
				System.out.println(entry.getKey());
			}
		}
	}
}

--Time Complexity : O(n)
--Space Complexity : O(n)
