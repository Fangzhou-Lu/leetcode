import java.util.*;
public class Solution122 {


    public static int maxProfit(int[] prices) {

        int n = prices.length;
        if(n==0) return 0;
        int profit=0;

        for(int i=0;i<n-1;i++) {

               if(prices[i]<prices[i+1]) profit+=prices[i+1]-prices[i];
        }
        return profit;

    }

    public static void main (String[] args) {

        int[] nums={7,1,5,3,6,4};

        int res = maxProfit(nums);
        System.out.println(res);


    }
}