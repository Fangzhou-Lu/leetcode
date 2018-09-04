import java.util.*;
public class Solution65 {

    public static  boolean isNumber(String s) {
        int i=0,n=s.length();

        while(i<n && Character.isWhitespace(s.charAt(i))) i++;
        if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+') )i++;
        boolean isNumber= false;
        while(i<n &&Character.isDigit(s.charAt(i))) {
            i++;
            isNumber=true;
        }

        if(i<n && s.charAt(i)=='.') {
            i++;
            while(i<n && Character.isDigit(s.charAt(i))) {
                i++;
                isNumber= true;
            }
        }
        if(isNumber && i<n &&s.charAt(i) =='e') {
            i++;
            isNumber=false;
            if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+')) i++;
            while(i<n &&Character.isDigit(i)) {
                i++;
                isNumber=true;
            }
        }

        while(i<n && Character.isWhitespace(s.charAt(i))) i++;
        return isNumber && i==n;

//
    }

    public static void main (String[] args) {

        boolean res = isNumber("2e0");
        System.out.println(res);

    }
}

//    int i = 0, n = s.length();
//        while (i < n && Character.isWhitespace(s.charAt(i))) i++;
//        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++;
//        boolean isNumeric = false;
//        while (i < n && Character.isDigit(s.charAt(i))) {
//            i++;
//            isNumeric = true;
//        }
//        if (i < n && s.charAt(i) == '.') {
//            i++;
//            while (i < n && Character.isDigit(s.charAt(i))) {
//                i++;
//                isNumeric = true;
//            }
//        }
//        if (isNumeric && i < n && s.charAt(i) == 'e') {
//            i++;
//            isNumeric = false;
//            if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++;
//            while (i < n && Character.isDigit(s.charAt(i))) {
//                i++;
//                isNumeric = true;
//            }
//        }
//        while (i < n && Character.isWhitespace(s.charAt(i))) i++;
//        return isNumeric && i == n;
