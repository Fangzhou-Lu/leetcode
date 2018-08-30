public class Solution125 {

    public static boolean isPalindrome(String s) {

        if(s.equals("")) return true;

        int lo=0,hi=s.length()-1;
        while(lo<hi) {
            while(lo<hi && !Character.isLetterOrDigit(s.charAt(lo))) lo++;
            while(lo< hi && !Character.isLetterOrDigit(s.charAt(hi))) hi--;
            if(Character.toLowerCase(s.charAt(lo))!=Character.toLowerCase(s.charAt(hi))) return false;
            else lo++;hi--;

        }
        return  true;

    }

    public static void main(String[] args) {
        String test= "A man, a plan, a canal: Panama";
//       String test= ".,";
        boolean res= isPalindrome(test);

        System.out.println(res);

    }


}
