public class Solution50 {

    static double power (double x ,int n) {
        if(n==0) return 1;
        double half = power(x,n/2);
        if(n%2==0)  return half*half;
        else return  x*half*half;
     }

    public static double myPow(double x, int n) {
         if(n<0) return  1/power(x,-n);
         else  return power(x,n);
    }

    public static void main (String[] args) {


        double res = myPow(3,3);
        System.out.println(res);


    }
}
