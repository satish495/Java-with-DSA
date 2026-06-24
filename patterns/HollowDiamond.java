import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of rows (half diamond)

        // Upper part
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++)
                System.out.print(" ");

            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--)
                System.out.print(" ");

            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}