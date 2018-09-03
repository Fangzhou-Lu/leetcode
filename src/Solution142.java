public class Solution142 {

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

     static ListNode detectCycle(ListNode head) {


        ListNode fast=head,slow=head;

        while(fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) break;
        }

        if(fast==null ||fast.next==null) return null;

        slow =head;

        while(slow!=fast) {
            slow=slow.next;
            fast=fast.next;
        }

        return slow;
    }

    public static void main (String[] args) {



    }

}
