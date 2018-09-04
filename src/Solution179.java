import java.util.*;
public class Solution179 {


    public static String largestNumber(int[] nums) {

        int n= nums.length;
        String[] strs= new String[n];
        for(int i=0;i<n;i++) strs[i]= new String(nums[i]+"");
        Arrays.sort(strs,(String a, String b)->(a+b).compareTo(b+a));
        StringBuilder sb= new StringBuilder();
        for(int i=n-1;i>=0;i--) sb.append(strs[i]);
        String res=sb.toString();
        return   res.charAt(0)=='0' ? "0" : res;
    }

    public static void main (String[] args) {

      int[] nums= new int[]{3,30,34,5,9};
      String res= largestNumber(nums);
       System.out.println(res);
//
//        String[] strs = new String[] {"Strings","Strings123","Strings1"};
//
//        Arrays.sort(strs);
//        for(String str:strs)
//        System.out.println(str);

    }
}
