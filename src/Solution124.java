import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
public class Solution124 {
    
    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxPathSum(TreeNode root) {

          int[] res= new int[1];
          res[0]= Integer.MIN_VALUE;
          helper(root,res);
          return res[0];
    }

    static int helper(TreeNode root, int[] res) {
        if(root==null) return 0;
        int left=Math.max(helper(root.left,res),0);
        int right=Math.max(helper(root.right,res),0);
        res[0]= Math.max(res[0],left+right+root.val);

        return Math.max(left,right)+root.val;

    }


    public static void main(String[] args) {



    }
}
