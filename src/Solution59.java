import java.util.*;
public class Solution59 {

    public int[][] generateMatrix(int n) {

        int val=1;

        int[][] m= new int[n][n];

        int p=n;

        for(int i=0;i<n/2;i++,p-=2) {

            for(int col=i;col<i+p;col++) {
                m[i][col]=val++;
            }
            for(int row=i+1;row<i+p;row++) {
                m[row][i+p-1]=val++;
            }
            for(int col=i+p-2;col>=i;col--) {
                m[i+p-1][col]=val++;
            }
            for(int row=i+p-2;row>i;row--) {
                m[row][i]=val++;
            }
        }

        if(n%2!=0) m[n/2][n/2]=val;

        return m;

    }

    public static void main (String[] args) {


    }
}
