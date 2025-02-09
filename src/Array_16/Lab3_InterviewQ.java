package Array_16;

import java.util.Arrays;

public class Lab3_InterviewQ {
    public static void main(String args[]){

        Lab3_InterviewQ li = new Lab3_InterviewQ();
        li.secondMinimumNumber();

        //the second largest number
        int[] array = {25, 10, 66, 15, 36, 56, 77, 18, 29, 49};
        Arrays.sort(array);
        System.out.println("The second largest number is : "+array[array.length-2]);
    }

    public void secondMinimumNumber(){
        int[] array = {25, 10, 66, 15, 36, 56, 77, 18, 29, 49};
        Arrays.sort(array);
        System.out.println("The second minimum number is : "+array[1]);
    }
}
