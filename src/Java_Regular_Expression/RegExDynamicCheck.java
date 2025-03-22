package Java_Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegExDynamicCheck {

    public static void commonMethod(String re, String str){
        Pattern p = Pattern.compile(re);
        Matcher m = p.matcher(str);
        boolean matches = m.matches();
        System.out.println(matches);
    }

    public static void main(String args[]){
        while(true){
            System.out.println("Enter your Expression");

            Scanner sc = new Scanner(System.in);
            String re = sc.nextLine();

            String str = sc.nextLine();

            RegExDynamicCheck.commonMethod(re, str);

            System.out.println("Want to Exit [Y/N] ");

            String choice = sc.nextLine();

            if(choice.equalsIgnoreCase("Y")){
                System.out.println("Thanks for using this app");
                break;
            }
        }
    }
}
