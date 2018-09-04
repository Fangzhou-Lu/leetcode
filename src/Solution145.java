import java.util.*;
public class Solution145 {
    
    
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


    public List<Integer> postorderTraversal(TreeNode root) {

      List<Integer> res= new LinkedList<>();
      Stack<TreeNode> stack = new Stack();
      stack.push(root);

      while(!stack.isEmpty()) {

          TreeNode t = stack.pop();
          res.add(0,t.val);
         if(t.left!=null) stack.push(t.left);
         if(t.right!=null) stack.push(t.right);
      }

      return res;

    }

    public static void main(String[] args) {


    }
}
