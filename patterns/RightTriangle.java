package patterns;
import java.util.*;

public class RightTriangle {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();

        for (int i = 1; i <= n; i++) {
            String row = " ".repeat(n - i) + "* ".repeat(i);

            System.out.println(row.trim());
        }
    }
}