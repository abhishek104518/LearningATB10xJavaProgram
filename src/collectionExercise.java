import java.util.ArrayList;

public class collectionExercise {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int arr[] = { 4, 4, 5, 5, 4, 5, 6, 9, 6 };

        ArrayList<Integer> ab = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int k = 0;

            if (!ab.contains(arr[i])) {
                ab.add(arr[i]);
                k++;

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        k++;
                    }
                }
                System.out.println(arr[i]);
                System.out.println(k);
                if (k == 1) {
                    System.out.println(arr[i] + " is unique number");
                }
            }
        }
    }
}
