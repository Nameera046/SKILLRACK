Sort Integer by the Number of the Bits

You are given an integer array arr. 
Sort the integers in the array in ascending order by the number of 1's in their 
binary representation and in case of two or more integers have the same number of 1's 
you have to sort them in ascending order.
Return the array after sorting it.


Example 1:
Input: arr = [0,1,2,3,4,5,6,7,8]
Output: [0,1,2,4,8,3,5,6,7]
Explantion: [0] is the only integer with 0 bits.
[1,2,4,8] all have 1 bit.
[3,5,6] have 2 bits.
[7] has 3 bits.
The sorted array by bits is [0,1,2,4,8,3,5,6,7]
		
Example 2:
Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
Output: [1,2,4,8,16,32,64,128,256,512,1024]
Explantion: All integers have 1 bit in the binary representation, you should just sort them in ascending order.
 
Constraints:
1 <= arr.length <= 500
0 <= arr[i] <= 10^4


------------CODE-------------


import java.util.*;
public class Sort_Integer_by_the_Number_of_Bits 
{
	 public static int[] sortByBits(int[] arr) {
        Map<Integer,List<Integer>> h=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int a=Integer.bitCount(arr[i]);
            int val=arr[i];
            if(h.containsKey(a))
            {
            	h.get(a).add(val);
            }
            else
            {
            	List<Integer> v=new ArrayList<>();
            	v.add(val);
            	h.put(a,v);
            }
        }
        List<Integer> res=new ArrayList<>();
        for(List<Integer> value : h.values())
        {
        	res.addAll(value);
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] res=sortByBits(arr);
		for(int i=0;i<res.length;i++) 
		{
			System.out.print(res[i]+" ");
		}
	}
}


//---Time Complexity : O(n log n)
//---Space Complexity : O(n)
