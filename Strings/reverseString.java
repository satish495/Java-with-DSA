package Strings;
import java.util.*;
public class reverseString {
     public static String reverseWithTwoPointer(String input) {
        if (input == null) return null;
        
        char[] array = input.toCharArray();
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return new String(array);
    }
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String string = s.nextLine();
        

        String res = reverseWithTwoPointer(string);
        System.out.println(res);

        
    }


}
