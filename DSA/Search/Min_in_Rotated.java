package DSA.Search;

import java.util.*;

public class Min_in_Rotated {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = s.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements of the rotated sorted array:");
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }

        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(nums[mid]>nums[high])
                low=mid+1;
            else
                high=mid;
        }
        System.out.println(nums[low]);
        s.close();
        
    }
    
}
