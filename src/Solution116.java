import java.util.*;

public class Solution116 {
    
      public class TreeLinkNode {
      int val;
      TreeLinkNode left, right, next;
      TreeLinkNode(int x) { val = x; }
  }

    public static void connect(TreeLinkNode root) {
          if(root==null) return ;
          if(root.left!=null) root.left.next=root.right;
          if(root.right!=null) root.right.next=root.next==null? null: root.next.left;
          connect(root.left);
          connect(root.right);
    }


    public static void main(String[] args) {


    }
}
