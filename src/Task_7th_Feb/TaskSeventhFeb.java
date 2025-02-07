package Task_7th_Feb;

import java.util.Scanner;

public class TaskSeventhFeb {
    public static void main(String args[]) {

        TaskSeventhFeb ts = new TaskSeventhFeb();
        ts.calculateSum();
        ts.factorialMethod();

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("The input number : ");
        int a = sc.nextInt();
        for (int j = 1; j <= 10; j++) {
            System.out.println(a * j);
        }

        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();

        // Check if the number is prime
        if (isPrime(number1)) {
            System.out.println(number1 + " is a prime number.");
        } else {
            System.out.println(number1 + " is not a prime number.");
        }
    }
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // If divisible, it's not prime
            }
        }
        return true; // If no divisors found, it's prime
    }

    public void calculateSum(){
        int sum = 0;
        for(int i=1; i<=100; i++){
            sum += i;
        }
        System.out.println("The sum of 1 to 100 is : "+sum);
    }

    public void factorialMethod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        long factorial = 1;
        // Calculate the factorial using for loop
        for(int i=1; i<=n; i++){
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is " + factorial);
    }

    public void primeNumber(){

    }
}
