import java.util.Scanner;

public class convertDaysYears {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int days = scanner.nextInt();

        int years = days/365;
        days = days % 365;

        int month = days/30;
        days = days % 30;

        System.out.println("Equivalent time : "+years+"years, "+month+"month, & "+days+"days");
        scanner.close();
    }
}
