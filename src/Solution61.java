public class Solution61 {
    
      public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
          ListNode(int x, ListNode l) { val = x; next=l; }
  }

    public static ListNode rotateRight(ListNode head, int k) {

          if(head==null) return null;

          ListNode cur=head;
          int n=0;
          while(cur!=null)  {
              n++;
              cur=cur.next;
          }
          k=k%n;
          ListNode fast=head,slow=head;

          while(k-->0) {
              fast=fast.next;
          }

          while(fast.next!=null) {
              fast=fast.next;
              slow=slow.next;
          }

          fast.next=head;
          fast=slow.next;
          slow.next=null;
          return fast;

    }


    public static void  main(String[] args) {

        ListNode  node1 = new ListNode(1,  new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,null)))));

        ListNode node = rotateRight(node1,2);
        while(node !=null) {
            System.out.println(node.val);
            node =node.next;
        }

    }
}
