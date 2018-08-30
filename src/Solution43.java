public class Solution43 {


    public static  String multiply(String num1, String num2) {

        StringBuilder res= new StringBuilder();

        int m =num1.length();  int n =num2.length();

        int k =m+n-2;

        int[] sum = new int[m+n];

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                sum[k-i-j]+=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
            }
        }

        int carry=0;

        for(int i=0;i<m+n;i++) {
            sum[i]+=carry;
            carry= sum[i]/10;
            sum[i]=sum[i]%10;
        }

        int i=sum.length-1;

         while(i>=0 && sum[i]==0)  --i;
         if(i<0) return "0";

         while(i>=0){

             char c = (char)(sum[i--]+'0');

             res.append(c);

         }


        return res.toString();

    }

    public static void main (String[] args) {

//
//        String s1="123"; String s2="1";
        String s1="0"; String s2="0";

        String res= multiply(s1,s2);

        System.out.println(res);


    }
}
