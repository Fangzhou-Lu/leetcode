import java.util.*;
public class Solution153 {

    public int findMin(int[] num) {
        int left = 0, right = num.length- 1;
        if (num[left] > num[right]) {
            while (left != (right - 1)) {
                int mid = (left + right) / 2;
                if (num[left] < num[mid]) left = mid;
                else right = mid;
            }
            return Math.min(num[left], num[right]);
        }
        return num[0];
    }

    public static void main(String[] args) {


    }
}
