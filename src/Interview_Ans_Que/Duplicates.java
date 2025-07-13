package Interview_Ans_Que;

import java.util.HashSet;

public class Duplicates {
    public static void main(String args[]){

        int[] numbers = {1,2,3,4,2,5,6,7,3};

        HashSet<Integer> unique = new HashSet<>();

        System.out.println("Duplicate numbers are : ");

        for(int num : numbers){
            if(!unique.add(num)){
                System.out.println(num);
            }
        }
    }
}
