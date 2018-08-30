public class Solution110 {

 
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }


    public static  boolean isBalanced(TreeNode root) {

         if (root ==null) return false;
         if(checkDepth(root)== -1) return  false;
         else  return true;

    }

     static int checkDepth(TreeNode root) {
         if(root == null) return 0;
         int left =checkDepth(root.left);
         if(left==-1) return -1;
         int right= checkDepth(root.right);
         if(right==-1) return -1;
         if(Math.abs(left-right)>1) return -1;
         return 1+Math.max(left,right);

    }


     public static void main (String[] args) {



     }

}
