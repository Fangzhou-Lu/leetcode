public class Solution101 {
    
     public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }


   static boolean sysmetric(TreeNode left ,TreeNode right) {
       if(left ==null && right ==null) return true;
       if((left ==null && right!=null) || (left !=null && right==null) || (left.val !=right.val)) return false;
       return sysmetric(left.left,right.right) && sysmetric(left.right,right.left);
   }
 

    public boolean isSymmetric(TreeNode root) {

       if(root==null) return true;
       return  sysmetric(root.left,root.right);

    }



    public static void main (String[] args) {


    }
}
