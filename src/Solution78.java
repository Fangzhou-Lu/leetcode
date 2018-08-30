import java.util.*;
public class Solution78 {

    public static  List<List<Integer>> subsets(int[] nums) {


//        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        res.add(new LinkedList<>());
        for(int i=0;i<nums.length;i++) {

            int n = res.size();
            for(int j=0;j<n;j++) {
                List<Integer> nls = new LinkedList<>(res.get(j));
                nls.add(nums[i]);
                res.add(nls);
            }
        }

        return res;
    }

    public static void main (String[] args) {

        int[] nums = new  int[] {1,2,3};
        List<List<Integer>> res= subsets(nums);

        for(List<Integer> ls :res) {
            System.out.println(ls);
        }
    }
}
