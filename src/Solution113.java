import java.util.*;
public class Solution113 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    static void helper(TreeNode root, int sum, Stack<Integer> out, List<List<Integer>> res) {

        if(root==null) return ;
        out.push(root.val);
        if(sum==root.val && root.left==null && root.right==null) res.add(new ArrayList<>(out));

        helper(root.left,sum-root.val,out,res);
        helper(root.right,sum-root.val,out,res);
        out.pop();

    }

    public  static  List<List<Integer>> pathSum(TreeNode root, int sum) {

        List<List<Integer>> res = new LinkedList<>();
        Stack<Integer>  out= new Stack();
        helper(root,sum,out,res);
        return res;

    }

    public static  void main (String[] args) {


    }
}
