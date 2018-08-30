public class Solution62 {


    public static int uniquePaths(int m, int n) {

        int[][] dp= new int[m+1][n+1];

        for(int i=0;i<=m;i++) dp[i][0]=0;
        for(int i=0;i<=n;i++) dp[0][n]=0;

        dp[0][1]=1;

        for(int i=1;i<=m;i++) {
            for(int j =1;j<=n;j++) {
                dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }

        return dp[m][n];


    }

    public static void main (String[] args) {

        int res = uniquePaths(7,3);
        System.out.println(res);

    }
}
