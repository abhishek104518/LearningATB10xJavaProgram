package Practice_Java_Codes;

import java.util.*;

public class Duplicates4 {
    public static void main(String args[]){

        String str = "Java is java language";

        String[] words = str.toLowerCase().split(" ");

        Map<String, Integer> map = new HashMap<>();

        for(String word : words){
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            } else{
                map.put(word, 1);
            }
        }

        System.out.print("Duplicate words are : ");

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.print(entry.getKey());
            }
        }
    }
}
