package Task_5th_Feb;

public class lab01_StringFunctions {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Abhishek Pujari ");
        sb.append("Cool-Guy");
        sb.reverse();
        System.out.println(sb);

        lab01_StringFunctions sf = new lab01_StringFunctions();
        sf.reverseString();
    }

    public void reverseString(){
        String str = "Abhishek Pujari";
        String reverse = "";
        for(int i =str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }
}
