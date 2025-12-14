package Practice_Java_Codes;

import Interview_Ans_Que.Char;

import java.util.*;

public class StringOccurence {
    public static void main (String args[]){

        String abhi = "Abhishek Pujari";

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < abhi.length(); i++){
            char ch = abhi.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            } else{
                map.put(ch, 1);
            }
        }

        for(Character key : map.keySet()){
            if(key == ' '){
                System.out.println("Space : "+map.get(key));
            } else {
                System.out.println(key + " : " + map.get(key));
            }
        }

    }
}
