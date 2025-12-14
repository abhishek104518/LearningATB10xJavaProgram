package Practice_Java_Codes;

public class String_Code {
    public static void main(String args[]){

        String A1 = "Java is Great";

        String[] words = A1.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = words.length-1; i>=0; i--){
            sb.append(words[i]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
