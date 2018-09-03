import java.util.*;
public class Solution137 {

    public int singleNumber(int[] nums) {

        int res=0;
        for(int i=0;i<32;i++) {
            int sum=0;
            for(int j=0;j<nums.length;j++) {
                sum+=(nums[j]>>i) & 1;
            }
            res=res | sum%3 <<i;
        }
        return res;

    }


    public static void main (String[] args) {


    }
}
