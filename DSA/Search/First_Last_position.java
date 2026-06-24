package DSA.Search;

import java.lang.reflect.Array;
import java.util.*;

public class First_Last_position {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        result[0] = Position(nums, target, true);
        
        if (result[0] != -1) {
            result[1] = Position(nums, target, false);
        }
        
        return result;
    }

    
    public static int Position(int[] nums, int target,boolean isFirst) {
        int left = 0;
        int right = nums.length - 1;
        int bound=-1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                bound=mid; 
                if(isFirst)
                    right=mid-1;
                else
                    left=mid+1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1; 
            }
        }
        
        return bound;
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
        int[] range=searchRange(nums, target);
        System.out.println("Range="+Arrays.toString(range));
    }
}


