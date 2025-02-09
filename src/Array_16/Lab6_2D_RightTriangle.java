package Array_16;

import java.util.Scanner;

public class Lab6_2D_RightTriangle {
    public static void main(String args[]){

        Lab6_2D_RightTriangle rt = new Lab6_2D_RightTriangle();
        rt.invertedRightTriangle();
        System.out.println("\t");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for(int i =0; i<n; i++)
        {
            for(int j= 0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void invertedRightTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for(int i = n; i>=1; i--)
        {
            for(int j = 1; j<= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
