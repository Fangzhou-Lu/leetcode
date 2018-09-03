import java.util.*;
public class Solution103 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res= new LinkedList<>();
        if (root ==null) return res;
        Stack<TreeNode> s1= new Stack<>();
        Stack<TreeNode> s2= new Stack<> ();
        s1.push(root);
        List<Integer> out =new LinkedList<>();
        while(!s1.isEmpty() || !s2.isEmpty() ) {

            while(!s1.empty()) {

                TreeNode n= s1.pop();
                out.add(n.val);
                if(n.left!=null) s2.add(n.left);
                if(n.right!=null) s2.add(n.right);
            }

            if(out.size()!=0) res.add(new LinkedList<>(out));
            out.clear();

            while(!s2.empty()) {

                TreeNode n= s2.pop();
                out.add(n.val);
                if(n.right!=null) s1.add(n.right);
                if(n.left!=null) s1.add(n.left);

            }

            if(out.size()!=0) res.add(new LinkedList<>(out));
            out.clear();

        }

        return res;


    }

    public static void main (String[] args) {


    }
}
