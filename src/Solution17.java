import java.util.*;

public class Solution17 {


   static public void lettercombinationsDFS (String digits, String[] dict, int level, StringBuilder out,List<String> res) {

        if(level== digits.length()) {
            res.add(out.toString());
        }
        else {

            String str= dict[digits.charAt(level)-'2'];
            for(char c : str.toCharArray()) {
                out.append(c);
                lettercombinationsDFS(digits,dict,level+1,out,res);
                out.deleteCharAt(out.length()-1);
            }
        }

    }


    static public List<String> letterCombinations(String digits) {

        List<String> res= new ArrayList<>();
        if(digits.length()==0) {
            return res;
        }
        String[] dict =new String[] {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        StringBuilder builder=  new StringBuilder();

        lettercombinationsDFS(digits,dict,0,builder,res);
        return res;

    }

    public static void main (String[] args) {

       String test=  "23";

       List<String> strs= letterCombinations(test);

       for(String str:strs ){
           System.out.println(str);
       }




//       ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]


    }
}
