package Recursion;

public class RecursiveFormula {

    public static int mul(int s, int k, int m) {
        if (s + m > 0&& m>0) {
            return (s / m) + (k % 5) + mul(s / 3, k / 2, m / 2);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Result: " + mul(12, 4, 2));
        } catch (ArithmeticException e) {
            System.out.println("Error caught: " + e.getMessage() + " (Division by zero occurred!)");
        }
    }
}
