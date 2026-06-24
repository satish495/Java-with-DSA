
import java.util.*;

public class MaxSubarraySum {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        int n = p.nextInt();

        if (n == 0) {
            System.out.println("Array is empty");
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = p.nextInt();
        }

        int maxSum = arr[0];
        int currentSum = arr[0];

        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < n; i++) {

            if (arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
                tempStart = i;
            } else {
                currentSum += arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Maximum Sum = " + maxSum);

        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}