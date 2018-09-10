import java.util.*;
public class Solution151 {

    public static String reverseWords(String s) {
        String[] strs= s.trim().split(" +");
        Collections.reverse(Arrays.asList(strs));
        return String.join(" ",strs);

    }


    public static void main (String[] args) {
        String str ="   a   b  c d   e  ";
        String res= reverseWords(str);
        System.out.println(res);
    }
}
