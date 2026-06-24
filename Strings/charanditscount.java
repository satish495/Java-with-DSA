package Strings;

import java.util.*;

public class charanditscount {
    public static String compressString(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }

        StringBuilder compressed = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            compressed.append(entry.getValue()).append(entry.getKey());
        }

        return compressed.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string = s.nextLine();
        
        string = string.replaceAll("\\s+", ""); 
        
        String output = compressString(string);
        
        System.out.println("Input:  " + string);
        System.out.println("Output: " + output); 
    }
}
 