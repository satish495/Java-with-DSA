package Arrays;
import java.util.*;
public class longestsubarray {
    public static int[] longestSubarray(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int maxLength = 0;
        int start = 0;
        int sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > k) {
                sum -= arr[start];
                start++;
            }

            if (sum == k && (end - start + 1) > maxLength) {
                maxLength = end - start + 1;
            }
        }

        if (maxLength == 0) {
            return new int[0]; 
        }

        return Arrays.copyOfRange(arr, start, start + maxLength);
    } 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        int[] result = longestSubarray(arr, k);
        System.out.println(Arrays.toString(result));
    }
}
