import java.util.*;
public class Solution119 {

    public static List<Integer> generate(int numRows) {


        List<Integer> res=  new ArrayList<>();

        int[] out= new int[numRows+1];

        out[0]=1;
        for(int i=0; i<=numRows;i++) {
            if (i==0) continue;
            for(int j=numRows;j>0;j--) {
                out[j]=out[j]+out[j-1];
            }
        }

        for(int i :out)
            res.add(i);

        return res;

    }

    public static void main (String[] args) {

        List<Integer> res= generate(0);
        System.out.println(res);

    }
}