package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class longestSubstringwithoutrepeat {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int left = 0; 
        Map<Character, Integer> charIndexMap = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (charIndexMap.containsKey(currentChar)) {
                left = Math.max(left, charIndexMap.get(currentChar) + 1);
            }

            charIndexMap.put(currentChar, right);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String testStr = s.nextLine();
        
        int result = lengthOfLongestSubstring(testStr);
        System.out.println("Length of longest non-repeating substring: " + result); 

    }
    


}
