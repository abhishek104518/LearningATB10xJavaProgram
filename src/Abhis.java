
public class Abhis {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*
         * int a[][] = new int[2][3]; a[0][0] = 1; a[0][1] = 2; a[0][2] = 3; a[1][0] =
         * 4; a[1][1] = 5; a[1][2] = 6;
         */

        Abhis ab = new Abhis();
        ab.abHI();
        ab.abhisss();
        System.out.println("\t");

        int b[][] = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 8, 9 }, { 10 } };

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println(b[i][j]);
            }
        }
    }

    public void abHI() {

        // 1st bracket row = 2 ahet; 2nd bracket column = 3 ahet;

        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(a[i][j]);
            }
        }
        System.out.println("\t");
    }

    public void abhisss(){
        int arr[] = {11,33,55,77,87,98,110};
        for(int i=0; i<arr.length;i++){
            if(arr[i]%5==0 && arr[i]%11==0){
                System.out.println(arr[i]);
            }
        }
    }

}
