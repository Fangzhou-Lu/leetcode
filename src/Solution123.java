import java.util.*;
public class Solution123 {

    public static  int maxProfit(int[] prices) {

        int n= prices.length;
        int[][] l =new int[n][3], g= new int[n][3];

        for(int i=1;i<n;i++) {
            int diff =prices[i]-prices[i-1];
            for(int j=1;j<=2;j++) {
                l[i][j]=Math.max(g[i-1][j-1],l[i-1][j])+diff;
                g[i][j]=Math.max(g[i-1][j],l[i][j]);
            }
        }
        return g[n-1][2];

    }

    public static void main (String[] args) {

        int[] prices= new int[] {3,3,5,0,0,3,1,4};
        int res= maxProfit(prices);
        System.out.println(res);



    }
}
