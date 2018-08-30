import java.util.*;

public class Solution23 {

    static class ListNode  {
        int val;
        ListNode next;
        ListNode (int val, ListNode node) {
            this.val=val;
            this.next=node;
        }

    }


   static  public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });

        ListNode  head=null, pre=null,tmp=null;
        for(int i=0;i<lists.length;i++) {
            if(lists[i]!=null)
            pq.add(lists[i]);
        }

        while(!pq.isEmpty()) {
            tmp=pq.poll();
            if(pre==null) head=tmp;
            else pre.next=tmp;
            pre=tmp;
            if(tmp.next!=null) pq.add(tmp.next);
        }
        return head;
    }



    public static void main (String[] args) {

        ListNode  node1 = new ListNode(1,  new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,null)))));
//        removeNthFromEnd(node ,2);

        ListNode  node2 = new ListNode(1,  new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,null)))));

        ListNode node = mergeKLists (new ListNode[] {node1,node2});

        while(node !=null) {
            System.out.println(node.val);
            node =node.next;
        }

    }
}
