public class Solution34 {


    static int search (int[] nums ,int lo ,int hi ,int target) {

//        if(nums.length==0 ) return -1;
        if(lo>hi) return -1;
        int mid =lo+(hi-lo)/2;
        if(nums[mid] == target) return mid;
        else if (nums[mid]<target) return search (nums,mid+1,hi,target);
        else  return search(nums,lo,mid-1,target);

    }


    public static  int[] searchRange(int[] nums, int target) {

//        if(nums.length==0) return new int[]{-1,-1};

        int idx = search(nums,0,nums.length-1,target);
        if( idx == -1) return new int[] {-1,-1};

        int left= idx ,right=idx;

        while(left>0 && nums[left]==nums[left-1]) left--;
        while(right<nums.length-1 &&nums[right]==nums[right+1]) right++;
        return new int[] {left ,right};


    }



    public static void  main (String[] args) {

//        int[] nums= new int[] {5, 7, 7, 8, 8, 10};

        int[] nums= new int []{2,2};
        int[] res= searchRange(nums,3);

        for(int i :res) {
            System.out.println(i);
        }



    }
}
