package Task_7th_Feb;

import java.util.Scanner;

public class StringPrasanna {

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
//        System.out.println("Input String : ");
//        String s = sc.next();
//        // String P = "Prasanna";
//        String rev = "";
//        for ( int i = s.length()-1; i >= 0; i--){
//            rev += s.charAt(i);
//       }
//        int i = s.length()-1;
//        while(i>=0){
//            rev += s.charAt(i);
//            i--;
//        }
//        System.out.println(rev);
        int t=sc.nextInt();
        while(t-->0){
            String str=sc.next();
            String rev="";
            int length=str.length()-1;
            for(int i=length;i>=0;i--){
                rev+=str.charAt(i);
            }
            System.out.println(rev);
        }
    }
}
