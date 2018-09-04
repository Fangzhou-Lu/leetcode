import java.util.*;
public class Solution89 {


    public List<Integer> grayCode(int n) {

        List<Integer> res= new LinkedList<>();

        for(int i=0;i<Math.pow(2,n);i++) {

            res.add((i >> 1)^i);
        }
        return res;

    }

    public static void main (String[] args) {


    }

}
