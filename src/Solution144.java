import java.util.*;

public class Solution144 {

    static   public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
      TreeNode(int x,TreeNode l,TreeNode r) { val = x;  left=l; right=r;}
  }

   static  public List<Integer> preorderTraversal(TreeNode root) {

          if(root == null) return new LinkedList<>();

          List<Integer> res = new LinkedList<>();
          Stack<TreeNode> s = new Stack();
          s.push(root);

          while(!s.isEmpty()) {

              TreeNode node = s.pop();

              res.add(node.val);
              if(node.right !=null) s.push(node.right);
              if(node.left !=null)  s.push(node.left);

          }
          return res;

    }


    public static void main (String[] args) {

       TreeNode t= new TreeNode(1,null ,new TreeNode(2,new TreeNode(3,null ,null),null));

       List<Integer> res = preorderTraversal(t);

       for( int i : res) {
           System.out.println(i);
       }
    }
}
