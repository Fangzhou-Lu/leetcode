import java.util.*;
public class Solution60 {

    public static String getPermutation(int n, int k) {

        StringBuilder sb= new StringBuilder();
        int[] map =new int[n];
        map[0]=1;
        for(int i=1;i<map.length;i++) map[i]=i*map[i-1];
        k--;

        List<Character> cs=new ArrayList<>(Arrays.asList('1','2','3','4','5','6','7','8','9')) ;

        for(int i=n;i>0;i--) {
           int j =k/map[i-1];
           sb.append(cs.get(j));
           k=k%map[i-1];
           cs.remove(j);
        }
        return sb.toString();

    }

    public static void  main (String[] args) {

     String res= getPermutation(4,17);

     System.out.println(res);

    }
}
