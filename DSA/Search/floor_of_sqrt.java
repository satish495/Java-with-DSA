package DSA.Search;

import java.util.*;

public class floor_of_sqrt {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
         int low = 1;
        int high = n;
        int ans = 0;

        if (n == 0 || n == 1) {
            System.out.println("The floor of sqrt is: " + n);
            return; 
        }

       
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid == n / mid) {
                ans=mid;
                break;
            } else if (mid < n / mid) {
                ans = mid;    
                low = mid + 1;
            } else {
                high = mid - 1; 
            }
        }

        System.out.println(ans);
    }
}
