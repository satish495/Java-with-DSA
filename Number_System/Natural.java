package Number_System;
import java.util.Scanner;
public class Natural {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Natural numbers up to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
    
}
