package bitmanipulation;

import java.util.Scanner;

public class opposite{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        boolean opposite=((a^b)<0);
        System.out.println(opposite);
    }
}
