public class Solution38 {

    public static String countAndSay (int n) {


        if(n<=0) return "";


        String res="1";

        while( --n>0) {

            StringBuilder cur= new StringBuilder();

            for(int i=0;i<res.length();i++) {
                int cnt=1;
                while(i+1<res.length()&& res.charAt(i)==res.charAt(i+1)){
                    cnt++;
                    i++;
                }
                cur.append(cnt+""+res.charAt(i));
            }

            res=cur.toString();
        }

        return res;
    }


    public static void  main(String[] args) {

          String res = countAndSay(5);

          System.out.println(res);

    }
}
