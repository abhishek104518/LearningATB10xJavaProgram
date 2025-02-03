import java.util.ArrayList;

public class Exercise {
    public static void main(String args[]){
        ArrayList<String> a = new ArrayList<String>();
        a.add("apple");
        a.add("banana");
        a.add("cherry");
        a.add("mango");
        a.add("apple");
        System.out.println(a);
        a.remove(4);
        System.out.println(a);
        System.out.println(a.contains("orange"));
        if(a.contains("orange")){
            System.out.println("orange found");
        } else{
            System.out.println("orange not found");
        }
        System.out.println(a.size());

        // Iterate through the ArrayList and print index and value
        System.out.println("ArrayList contents with index:");
        for (int i = 0; i < a.size(); i++) {
            System.out.println("Index: " + i + " | Value: " + a.get(i));
        }
    }
}
