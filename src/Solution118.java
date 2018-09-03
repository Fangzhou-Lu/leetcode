import java.util.*;
public class Solution118 {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new LinkedList<>();

        for(int i=0; i<numRows;i++) {
            List<Integer> out=  new ArrayList<>(i+1);
            res.add(out);
            out.add(1);
            if (i==0) continue;
            for(int j=1;j<i;j++) {
                out.add(j,res.get(res.size()-2).get(j)+res.get(res.size()-2).get(j-1));
            }
            out.add(1);
        }
        return res;
    }

    public static void main (String[] args) {

        List<List<Integer>> res= generate(5);

        System.out.println(res);

    }
}
