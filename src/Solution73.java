public class Solution73 {

    public static  void setZeroes(int[][] matrix) {

        int m=matrix.length,n=matrix[0].length;

        boolean rowZero=false,colZero=false;

        for(int i=0;i<m;i++) if(matrix[i][0]==0)  rowZero=true;
        for(int i=0;i<n;i++) if(matrix[0][i]==0)  colZero=true;

        for(int i=1;i<m;i++) {
            for(int j=1;j<n;j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i=1;i<m;i++) {
            for(int j=1;j<n;j++) {
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }

        }


        if(rowZero ==true) for(int i=0;i<m;i++) matrix[i][0]=0;
        if(colZero==true) for(int i=0;i<n;i++) matrix[0][i]=0;

    }

    public static void main(String[] args) {
//      int[][] nums = new int [][] {{0,1,2,0}, {3,4,5,2}, {1,3,1,5} };

        int[][] nums= new int[][] {{0},{1}};

      setZeroes(nums);

      for(int[] is:nums) {
          for(int i:is){
              System.out.print(i+" ");
          }
          System.out.println();
      }


    }
}
