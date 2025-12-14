package Interview_Ans_Que;

public class FirstAndLast {
    public static void main(String args[]){

        String sentence = "Java is a poerfull language";

        String[] word = sentence.trim().split(" ");

        String first = word[0];
        String last = word[word.length-1];

        System.out.println("First : "+first);
        System.out.println("Last : "+last);


    }
}
