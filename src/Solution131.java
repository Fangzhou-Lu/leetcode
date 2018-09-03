import java.util.*;
public class Solution131 {

    public  static List<List<String>> partition(String s) {

        List<List<String>> res= new LinkedList<>();
        Stack<String> out=new Stack();
        partitionDFS(s,0,out,res);

        return res;

    }

    static void partitionDFS(String string,int start,Stack<String> out,List<List<String>> res) {

        if(start==string.length()) {
            res.add(new ArrayList<>(out));
        }
        else {

            for(int i=start;i<string.length();i++) {
                if(isPalindrome(string,start,i)) {
                    out.push(string.substring(start,i+1));
                    partitionDFS(string,i+1,out,res);
                    out.pop();

                }
            }
        }
    }



    static boolean isPalindrome(String string, int start, int end) {

        while(start<end) {
            if(string.charAt(start)!=string.charAt(end))  return false;
            start++; end--;
        }
        return true;
    }



    public static void main (String[] args) {

        List<List<String>> res= partition("aab");

        System.out.println(res);

    }
}
