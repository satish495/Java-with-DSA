package Arrays;

import java.util.*;

public class moveZerosToEnd {
    public static void moveZerosToEnd(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }
        moveZerosToEnd(nums);
        System.out.println(Arrays.toString(nums));
    }
}
