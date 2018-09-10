import java.util.*;
public class Solution154 {

        public  static int findMin(int[] nums) {
            int l = 0, r = nums.length-1;
            while (l < r) {
                int mid = (l + r) / 2;
                if (nums[mid] < nums[r]) {
                    r = mid;
                } else if (nums[mid] > nums[r]){
                    l = mid + 1;
                } else {
                    r--;
                }
            }
            return nums[l];
        }



    public static void main(String[] args) {
         int[] nums= new int[] {2,2,2,0,1};

         int res= findMin(nums);

         System.out.println(res);


    }
}
