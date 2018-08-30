import java.util.*;

public class Solution46 {

    static void permuteDFS(int[] nums,int level, int[] visited , Stack<Integer> out, List<List<Integer>> res) {
        if(level == nums.length) res.add( new LinkedList<>(out));
        else {
            for(int i=0;i<nums.length;i++) {
                if(visited[i]==0) {
                    visited[i]=1;
                    out.push(nums[i]);
                    permuteDFS(nums,level+1,visited,out,res);
                    out.pop();
                    visited[i]=0;
                }
            }
        }
    }

    static public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        int[] visited = new int[nums.length];
        Stack<Integer> out= new Stack<>();
        permuteDFS(nums,0,visited,out,res);
        return res;
    }

    public static void main (String[] args) {
        int[] num= {1,2,3};
        List<List<Integer>> res= permute(num);
        for(List<Integer> l : res) {
            for(Integer i: l) {
                System.out.print(i+",");
            }
            System.out.print("\n");
        }
    }
}
