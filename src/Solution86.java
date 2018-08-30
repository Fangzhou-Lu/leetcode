import java.util.*;
public class Solution86 {

    static class ListNode  {
        int val;
        ListNode next;
        ListNode (int val, ListNode node) {
            this.val=val;
            this.next=node;
        }

        ListNode (int val) {
            this.val=val;
            this.next=null;
        }

    }

    public static ListNode partition(ListNode head, int x) {

        ListNode dummy= new ListNode(-1,null);
        dummy.next=head;

        ListNode pre=dummy,cur=head;

        while(pre.next!=null && pre.next.val< x) pre=pre.next;

        cur=pre;

        while(cur.next!=null) {
            if(cur.next.val<x)
            {
                ListNode temp = cur.next;
                cur.next=temp.next;
                temp.next=pre.next;
                pre.next=temp;
                pre=pre.next;
            }

            else cur=cur.next;
        }
        return dummy.next;


    }



//     1->4->3->2->5->2, x = 3

    public static void  main (String[] args) {


        ListNode  node1 = new ListNode(1,  new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5,null)))));

        ListNode node = partition(node1,3);

        while(node !=null) {
            System.out.println(node.val);
            node =node.next;
        }

    }
}
