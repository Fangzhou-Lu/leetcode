import java.util.List;

public class Solution25 {

    static class ListNode  {
        int val;
        ListNode next;
        ListNode (int val, ListNode node) {
            this.val=val;
            this.next=node;
        }
        ListNode (int val ) {
            this.val=val;
            this.next=null;
        }

    }

    static   public ListNode reverseKGroup(ListNode head, int k) {


        if(head == null || k==1) return head;

        ListNode dummy= new ListNode(-1);
        ListNode cur= head,pre=dummy;
        dummy.next=head;
        int i=0;
        while (cur!=null) {
            i++;
            if(i%k==0) {
                pre=reverseOneGroup(pre,cur.next);
                cur=pre.next;
            } else {
                cur=cur.next;
            }


        }

        return dummy.next;
    }

   static  ListNode reverseOneGroup (ListNode pre, ListNode next) {

        ListNode last=pre.next;
        ListNode cur=last.next;

        while(cur!=next) {
            last.next=cur.next;
            cur.next=pre.next;
            pre.next=cur;
            cur=last.next;
        }

        return last;

    }



    public static void main (String[] args) {


        ListNode  node2 = new ListNode(1,  new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,null)))));

        ListNode node = reverseKGroup (node2,3);

        while(node !=null) {
            System.out.println(node.val);
            node =node.next;
        }


    }
}
