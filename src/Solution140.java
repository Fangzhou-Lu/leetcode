import java.lang.reflect.Array;
import java.util.*;

public class Solution140 {


    static List<String> helper(String s, List<String> dict, Map<String,List<String>> m) {

        if(m.containsKey(s)) return  m.get(s);
        if(s.equals(""))  return   Arrays.asList("");
        List<String> res= new LinkedList<>();

        for(String str:dict) {

            if( s.length()<str.length() || !s.substring(0,str.length()).equals(str))  continue;
            List<String>  les= helper(s.substring(str.length(),s.length()),dict,m);
            for(String string:les) {
                res.add( str + (string.equals("")? "":" ")+string );
            }
        }
        m.put(s,res);
        return res;

    }


    public static  List<String> wordBreak(String s, List<String> wordDict) {

        Map<String,List<String>> res = new HashMap<>();

        return  helper(s,wordDict,res);

    }


    public static void main (String[] args) {


        String s = "catsanddog";
        List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");

        List<String> res= wordBreak(s,wordDict);
        System.out.println(res);

//        for(String str:res) {
//            System.out.println(str);
//        }


    }
}
