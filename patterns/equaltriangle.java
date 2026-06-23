package patterns;

import java.util.Scanner;

public class equaltriangle {

     public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       

        for (int i = 1; i <= n; i++) {
            String spaces = " ".repeat(n - i);
            String stars = "* ".repeat(i).trim();

            System.out.println(spaces + stars);
        }
    }
}
