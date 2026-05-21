Transpose of Matrix
Accept an integer matrix as the input. The program must print the transpose of the given matrix as the output.
Note: Read the input carefully to avoid errors.

Boundary Condition(s):
1 <= Number of rows and columns <= 100

Input Format:
The list of lines contain the elements of an integer matrix.
Output Format:
The list of lines contain the transpose of the given matrix.

Example Input/Output 1:
Input:
1 2 3
4 5 6
7 8 9
Output:
1 4 7
2 5 8
3 6 9

Example Input/Output 2:

Input:

23 34 56 67 89
12 34 45 34 56
23 45 54 98 90

Output:

23 12 23
34 34 45
56 45 54
67 34 98
89 56 90

-----------CODE-------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<int[]> arr=new ArrayList<>();
		while(sc.hasNextLine())
		{
		    String str=sc.nextLine();
		    String[] s=str.split(" ");
		    int[] temp=new int[s.length];
		    for(int i=0;i<s.length;i++)
		    {
		        temp[i]=Integer.parseInt(s[i]);
		    }
		    arr.add(temp);
		}
		int[][] a1=new int[arr.size()][arr.get(0).length];
		for(int i=0;i<arr.size();i++)
		{
		    for(int j=0;j<arr.get(i).length;j++)
		    {
		        a1[i][j]=arr.get(i)[j];
		    }
		}
		int[][] res=new int[arr.get(0).length][arr.size()];
		for(int i=0;i<arr.get(0).length;i++)
		{
		    for(int j=0;j<arr.size();j++)
		    {
		        res[i][j]=a1[j][i];
		    }
		}
		for(int i=0;i<res.length;i++)
		{
		    for(int j=0;j<res[i].length;j++)
		    {
		        System.out.print(res[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}

--Time Complexity : O(n*m)
--Space Complexity : O(n*m)
