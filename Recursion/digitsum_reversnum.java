package Recursion;
import java.util.*;
public class digitsum_reversnum {
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }
   
    public static int Recursivereverse(int n,int res   ) {
        if (n == 0) {
            return res;
        }
        //res = res * 10 + n % 10;
        return Recursivereverse(n / 10, res*10 + n % 10);
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumOfDigits(n);
        int reversed = Recursivereverse(n, 0    );
        System.out.println("Sum of digits of " + n + " is: " + sum);
        System.out.println("Reversed number: " + reversed);
        sc.close();
    }
}
