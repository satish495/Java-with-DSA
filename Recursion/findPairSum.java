package Recursion;
import java.util.*;

public class findPairSum {
        public static void FindPairSum(int[] arr, int target, int index, HashSet<Integer> set) {
        if (index == arr.length) {
            System.out.println("Finished searching array.");
            return;
        }

        int needed = target - arr[index];

        if (set.contains(needed)) {
            System.out.println("Pair found: " + arr[index] + " + " + needed );
            return; 
        }
        set.add(arr[index]);
        FindPairSum(arr, target, index + 1, set);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=s.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        System.out.println("enter target");
        int target=s.nextInt();
        
        HashSet<Integer> set = new HashSet<>();
        FindPairSum(arr, target, 0, set);
    }
}
