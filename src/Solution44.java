public class Solution44 {

    public static  boolean isMatch(String s, String p) {

      int strStart=0,patStart=0,strCur=0,patCur=0;

      while(strCur <s.length()   ) {
          if( patCur < p.length() && ( s.charAt(strCur)==p.charAt(patCur) || p.charAt(patCur)=='?')) {
              strCur++;
              patCur++;
          } else if ( patCur < p.length() && p.charAt(patCur)=='*') {
              patStart=patCur++;
              strStart=strCur;
          } else if (patStart!=0) {
              patCur=patStart+1;
              strCur=++strStart;
          } else return false;
      }

      while ( patCur < p.length() && p.charAt(patCur)=='*') patCur++;
      return patCur >= p.length();

    }


    public static void main(String[] args) {

//        boolean res = isMatch("aa", "a*");
        boolean res = isMatch("aa", "*");
        System.out.println(res);
    }
}
