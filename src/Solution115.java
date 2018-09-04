import java.util.*;
public class Solution115 {


    public static int numDistinct(String s, String t) {

        int m =s.length(),n=t.length();

        int[][] dp = new int[n+1][m+1];

        for(int i=0;i<=m;i++) dp[0][i]=1;
        for(int i=1;i<=n;i++) dp[i][0]=0;

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=m;j++) {

                dp[i][j]=(s.charAt(j-1)==t.charAt(i-1)?dp[i-1][j-1]:0)+dp[i][j-1]  ;
            }
        }

        return dp[n][m];

    }




    public static void main (String[] args) {


        String S = "rabbbit", T = "rabbit";

        int res= numDistinct(S,T);
        System.out.println(res);
    //


    }
}
