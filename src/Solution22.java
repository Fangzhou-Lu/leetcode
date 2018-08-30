import java.util.*;

public class Solution22 {


      static   public List<String> generateParenthesis(int n) {
            List<String> res = new ArrayList<String>();
            helper(n, n, "", res);
            return res;
        }


        static void helper(int left, int right, String out, List<String> res) {
            if (left < 0 || right < 0 || left > right) return;
            if (left == 0 && right == 0) {
                res.add(out);
                return;
            }
            helper(left - 1, right, out + "(", res);
            helper(left, right - 1, out + ")", res);
        }


    public static void main (String[] args) {


            List<String> strs = generateParenthesis(3);

            for(String str:strs) {
                System.out.println(str);
            }


    }
}
