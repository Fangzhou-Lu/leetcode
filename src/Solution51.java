import java.util.*;
public class Solution51 {


    static void solveNQueensDFS(int[] pos, int row , List<List<String>> res) {

        int n = pos.length;
        if(row ==n) {

            char[] arr = new char[n];
            List<String> out = new LinkedList<>();
            for(int i=0;i<n;i++) {
                Arrays.fill(arr, '.');
                arr[pos[i]]='Q';
                out.add(new String(arr));
            }
            res.add(out);
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

    public static  List<List<String>> solveNQueens(int n) {

        List<List<String>> res= new LinkedList<>();
        int[] pos= new int[n];
        solveNQueensDFS(pos,0,res);
        return res;
    }

    public static void main (String[] args) {

        List<List<String>> res =solveNQueens(4);

        for(List<String> ls:res) {
            System.out.println(ls);
        }

    }
}
