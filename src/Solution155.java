import java.util.*;
public class Solution155 {

    static class MinStack {

        Stack<Integer> s1=null, s2=null;
        public MinStack() {
           s1=new Stack<>();
           s2= new Stack();
        }

        public void push(int x) {
            s1.push(x);
            if(s2.isEmpty() || x<=s2.peek()) s2.push(x);

        }

        public void pop() {
           int x= s1.pop();
           if(x==s2.peek()) s2.pop();
        }

        public int top() {
             return s1.peek();
        }

        public int getMin() {
            return s2.peek();

        }


    }
    public static void main(String[] args) {


    }
}
