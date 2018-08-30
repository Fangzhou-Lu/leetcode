import java.util.List;

public class Solution24 {


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

//    static public ListNode swapPairs(ListNode head) {
//
//        if(head ==null || head.next==null)
//            return head;
//
//        ListNode t= head.next;
//
//        head.next=swapPairs(head.next.next);
//        t.next=head;
//        return  t;
//
//    }

    static public ListNode swapPairs(ListNode head) {

        ListNode dummyHead= new ListNode(-1);
        ListNode pre = dummyHead;
        dummyHead.next=head;

        while(pre.next !=null && pre.next.next !=null) {

            ListNode t = pre.next.next;
            pre.next.next= t.next;
            t.next=pre.next;
            pre.next=t;
            pre=t.next;
        }

        return dummyHead.next;
//        return head;

    }



    public static void main (String[] args) {

        ListNode  node2 = new ListNode(1,  new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,null)))));

        ListNode node = swapPairs (node2);

        while(node !=null) {
            System.out.println(node.val);
            node =node.next;
        }


    }
}
