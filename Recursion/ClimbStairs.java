package Recursion;

import java.util.*;

public class ClimbStairs {

    static int ways(int n, int[] dp) {

        if (n == 0)
            return 1;

        if (n < 0)
            return 0;

        if (dp[n] != -1)
            return dp[n];

        dp[n] = ways(n - 1, dp)
              + ways(n - 2, dp)
              + ways(n - 3, dp);

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println(ways(n, dp));
    }
}