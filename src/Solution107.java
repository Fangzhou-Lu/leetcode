import java.util.*;
public class Solution107 {

   public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


   public List<List<Integer>> levelOrderBottom(TreeNode root) {

       List<List<Integer>> res= new LinkedList<>();
       if( root ==null) return res;
       Queue<TreeNode> queue= new LinkedList<>();
       queue.add(root);

       while(!queue.isEmpty()) {

           List<Integer> out= new LinkedList<>();
           int n =queue.size();
           for(int i=0;i<n;i++) {
               TreeNode node=queue.poll();
               out.add(node.val);
               if(node.left!=null) queue.add(node.left);
               if(node.right!=null) queue.add(node.right);
           }
           res.add(0,new LinkedList<>(out));
       }
       return res;
   }

   public static void main (String[] args) {



   }
}
