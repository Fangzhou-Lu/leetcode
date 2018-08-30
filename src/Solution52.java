import java.util.*;
public class Solution52 {

    static int cnt=0;

    static void solveNQueensDFS(int[] pos, int row , Integer res) {

        int n = pos.length;
        if(row ==n) {
//           res++;
            cnt++;
        } else {
            for(int col=0;col<n;col++) {
                if(isValid(pos,row,col)) {
                    pos[row]=col;
                    solveNQueensDFS(pos,row+1,res);
                    pos[row]=-1;
                }
            }
        }
    }

    static boolean isValid(int[] pos , int row ,int col) {

        for(int i=0;i<row;i++) {
            if(col==pos[i] || Math.abs(row-i ) ==Math.abs(col-pos[i]) ) return false;
        }
        return true;
    }

    public static  int totalNQueens(int n) {

        int res=0;

        int[] pos= new int[n];
        solveNQueensDFS(pos,0,res);
        return res;
    }

    public static void main (String[] args) {

        Integer res =totalNQueens(4);
        System.out.println(cnt);


}
}
