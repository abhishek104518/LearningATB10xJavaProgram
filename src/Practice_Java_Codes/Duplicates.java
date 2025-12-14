package Practice_Java_Codes;

import java.util.HashSet;

public class Duplicates {
    public static void main(String args[]){

        Duplicates dup = new Duplicates();
        dup.duplicate();


        int[] numbers = {1,2,3,4,5,2,3,4,6,7,8,5,6};
        HashSet<Integer> unique = new HashSet<>();
        System.out.print("Duplicate numbers are : ");
        for(int num : numbers){
            if(!unique.add(num)){
                System.out.print(" "+num);
            }
        }
    }

    //using for loop

    public void duplicate(){
        int[] numbers = {2,3,1,4,5,6,2,3,4,5};
        System.out.println("Duplicate numbers are : ");

        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){

                if(numbers[i] == numbers[j]){
                    System.out.println(numbers[i]);
                    break;
                }
            }
        }
    }
}
