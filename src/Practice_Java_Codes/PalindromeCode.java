package Practice_Java_Codes;

public class PalindromeCode {
    public static void main(String args[]){

        String original = "madam";

        String rev = "";

        for(int i = original.length()-1; i >= 0; i--){
            rev += original.charAt(i);
        }

        if(original.equals(rev)){
            System.out.println("This is Palindrome : "+rev);
        } else{
            System.out.println("This is not Palindronme : "+rev);
        }
    }
}
