package Array_16;


public class Abhis2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Abhis2 ab2 = new Abhis2();
        ab2.aB();

        // all values iterate karty
        int abc[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 1, 2, 0 } };

        // tyamule row and column no. konta pn ghetla tr chaltoy
        int min = abc[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (abc[i][j] < min) {
                    min = abc[i][j];
                }
            }
        }
        System.out.println(min);
    }

    public void aB() {

        int abc[][] = { { 2, 9, 5 }, { 3, 4, 7 }, { 1, 2, 10 } };
        int max = abc[1][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (abc[i][j] > max) {
                    max = abc[i][j];
                }
            }
        }
        System.out.println(max);
    }

}

