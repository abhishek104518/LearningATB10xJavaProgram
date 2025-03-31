package Interview_Ans_Que;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        // Create a HashMap to store character frequency
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Loop through each character in the string
        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print character occurrences
        System.out.println("Character Occurrences:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
