package Recursion;
import java.util.*;
public class reversnum {
    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reversedNumber = reverse(n);
        System.out.println("Reversed number: " + reversedNumber);
        sc.close();
    }
}
