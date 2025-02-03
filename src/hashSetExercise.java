import java.util.HashSet;
import java.util.Iterator;

public class hashSetExercise {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        HashSet<String> hs = new HashSet<String>();
        hs.add("USA");
        hs.add("UK");
        hs.add("India");
        hs.add("Abhishek");
        hs.add("Pujari");
        System.out.println(hs);

        Iterator<String> i = hs.iterator();
        // System.out.println(i.next());

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        for(int j =0; j<hs.size(); j++){
            System.out.println(i.next());
        }
    }

}