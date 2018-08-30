public class Solution21 {


    static class ListNode {
        int val;
        ListNode next;
        ListNode (int val, ListNode node) {
            this.val=val;
            this.next=node;
        }
    }

    static public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummyHead=  new  ListNode(-1,null);

        ListNode cur=dummyHead;


        while(l1!=null && l2!=null ) {

            if(l1.val<l2.val) {

                cur.next=l1;
                l1=l1.next;
            } else {
                cur.next=l2;
                l2=l2.next;
            }
            cur=cur.next;

        }

        cur.next=  l1!=null? l1:l2;

        return dummyHead.next;


    }

    public static void main (String[] args) {

        ListNode  node1 = new ListNode(1,  new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,null)))));
//        removeNthFromEnd(node ,2);

        ListNode  node2 = new ListNode(1,  new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,null)))));

        ListNode node = mergeTwoLists (node1 ,node2);

        while(node !=null) {
            System.out.println(node.val);
            node =node.next;
        }


    }
}
