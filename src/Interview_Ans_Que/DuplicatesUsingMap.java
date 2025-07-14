package Interview_Ans_Que;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesUsingMap {
    public static void main(String args[]){

        String[] names = {"ram", "shyam", "sita", "gita", "ram", "shyam", "sita", "ram"};

        HashMap<String, Integer> map = new HashMap<>();

        for(String name : names){
            if(map.containsKey(name)){
                map.put(name, map.get(name) +1);
            } else{
                map.put(name, 1);
            }
        }

        System.out.println("Duplicate names are : ");

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey()+" --> "+entry.getValue()+" Times");
            }
        }
    }
}
