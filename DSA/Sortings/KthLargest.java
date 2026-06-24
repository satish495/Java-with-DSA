package DSA.Sortings;

import java.util.*;

public class KthLargest {

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    static int quickSelect(int[] arr, int low, int high, int target) {

        if (low <= high) {

            int pivotIndex = partition(arr, low, high);

            if (pivotIndex == target) {
                return arr[pivotIndex];
            }
            else if (pivotIndex < target) {
                return quickSelect(arr, pivotIndex + 1, high, target);
            }
            else {
                return quickSelect(arr, low, pivotIndex - 1, target);
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        
        
        int k=s.nextInt();
        //int n=arr.length;
        int target = n - k;

        System.out.println(quickSelect(arr, 0, n - 1, target));
    }
}
