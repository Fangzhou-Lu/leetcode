import java.util.*;
public class Solution29 {


    public static int divide(int dividend, int divisor) {

//        if(divisor==0 || (dividend==Integer.MIN_VALUE && divisor==-1)) return Integer.MAX_VALUE;

        if(divisor==0 || (dividend==Integer.MIN_VALUE && divisor==-1)) return Integer.MAX_VALUE;
        long  m = Math.abs((long)dividend),n=Math.abs((long)divisor ),res=0;
        int sign = (dividend<0) ^(divisor<0)? -1:1;

        while(m>=n) {

            long t=n,cnt=1;

            while(m>=(t<< 1)){
                cnt*=2;
                t<<=1;

            }
            res+=cnt;
            m-=t;

        }

        return (int)(sign==1? res:-res) ;

    }

    public static void main (String[] args) {

        int res= divide(-2147483648,
                2);
        System.out.println(res);


    }
}
