package DSA.Sortings;
import java.util.*;
public class DutchNationalFlag {
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } 
            else if (nums[mid] == 1) {
                mid++;
            } 
            else if (nums[mid] == 2){ 
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        System.out.println("Original: " + Arrays.toString(arr));
        sortColors(arr);
        System.out.println("Sorted:   " + Arrays.toString(arr));
    }
}
