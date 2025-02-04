import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExercise {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(0, "Abhishek");
        hm.put(1, "Sakharam");
        hm.put(2, "Pujari");
        System.out.println(hm);

        hm.remove(1);
        System.out.println(hm);

        System.out.println(hm.get(1));

        hm.put(1, "Good");
        hm.put(3, "morning");
        hm.put(4, "Bye");
        System.out.println(hm);
        System.out.println("\t");

        Set s = hm.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext()) {
            Map.Entry mp = (Map.Entry) it.next();
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
            System.out.println("\t");
        }
    }

}