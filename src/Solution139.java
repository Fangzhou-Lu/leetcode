import java.util.*;

public class Solution139{


        public static boolean wordBreak(String s, List<String> wordDict) {

            Set<String> set= new HashSet<>(wordDict);

            int len =s.length();

            boolean[] res=  new boolean[len+1];

            res[0]=true;

            for(int i=0;i<=len;i++) {
                for(int j =0;j<i;j++) {

                    if(res[j] && set.contains(s.substring(j,i))) {
                        res[i]=true;
                        break;
                    }
                }
            }

            return res[len];

        }

    public static void  main (String[] args) {

        String s = "catsanddog";
        List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");

        boolean res= wordBreak(s,wordDict);
        System.out.println(res);


    }
}
