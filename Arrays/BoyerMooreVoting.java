package Arrays;

import java.util.*;

public class BoyerMooreVoting {

    public static Integer findMajorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        int candidate = nums[0];
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        }

        return null; 
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
            nums[i]=s.nextInt();
        
        Integer majority = findMajorityElement(nums);
        
        if (majority != null) {
            System.out.println("The majority element is: " + majority);
        } else {
            System.out.println("No majority element found.");
        }
    }
}