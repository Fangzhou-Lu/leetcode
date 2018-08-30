
import  java.util.*;
public class Solution47 {


    static void permuteUniqueDFS(int[] nums,int level, int[] visited , Stack<Integer> out, List<List<Integer>> res) {
        if(level == nums.length) res.add( new LinkedList<>(out));
        else {
            for(int i=0;i<nums.length;i++) {
                if(visited[i]==0) {

                    if(i>0 && nums[i] == nums[i-1] && visited[i-1]==0) continue;
                    visited[i]=1;
                    out.push(nums[i]);
                    permuteUniqueDFS(nums,level+1,visited,out,res);
                    out.pop();
                    visited[i]=0;
                }
            }
        }
    }

    static public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        int[] visited = new int[nums.length];
        Stack<Integer> out= new Stack<>();
        permuteUniqueDFS(nums,0,visited,out,res);
        return res;
    }

    public static void main (String[] args) {
        int[] num= {1,1,2};
        List<List<Integer>> res= permuteUnique(num);
        for(List<Integer> l : res) {
            for(Integer i: l) {
                System.out.print(i+",");
            }
            System.out.print("\n");
        }
    }


}
