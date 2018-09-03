import java.util.*;

public class Solution129 {
    
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

   static int sumTree(TreeNode root, int sum) {
          if(root ==null) return 0;
          sum=sum*10+root.val;
          if(root.left==null && root.right==null)  return  sum;
          return sumTree(root.left,sum) +sumTree(root.right,sum);
   }

    public static  int sumNumbers(TreeNode root) {

     return sumTree(root,0);
    }

    public static void main (String[] args) {


    }
}
