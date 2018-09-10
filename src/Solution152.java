import java.util.*;
public class Solution152 {

    public static  int maxProduct(int[] nums) {

        int res=nums[0], max=nums[0],min=nums[0];

        for( int i=1;i<nums.length;i++) {

            int tmax=max; int tmin=min;
            max=Math.max(nums[i],Math.max(nums[i]*tmax,nums[i]*tmin));
            min=Math.min(nums[i],Math.min(nums[i]*tmax,nums[i]*tmin));
            res=Math.max(max,res);
        }
        return res;
    }


    public static void main (String[] args) {

       int[] nums= new int[] {2,3,-2,4};

       int res= maxProduct(nums);
       System.out.println(res);

    }
}
