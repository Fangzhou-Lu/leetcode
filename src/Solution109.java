import java.util.*;
public class Solution109 {
    
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }


    public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
    }


    public TreeNode sortedListToBST(ListNode head) {

        if(head==null) return null;
        if(head.next==null) return new TreeNode(head.val);
        ListNode fast=head,slow=head ,last=head;
        while(fast.next!=null && fast.next.next!=null) {
            last=slow;
            slow =slow.next;
            fast=fast.next.next;
        }
        fast=slow.next;
        last.next=null;

        TreeNode cur= new TreeNode(slow.val);
        if(slow !=head )cur.left= sortedListToBST(head);
        cur.right=sortedListToBST(fast);
        return cur;
    }
        
    
    public static void main (String[] args ) {
        
        
        
    }
}
