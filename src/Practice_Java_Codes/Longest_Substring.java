package Practice_Java_Codes;

import Interview_Ans_Que.Char;

public class Longest_Substring {
    public static void main(String args[]){

        String str = "abcabcbb";

        int maxLength = 0;

        for(int i = 0; i < str.length(); i++){

            String temp = "";

            for(int j = i; j < str.length(); j++){
                char ch = str.charAt(j);

                if(temp.indexOf(ch) != -1){
                    break;
                }

                temp = temp + ch;

                if(temp.length() > maxLength){
                    maxLength = temp.length();
                }
            }
        }

        System.out.println("Longest substring length : "+ maxLength);

    }
}
