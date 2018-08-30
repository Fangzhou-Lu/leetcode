import java.util.*;

public class Solution76 {

    public static String minWindow(String s, String t) {

        if(t.length()>s.length())  return "";

        String res="";
        int left=0,count=0,minLen=s.length()+1;
        Map<Character,Integer> map = new HashMap<>();

        for(char c: t.toCharArray()) {
            if(map.containsKey(c)) map.put(c,map.get(c)+1);
            else map.put(c,1);
        }

        for( int right=0; right<s.length();right++) {
            char c= s.charAt(right);
            if( map.containsKey(c))  {
                map.put(c,map.get(c)-1);
                if(map.get(c)>=0) count++;
                while(count==t.length()) {

                    if(right-left+1<minLen) {
                        minLen=right-left+1;
                        res=s.substring(left,right+1);
                    }
                    char l= s.charAt(left);
                    if(map.containsKey(l)) {
                        map.put(l,map.get(l)+1);
                        if(map.get(l)>0) count--;
                    }
                    left++;
                }
            }

        }
        return res;
    }

    public static void main (String[] args) {


       String S = "ADOBECODEBANC", T = "ABC";
       String res= minWindow(S,T);
       System.out.println(res);


    }
}
