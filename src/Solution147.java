public class Solution147 {

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

//    public:
    static ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-1), cur = null;
        while (head!=null) {
            ListNode t = head.next;
            cur = dummy;
            while (cur.next!=null && cur.next.val <= head.val) {
                cur = cur.next;
            }
            head.next = cur.next;
            cur.next = head;
            head = t;
        }
        return dummy.next;
    }


public static  void main (String[] args) {

        ListNode  node1 = new ListNode(1,  new ListNode(3, new ListNode(2, new ListNode(4, new ListNode(5,null)))));

        ListNode node= insertionSortList(node1);


        while(node !=null) {
        System.out.println(node.val);
        node =node.next;
        }

        }
        
}
