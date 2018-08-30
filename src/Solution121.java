import java.util.*;
public class Solution121 {


    public static int maxProfit(int[] prices) {

        int n = prices.length;
        if(n==0) return 0;
        int profit=Integer.MIN_VALUE,min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++) {

            min=Math.min(prices[i],min);
            profit=Math.max(profit,prices[i]-min);
        }
        return profit;

    }

    public static void main (String[] args) {

        int[] nums={7,1,5,3,6,4};

        int res = maxProfit(nums);
        System.out.println(res);


    }
}
