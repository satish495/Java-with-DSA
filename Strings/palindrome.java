package Strings;

import java.util.Scanner;

public class palindrome {
     public static boolean isPalindrome(String input) {
        if (input == null) return false;

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String string = s.nextLine();
        string=string.replace(" ","").toLowerCase();

        boolean res = isPalindrome(string);
        System.out.println(res);
    }    
}
