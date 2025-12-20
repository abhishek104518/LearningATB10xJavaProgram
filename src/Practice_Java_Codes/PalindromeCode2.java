package Practice_Java_Codes;

public class PalindromeCode2 {
    public static void main(String args[]){

        int num = 121;

        int original = num;

        int rev = 0;

        for(; num > 0; num = num/10){
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
        }

        if(original == rev){
            System.out.println("This is Palindrome number : "+ rev);
        } else {
            System.out.println("This is not Palindrome number : "+ rev);
        }
    }
}
