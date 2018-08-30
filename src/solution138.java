import java.util.*;

public class solution138 {
    
    static  class RandomListNode {
     int label;
     RandomListNode next, random;
     RandomListNode(int x) { this.label = x; }
 };

    public static RandomListNode copyRandomList(RandomListNode head) {

        RandomListNode p=head;
        RandomListNode dummy = new RandomListNode(-1);
        RandomListNode q=dummy;

        Map<RandomListNode,RandomListNode> map = new HashMap<>();

        while(p!=null) {
            q.next = new RandomListNode(p.label);
            map.put(p,q.next);
            p=p.next;
            q=q.next;
        }

        p=head;
        q=dummy;

        while(p!=null) {
            q.next.random=map.get(p.random);
            p=p.next;
            q=q.next;
        }

        return dummy.next;

    }


    public static void main (String[] args) {



    }


}
