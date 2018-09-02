import java.util.*;

public class Solution75 {


    static void swap (int[] nums, int i ,int j) {
        int temp =nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }


    public static void sortColors (int[] nums) {

        int n =nums.length;

        int red=0,blue=n-1;

        for(int i=0;i<blue;i++) {
            if(nums[i]==0) swap(nums,i,red++);
            if(nums[i]==2) swap(nums,i--,blue--);
        }
    }

//    public static void sortColors(int[] nums) {
//
//        int[] map= new int[3];
//        for(int i:nums) {
//            map[i]++;
//        }
//
//        int idx=0;
//        for(int i=0;i<3;i++) {
//            for(int j=0;j<map[i];j++) {
//                nums[idx++]=i;
//            }
//        }
//    }

    public static void main(String[] args) {

        int[] nums= {2,0,2,1,1,0};

        sortColors(nums);

        for(int i:nums) {
            System.out.println(i);
        }

    }
}
