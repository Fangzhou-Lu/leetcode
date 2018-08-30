
public class Solution67 {

    public static  String addBinary(String a, String b) {


        int m=a.length()-1,n=b.length()-1,carry=0;


        String res="";

        while(m>=0 || n>=0) {

            int x=m>=0? a.charAt(m--)-'0':0;
            int y =n>=0?b.charAt(n--)-'0':0;
            int sum=x+y+carry;
            res= ""+(sum%2)+res;
            carry=sum/2;
        }
        if(carry==1) res="1"+res;

        return res;
    }


    public static void main (String[] args) {

       String a = "11";
       String b = "1";
       String res= addBinary(a,b);

       System.out.println(res);
    }
}
