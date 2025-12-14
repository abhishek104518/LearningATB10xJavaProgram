package Practice_Java_Codes;

import java.util.HashSet;

public class Duplicates2 {
    public static void main(String args[]){

        Duplicates2 dup = new Duplicates2();
        dup.duplicate2();

        String[] names = {"ram", "shyam", "sita", "gita", "ram", "shyam", "sita"};
        HashSet<String> unique = new HashSet<>();
        System.out.print("Duplicate names are : ");
        for(String name : names){
            if(!unique.add(name)){
                System.out.print(" "+ name);
                //break;
            }
        }
    }

    public void duplicate2(){
        String[] names = {"ram", "shyam", "sita", "gita", "ram", "shyam", "sita"};
        System.out.print("Duplicate names are : ");
        for(int i = 0; i< names.length; i++){
            for(int j = i+1; j< names.length; j++){
                if(names[i] == names[j]){
                    System.out.print(" "+names[i]);
                    break;
                }
            }
        }
    }
}
