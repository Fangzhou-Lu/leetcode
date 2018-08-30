import java.util.*;
public class Solution143 {

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


     public static void reorderList(ListNode head) {

        if(head==null || head.next==null || head.next.next==null) return ;

        ListNode fast=head,slow=head;

        while(fast.next!=null && fast.next.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
        }

        ListNode mid=slow.next;
        slow.next=null;
        ListNode last=mid,pre=null;

        while(last!=null) {
            ListNode next= last.next;
            last.next=pre;
            pre=last;
            last=next;
        }

        while(head!=null &&  pre!=null) {

            ListNode next=head.next;
            head.next=pre;
            pre=pre.next;
            head.next.next=next;
            head=next;
        }

        return;

    }

    public static void main (String[] args) {

        ListNode  node = new ListNode(1,  new ListNode(3, new ListNode(2, new ListNode(4, new ListNode(5,null)))));

        reorderList(node);


        while(node !=null) {
            System.out.println(node.val);
            node =node.next;
        }



    }


}
