package DSA.Search;
import java.util.*;

public class BinarySearch {
    public static int Binary(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; 
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1; 
            }
        }
        
        return -1;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=s.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
            nums[i]=s.nextInt();
        System.out.println("enter target");
        int target=s.nextInt();
        int res=   Binary(nums, target);
        if(res!=-1)
            System.out.println("Element found"+res);
        else
            System.out.println("Element not found");

    }
}
