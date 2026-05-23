Word Count with Two Separators

A string with space is passed as input to the program. The words are separated by a comma or space or both. 
The program must print the total number of words in it.

Boundary Condition(s): 1 <= Length of string <= 100

Input Format:
The first line contains the string.
Output Format:
The first line contains the count of words.

Example Input/Output 1
Input: 
hi there,how, are you?
Output:
5

Example Input/Output 2:
Input:
bring,the, tomato
Output:
3

-------------------CODE-----------------

import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    String[] s=str.split("[ ,]+");
	    System.out.print(s.length);
	}
}
--Time Comeplexity : O(1)
--Space Compelxity : O(s.length());
