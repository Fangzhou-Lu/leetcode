public class Solution63 {

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m =obstacleGrid.length;
        int n =obstacleGrid[0].length;

        int dp[][] = new int[m+1][n+1];

//        for(int i=0;i<=m;i++) dp[i][0]=0;
//        for(int i=0;i<=n;i++) dp[0][i]=0;

        dp[0][1]=1;

        for(int i=1;i<=m;i++) {
            for(int j =1;j<=n;j++) {
                if(obstacleGrid[i-1][j-1]==1) dp[i][j]=0;
                else dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }

        return dp[m][n];

    }

    public static void main (String[] args) {

        int[][] nums={{0,0,0},{0,1,0}, {0,0,0}};

        int res = uniquePathsWithObstacles(nums);
        System.out.println(res);

    }
}
