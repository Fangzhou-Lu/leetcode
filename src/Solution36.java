public class Solution36 {


    public static boolean isValidSudoku(char[][] board) {

        int m=board.length; int n = board[0].length;

        boolean[][] rowValid= new boolean[m][n];
        boolean[][] colValid= new boolean[m][n];
        boolean[][] cellValid= new boolean[m][n];

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(board[i][j]>='1' && board[i][j] <='9') {
                    int c= board[i][j]-'1';
                    if(rowValid[i][c] || colValid[c][j] || cellValid[3*(i/3)+j/3][c]) {
                        return false;
                    }
                    rowValid[i][c]=true;
                    colValid[c][j] =true;
                    cellValid[3*(i/3)+j/3][c]=true;
                }
            }
        }
        return true;

    }


    public static void main (String[] args) {
        
        
        
        char[][] board = {
  {'8','3','.','.','7','.','.','.','.'},
  {'6','.','.','1','9','5','.','.','.'},
  {'.','9','8','.','.','.','.','6','.'},
  {'8','.','.','.','6','.','.','.','3'},
  {'4','.','.','8','.','3','.','.','1'},
  {'7','.','.','.','2','.','.','.','6'},
  {'.','6','.','.','.','.','2','8','.'},
  {'.','.','.','4','1','9','.','.','5'},
  {'.','.','.','.','8','.','.','7','9'}
};

        boolean valid = isValidSudoku(board);

        System.out.println(valid);



    }
}
