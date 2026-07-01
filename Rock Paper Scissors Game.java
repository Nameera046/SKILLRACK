Rock Paper Scissors Game

Two players are playing Rock - Paper - Scissors game. The program must accept an integer N (number of rounds) as the input. 
The winner in each round is decided based on the following priority. Rock has more priority than scissors, 
scissors has more priority than paper and paper has more priority than rock. The program must print the player who wins the match as the output. 
If no one wins the match, then "Tie" is printed as the output.

Boundary Condition(s):
1 <= N <= 50

Input Format:
The first line contains the value of N.
The next N lines contain the choice of the two players each separated by space.
Output Format:
The first line contains either Tie or name of the player who wins the match.

Example Input/Output 1:
Input:
5
rock rock
paper rock
scissors paper
scissors rock
paper paper
Output: 
1
Explanation
At the end of 1st round, no one won the game.
At the end of 2nd round, the 1st player won the game.
At the end of 3rd round, the 1st player won the game.
At the end of 4th round, the 2nd player won the
game.
At the end of 5th round, no one won the game.
At the end of all rounds, the 1st player won more matches than the 2nd player. So, 1 is printed as output.

Example Input/Output 2:
Input:
3
paper scissors
paper paper scissors scissors
Output: 2
Example Input/Output 3:
Input:
4
scissors rock
rock scissors 
paper rock
rock paper
Output: 
Tie

------------------------------------CODE------------------------------------------

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
		    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int player1=0,player2=0;
        for(int i=0;i<n;i++)
        {
            String[] s=sc.nextLine().split(" ");
            if(s[0].equals("rock") && s[1].equals("scissors"))
            {
                player1++;
            }
            else if(s[0].equals("scissors") && s[1].equals("paper"))
            {
                player1++;
            }
            else if(s[0].equals("paper") && s[1].equals("rock"))
            {
                player1++;
            }
            else if(s[1].equals("rock") && s[0].equals("scissors"))
            {
                player2++;
            }
            else if(s[1].equals("scissors") && s[0].equals("paper"))
            {
                player2++;
            }
            else if(s[1].equals("paper") && s[0].equals("rock"))
            {
                player2++;
            }
        }
        if(player1>player2)
        {
            System.out.print(1);
        }
        else if(player2>player1)
        {
            System.out.print(2);
        }
        else if(player1==player2)
        {
            System.out.print("Tie");
        }
   	}
}

--Time Complexity : O(n)
--Space Complexity : O(1)
