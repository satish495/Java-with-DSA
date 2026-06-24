package Arrays;
import java.util.*;

public class TwoSumAllPairs {
    public static void printAllTwoSumPairs(int[] nums, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        boolean foundPair = false;

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                for (int compIndex : map.get(complement)) {
                    System.out.println("[" + compIndex + ", " + i + "]");
                    foundPair = true;
                }
            }

            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        if (!foundPair) {
            System.out.println("No matching pairs found.");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        
        System.out.print("Enter target sum: ");
        int target = s.nextInt();
        
        System.out.println("All matching pairs of indices:");
        printAllTwoSumPairs(arr, target);
        
        s.close();
    }

    
}

