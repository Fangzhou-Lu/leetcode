
public class Solution135 {

    public static int candy(int[] ratings) {

        int n = ratings.length;
        int sum=0;

        int[] candy= new int[n];
        for(int i=0;i<n;i++ ) candy[i]=1;

        for(int i=0;i<n-1;i++) {
            if(ratings[i+1]>ratings[i]) candy[i+1]=candy[i]+1;
        }
        for(int i=n-1;i>0;i--) {
            if(ratings[i-1]>ratings[i]) candy[i-1]=Math.max(candy[i]+1, candy[i-1]);
        }

        for(int i :candy ) sum+=i;
        return sum;

    }

    public static void main(String[] args) {

      int[] test= new int[] {1,2,2};
      int res= candy(test);

      System.out.println(res);

    }
}
