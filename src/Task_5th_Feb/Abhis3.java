package Task_5th_Feb;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Abhis3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Abhis3 a = new Abhis3();
        a.aabbhi();
        System.out.println("\t");
        a.abbhhii();
        System.out.println("\t");

        int abc[][] = { { 2, 4, 5 }, { 3, 4, 0 }, { 1, 2, 9 } };
        int min = abc[0][0];
        int minColumn = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (abc[i][j] < min) {
                    min = abc[i][j];
                    minColumn = j;
                }
            }
        }
        System.out.println(min);

        int max = abc[0][minColumn];
        int k = 0;

        while (k < 3) {
            if (max < abc[k][minColumn]) {
                max = abc[k][minColumn];
            }
            k++;
        }
        System.out.println(max);
    }

    public void aabbhi() {

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");

        System.out.println(sdf.format(d));
        System.out.println(sd.format(d));
        System.out.println(d.toString());
    }

    public void abbhhii() {

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdff = new SimpleDateFormat("M/d/yyyy hh:mm:ss");

        System.out.println(cal.getTime());
        System.out.println(cal.get(Calendar.AM_PM));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.MINUTE));
    }

}

