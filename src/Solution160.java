import java.util.*;
public class Solution160 {
    
      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

   public static int getLength(ListNode l1) {
          int cnt=0;
          while(l1!=null) {
              cnt++;
              l1=l1.next;
          }
          return cnt;

   }

    public static  ListNode getIntersectionNode(ListNode headA, ListNode headB) {
          if(headA==null || headB==null) return null;
          ListNode s1=headA;
          ListNode s2=headB;
          int lenA=getLength(headA),lenB=getLength(headB);
          if(lenA>lenB)
              for(int i=0;i<lenA-lenB;i++) s1=s1.next;
          else  for(int i=0;i<lenB-lenA;i++) s2=s2.next;
          while(s1!=null && s2!=null && s1!=s2) {
              s1=s1.next;
              s2=s2.next;
          }
          return (s1!=null && s2!=null)? s1:null;

    }

    public static void main(String[] args) {

        
    }
}
