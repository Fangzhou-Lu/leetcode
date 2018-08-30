
public class Solution19 {


     static class ListNode {
        int val;
        ListNode next;
        ListNode (int val, ListNode node) {
            this.val=val;
            this.next=node;
        }
    }


    static public ListNode removeNthFromEnd(ListNode head, int n) {

         if(head.next == null ) {
             return  null;
         }
         ListNode pre=head,cur=head;

         while(n>0) {
             cur=cur.next;
             n--;
         }

        if (cur ==null) return head.next;

         while(cur.next !=null) {
             pre=pre.next;
             cur=cur.next;
         }
         pre.next=pre.next.next;

         return head;
    }



    public static void main (String[] args) {

         ListNode  node = new ListNode(1,  new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,null)))));
          removeNthFromEnd(node ,2);

          while(node !=null) {
              System.out.println(node.val);
              node =node.next;
          }


    }
}
