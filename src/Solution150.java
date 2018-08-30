import java.lang.reflect.Array;
import java.util.*;
public class Solution150 {

    public static  int evalRPN(String[] tokens) {



//        Set<String> set= new HashSet<>(Arrays.asList("+","-","*","/"));

        Stack<Integer> stack = new Stack();

        for(String str: tokens) {

//            if(!set.contains(str)){
            if(!str.equals("+") && !str.equals("-") &&!str.equals("*") &&!str.equals("/") ){
                stack.push(Integer.parseInt(str));
            }
            else {

                int m= stack.pop();
                int n=stack.pop();
                int res=0;
                switch (str) {
                    case "+": res=n+m ; break;
                    case "-": res=n-m ; break;
                    case "*": res=n*m ; break;
                    case "/": res=n/m ; break;
                }

                stack.push(res);
            }

        }

        return  stack.pop();

    }

    public static void main (String[] args) {

        String[] strs= new String[] {"4", "13", "5", "/", "+"};
        int res = evalRPN(strs);
        System.out.println(res);


    }
}
