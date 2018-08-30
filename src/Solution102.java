import java.util.*;
public class Solution102 {
    
    
     public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

    public List<List<Integer>> levelOrder(TreeNode root) {


         List<List<Integer>> res =new LinkedList<>();

         if(root== null) return res;
         Queue<TreeNode> queue= new LinkedList<>();

         queue.add(root);

         while(!queue.isEmpty()) {


             int size= queue.size();
             List<Integer> vals= new LinkedList<>();
             while(size-->0) {
                 TreeNode node= queue.poll();
                 vals.add(node.val);
                 if(node.left!=null) queue.add(node.left);
                 if(node.right!=null) queue.add(node.right);

             }
             res.add(vals);

         }
         return res;


    }

    public static void main(String[] args) {


    }
}
