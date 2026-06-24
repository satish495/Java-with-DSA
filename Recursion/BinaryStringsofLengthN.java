package Recursion;

import java.util.*;

public class BinaryStringsofLengthN {

    static void generate(String str, int n) {
        if (str.length() == n) {
            System.out.println(str);
            return;
        }

        generate(str + "0", n);
        generate(str + "1", n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        generate("", n);
    }
}