public class Solution108 {


        public static class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) { val = x; }
         }

        public static  TreeNode sortedArrayToBST(int[] nums) {
            if(nums.length==0) return null;
           TreeNode node= convert(nums,0,nums.length-1);
           return node;
        }

        public static  TreeNode convert(int[] nums, int lo , int hi) {

            if(lo>hi) return null;
            int mid =(lo+hi)/2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left= convert(nums,lo,mid-1);
            node.right=convert(nums,mid+1,hi);
            return node;

         }

         public static void main (String[] args) {

           int[] nums= new int[] {3,5,6456,543,442,67};
           TreeNode root =  sortedArrayToBST(nums);
         }

}
