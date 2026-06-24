package Strings;

import java.util.*;

public class NonRepeatedChars {

    public static void printAllNonRepeated(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("String is empty or null."); 
            return;
        }

        Map<Character, Integer> counts = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }

        boolean found = false;
        System.out.print("Non-repeated characters: ");
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = s.nextLine();

        printAllNonRepeated(string);

        s.close();
    }
}

