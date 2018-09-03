public class Solution114 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public void flatten(TreeNode root) {

        if(root ==null) return ;
        flatten(root.left);
        flatten(root.right);
        TreeNode temp= root.right;
        root.right=root.left;
        root.left=null;
        while(root.right!=null) root=root.right;
        root.right=temp;
    }

    public static void main (String[] args) {


    }
}
