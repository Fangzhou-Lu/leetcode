public class Solution141 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode (int val,ListNode l) {
            this.val=val;
            this.next=l;
        }

        ListNode (int val) {
            this.val=val;
            this.next=null;
        }
    }

    public boolean hasCycle(ListNode head) {

        ListNode fast=head,slow=head;

        while(fast.next!=null && fast.next.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast) return true;
        }
        return false;
    }


}
