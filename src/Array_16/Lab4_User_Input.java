package Array_16;

import java.util.Scanner;

public class Lab4_User_Input {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input size : ");
        int size = sc.nextInt();

        String[] arr = new String[size]; //ethe int kel tr number o/p madhe taku shakto
        for(int i =0; i<arr.length; i++){
            System.out.println("Enter the number : ");
                    arr[i] = sc.next();  // ethe sc.nextInt() karayche mg error yenar nahi
        }

        System.out.println("---------------------------------");

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
