import java.util.*;

public class Solution128 {

    public static int longestConsecutive(int[] nums) {

        int res=0;
        Set<Integer> set= new HashSet<Integer>();
        for(Integer i: nums) {
            set.add(i);
        }

        for(int i:nums) {
            if(!set.contains(i)) continue;
            int pre= i-1,next=i+1;
            while(set.contains(pre)) set.remove(pre--);
            while(set.contains(next)) set.remove(next--);
            res=Math.max(res,next-pre-1);
        }

        return res;

    }

    public static void main (String[] args) {


        int[] nums = new int[] {3,65,2,1,654};

        int res= longestConsecutive(nums);
        System.out.println(res);


    }
}
