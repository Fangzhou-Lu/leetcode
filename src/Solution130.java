import java.util.*;
public class Solution130 {

    public static void solve(char[][] board) {

        int m =board.length;
        int n =board[0].length;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(i==0 || i==m-1 || j==0 || j==n-1) solveDFS(board,i,j);
            }
        }

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(board[i][j]=='O')  board[i][j]='X';
                if(board[i][j]=='$')  board[i][j]='O';
            }
        }
    }

    static void solveDFS(char[][] board, int i , int j) {

        int m =board.length;
        int n =board[0].length;
        if(board[i][j]=='O') {
            board[i][j]='$';
            if(i>0 && board[i-1][j]=='O') solveDFS(board,i-1,j);
            if(i<m-1 && board[i+1][j]=='O') solveDFS(board,i+1,j);
            if(j>0 && board[i][j-1]=='O') solveDFS(board,i,j-1);
            if(j<n-1 && board[i][j+1]=='O') solveDFS(board,i,j+1);
        }
    }


    public static void main(String[] args ) {

    }
}
