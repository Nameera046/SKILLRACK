Rook Game

Two players A and B are playing a game. In that game, there is a chessboard of size R*C, where they take turns placing the rooks. 
The cells with the rook are represented by 1. 
The empty cells are represented by O. In each turn, a player must place a rook.
A rook may be placed on the basis of the following conditions.
The cell must be an empty cell.
There should be no rook in the row and column of the cell.
When a player is unable to make a move, he loses and the game ends. 
The initial state of the chessboard is passed as the input to the program. 
The program must print the winner of the game if player A starts the game.
Note: Both the players have an infinite number of rooks to play the game.

Boundary Condition(s): 2 R, C 50

Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C integers separated by a space.
Output Format:
The first line contains A or B.

Example Input/Output 1:
Input:
3 3 
1 0 0 
0 0 0 
1 0 0
Output: A
Explanation:
If player A puts the rook in the cell (2, 3) or (2, 2), player B will have no moves. So A wins the game.

Example Input/Output 2:
Input:
3 2 
1 1 
0 1
1 0
Output: B
Explanation:
Here player A cannot make a move, so B wins the game.

Example Input/Output 3:
Input:
2 2 
0 0 
0 0
Output: B
Explanation:
The one possible way is given below.
Player A puts the rook in the cell (1, 1). 
Then player B puts the rook in the cell (2, 2). 
Now the player A cannot make a move, so B wins the game.

-----CODE------

package Skillrack;
import java.util.*;
public class RookGame {
	public static char lastMove(int r, int c, int[][] mat)
	{
		int count=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(mat[i][j]==1)
				{
					count++;
				}
			}
		}
		if(count%2==0)
		{
			return 'B';
		}
		else
		{
			return 'A';
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] mat=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		char moves=lastMove(r,c,mat);
		int row=0,col=0;
		int a=0,b=0;
		for(int i=0;i<r;i++)
		{
			a=i;
			for(int j=0;j<c;j++)
			{
				b=j;
				if(mat[i][b]==1)
				{
					break;
				}
				else
				{
					for(int k=0;k<r;k++)
					{
						if(mat[k][b]==1)
						{
							col=1;
							break;
						}
					}
					if(col==0)
					{
						for(int k=0;k<c;k++)
						{
							if(mat[a][k]==1)
							{
								row=1;
								break;
							}
						}
					}
				}
			}
			if(row==0 && col==0)
			{
				if(moves=='A')
				{
					moves='B';
				}
				else
				{
					moves='A';
				}
				mat[row][col]=1;
			}
		}
		System.out.print(moves);
	}
}


Time Complexity: O(r^2 * c + r * c^2) in the worst case.
Space Complexity: O(r * c).
