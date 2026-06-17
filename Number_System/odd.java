package Number_System;
import java.util.Scanner;
public class odd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Odd numbers up to " + n + ":");
        for (int i = 1; i < n; i += 2) {
            System.out.print(i + " ");
        }
    }
    
}
