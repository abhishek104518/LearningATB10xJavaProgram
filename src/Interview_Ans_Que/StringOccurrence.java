package Interview_Ans_Que;

import java.util.*;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;

public class StringOccurrence {

    public static void stringOccurence(String input){

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Input String: " + input);
        System.out.println("Character occurrences:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter a string: ");

            String input = scanner.nextLine();

            StringOccurrence.stringOccurence(input);

            System.out.println("Want to Exit [Y/N] ");

            String choice = scanner.nextLine();

            if(choice.equalsIgnoreCase("Y")){
                System.out.println("Thanks for using this map");
                break;
            }
        }
        scanner.close();
    }
}