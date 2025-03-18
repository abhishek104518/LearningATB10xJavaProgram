package Java_Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleCode {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String pattern = "Hello";

        Pattern p = Pattern.compile(pattern);

        Matcher m = p.matcher("Hello World");

        boolean found = m.find();

        System.out.println("Pattern found - " + found);
    }

}
