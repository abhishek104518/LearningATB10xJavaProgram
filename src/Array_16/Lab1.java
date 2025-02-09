package Array_16;

import java.util.Arrays;

public class Lab1 {
    public static void main(String args[]){

        Lab1 lab = new Lab1();
        lab.getReverseMarks();
        System.out.println("\t");

        int[] marks = {51, 100, 91, 87, 90};
        Arrays.sort(marks);
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }

    public void getReverseMarks(){
        int[] marks = {51, 100, 91, 87, 90};
        for(int i= marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
    }
}
