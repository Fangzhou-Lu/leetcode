import java.util.*;
public class Solution120 {

    public static int minimumTotal(List<List<Integer>> triangle) {

        for (int i = 1; i < triangle.size(); i++) {

//            if(i==0) continue;
            List<Integer> level = triangle.get(i);
            for (int j = 0; j < level.size(); j++) {
                if (j == 0)  {
                    int ss=level.get(j) + triangle.get(i - 1).get(0);
                    level.set(j, ss);
                }

                else if (j == level.size() - 1) level.set(j, level.get(j) + triangle.get(i - 1).get(j - 1));
                else level.set(j, level.get(j) + Math.min(triangle.get(i - 1).get(j), triangle.get(i - 1).get(j - 1)));
            }
        }
        int min = Integer.MAX_VALUE;
        List<Integer> last = triangle.get(triangle.size() - 1);
        for (int k = 0; k < last.size(); k++) {
            min = Math.min(min, last.get(k));
        }

        return min;

    }

    public static void main(String[] args) {

//        List<Integer> pp= new ArrayList<>();
//        pp.add(0,1);
//        pp.add(0,2);

        List<List<Integer>> nums = new ArrayList<>();



        nums.add(new ArrayList<>(Arrays.asList(2)));
        nums.add(new ArrayList<>(Arrays.asList(3, 4)));
        nums.add(new ArrayList<>(Arrays.asList(6, 5, 7)));
        nums.add(new ArrayList<>(Arrays.asList(4, 1, 8, 3)));

       int res= minimumTotal(nums);
        System.out.println(res);
    }
}