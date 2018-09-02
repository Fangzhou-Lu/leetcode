import java.util.*;
public class Solution74 {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0 || matrix[0].length==0) return false;
        int m =matrix.length,n=matrix[0].length;
        if(target<matrix[0][0] || target >matrix[m-1][n-1]) return false;

        int left=0,right=m*n-1;

        while(left<=right)  {
            int mid =(left+right)/2;
            int midValue =matrix[mid/n][mid%n];
            if(midValue==target) return true;
            else if(midValue<target) left=mid+1;
            else right=mid-1;
        }

        return false;

    }



    public static void main (String[] args) {


        int[][] matrix = {
                          {1,   3,  5,  7},
                          {10, 11, 16, 20},
                          {23, 30, 34, 50}
                        };
       int target = 13;

       boolean res= searchMatrix(matrix,target);
       System.out.println(res);


    }
}
