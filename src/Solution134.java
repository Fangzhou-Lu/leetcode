import java.util.*;
public class Solution134 {

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int total=0,sum=0,start=0;

        for( int i=0;i<gas.length;i++){
            total+=gas[i]-cost[i];
            sum+=gas[i]-cost[i];
            if(sum<0) {
                start=i+1;
                sum=0;
            }
        }

        return total<0? -1: start;

    }


    public static void main (String[] args) {

        int[] gas  = new int[] {1,2,3,4,5};
        int [] cost = new int[] {3,4,5,1,2};

        int res= canCompleteCircuit(gas,cost);
        System.out.println(res);


    }
}
