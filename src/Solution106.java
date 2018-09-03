import java.util.*;
public class Solution106 {


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    static TreeNode build(int[] inorder, int iLeft, int iRight, int[] postorder , int pLeft, int pRight) {
        if(iLeft > iRight || pLeft > pRight) return null;
        int i=0;
        for( i=iLeft;i<=iRight;i++) {
            if(postorder[pRight]==inorder[i]) break;
        }

        TreeNode cur= new TreeNode(postorder[pRight]);
        cur.left= build(inorder,iLeft,i-1,postorder,pLeft,pLeft+i-iLeft-1);
        cur.right=build(inorder,i+1,iRight,postorder,pLeft+i-iLeft,pRight-1);
        return cur;

    }

    public  static TreeNode buildTree(int[] inorder, int[] postorder) {
        return  build(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }

    public static void main (String[] args) {


    }
}
