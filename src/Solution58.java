public class Solution58 {


    static  public int lengthOfLastWord(String s) {



        String[] strs=s.split(" ");

        if (strs.length==0) return 0;

        return strs[strs.length-1].toCharArray().length;

    }

    public static void  main (String[] args) {
        System.out.println(lengthOfLastWord(" "));

    }
}
