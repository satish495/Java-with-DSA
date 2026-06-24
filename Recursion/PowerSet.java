package Recursion;

import java.util.*;

public class PowerSet {

    static void subsets(int[] arr, int index, String current) {

        if (index == arr.length) {
            System.out.println("{" + current + "}");
            return;
        }

        subsets(arr, index + 1, current);

        subsets(arr, index + 1,
                current + arr[index] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        subsets(arr, 0, "");
    }
}
