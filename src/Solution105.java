import java.util.*;
public class Solution105 {


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    static TreeNode  build(int[] preorder , int pLeft, int pRight, int[] inorder, int iLeft, int irihgt) {
        if(pLeft> pRight || iLeft >irihgt)  return null;

        int i=0;
        for( i= iLeft; i<=irihgt;i++) {
          if(preorder[pLeft]==inorder[i]) break;
        }

        TreeNode cur = new TreeNode(preorder[pLeft]);
        cur.left= build(preorder,pLeft+1,pLeft+i-iLeft,inorder,iLeft,i-1);
        cur.right= build(preorder,pLeft+i-iLeft+1,pRight,inorder,i+1,irihgt);

        return cur;

    }


    public static  TreeNode buildTree(int[] preorder, int[] inorder) {

      return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    public static void main (String[] args) {

    }
}
