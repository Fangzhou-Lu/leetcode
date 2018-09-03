import java.util.*;

    public class Solution98 {

        public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }

     static boolean valid(TreeNode root , long min ,long max) {

            if( root ==null) return true;
            if  (root.val<=min || root.val >=max) return false;
            return valid(root.left,min,root.val) && valid(root.right,root.val,max);
     }

     public boolean isValidBST(TreeNode root) {
       return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
     }


    public static void main (String[] args) {

        
    }
}
