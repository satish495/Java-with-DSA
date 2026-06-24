package Arrays;
import java.util.*;
public class maxproductsubarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(maxProduct(arr));
    }

    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            int tempMax = Math.max(current, Math.max(max * current, min * current));
            int tempMin = Math.min(current, Math.min(max * current, min * current));

            max = tempMax;
            min = tempMin;

            result = Math.max(result, max);
        }

        return result;
    }
}