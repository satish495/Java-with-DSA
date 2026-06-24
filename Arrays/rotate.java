package Arrays;
import java.util.*;
public class rotate {
    public static void rotate(int[] arr, int k) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int n = arr.length;
        k = k % n; 
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        int k=s.nextInt();
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }

}
