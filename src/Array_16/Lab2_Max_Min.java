package Array_16;

public class Lab2_Max_Min {
    public static void main(String args[]){

        Lab2_Max_Min mm = new Lab2_Max_Min();
        mm.getMinNumber();
        System.out.println("\t");
        mm.sumOfNumbers();
        System.out.println("\t");

        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max = array[0];
        for(int i =0; i<array.length; i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println("Maximum number is : "+max);
    }
    public void getMinNumber(){
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int min = array[0];
        for(int i =0; i<array.length; i++){
            if(min>array[i]){
                min = array[i];
            }
        }
        System.out.println("Minimum number is : "+min);
    }

    public void sumOfNumbers(){
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            sum += array[i];
        }
        System.out.println("The Sum of all numbers is : "+sum);
    }
}
