public class Solution148 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode (int val, ListNode node) {
            this.val=val;
            this.next=node;
        }
    }




    static ListNode merge(ListNode l1,ListNode l2) {

        ListNode dummy= new ListNode(-1,null);
        ListNode cur= dummy;

        while(l1!= null && l2 !=null) {

            if(l1.val<l2.val) {
                cur.next=l1;
                l1=l1.next;
            }else {
                cur.next=l2;
                l2=l2.next;
            }
            cur=cur.next;
        }

        if(l1!=null) cur.next=l1;
        if(l2!=null) cur.next=l2;

        return dummy.next;
    }

   static  public ListNode sortList(ListNode head) {

        if(head==null || head.next==null) return head;

        ListNode fast=head,slow=head,pre=null;

        while(fast!=null && fast.next!=null) {

            pre=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        pre.next=null;

        return merge(sortList(head),sortList(slow));


    }

    public static  void main (String[] args) {

        ListNode  node1 = new ListNode(1,  new ListNode(3, new ListNode(2, new ListNode(4, new ListNode(5,null)))));
//        removeNthFromEnd(node ,2);

//        ListNode  node2 = new ListNode(1,  new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,null)))));

        ListNode node= sortList(node1);


        while(node !=null) {
            System.out.println(node.val);
            node =node.next;
        }


    }
}
