package patterns;
import java.util.*;

public class downtriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("*");
                if(j!=n-i+1)
                    System.out.print(" ");
            }
            if(i<=n)
                System.out.println();
        }


        s.close();
    }
}