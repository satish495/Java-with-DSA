package Strings;

import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        int[] charCounts = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            charCounts[str1.charAt(i)]++;
            charCounts[str2.charAt(i)]--;
        }

        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String first = s.nextLine();
        
        System.out.print("Enter second string: ");
        String second = s.nextLine(); 

        String s1 = first.replace(" ", "").toLowerCase();
        String s2 = second.replace(" ", "").toLowerCase();

        boolean res = isAnagram(s1, s2);
        System.out.println( res);

        s.close();
    }
}
