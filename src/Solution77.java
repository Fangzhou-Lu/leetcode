import java.util.*;
public class Solution77 {


    static void search(int n, int k, int level,Stack<Integer> out,List<List<Integer>> res) {

        if(out.size()==k)  res.add( new ArrayList<>(out));
        else {
            for(int i=level;i<=n;i++) {
                out.push(i);
                search(n,k,i+1,out,res);
                out.pop();
            }
        }
    }

    public static  List<List<Integer>> combine(int n, int k) {
     List<List<Integer>> res= new LinkedList<>();
     Stack<Integer> out= new Stack<>();
      search(n,k,1,out,res);
      return res;
    }

    public static void main (String[] args) {

        List<List<Integer>> res= combine(4,2);
        System.out.println(res);
    }
}
