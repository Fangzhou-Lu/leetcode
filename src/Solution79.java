import java.util.*;

public class Solution79 {

    static boolean search (char[][] board, String word,int idx, int i ,int j) {

        int  m = board.length; int n = board[0].length;

        if(word.length()==idx)  return true;

        char c= word.charAt(idx);

        if(i<0 || i>=m || j<0 || j>=n || board[i][j]!=c)   return false;
        board[i][j]='#';

        boolean res=search(board,word,idx+1,i+1,j)
                ||  search(board,word,idx+1,i-1,j)
                ||  search(board,word,idx+1,i,j-1)
                ||  search(board,word,idx+1,i,j+1);
        board[i][j]=c;
        return  res;
    }

    public static  boolean exist(char[][] board, String word) {

        if(board.length==0 || board[0].length==0) return false;

        for(int i=0;i<board.length;i++) {
            for( int j=0;j<board[0].length;j++) {
                if( search(board,word,0,i,j)) return true;
            }
        }
         return false;
    }


    public static void main (String[] args) {


//        char[][] board ={{'A','B','C','E'},
//                         {'S','F','C','S'},
//                          {'A','D','E','E'}};
//
//      String word = "ABCCED";

        char[][] board= {{'a','b'}};

        String word = "ba";

      boolean res= exist(board,word);
      System.out.println(res);

    }
}