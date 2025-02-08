package Task_7th_Feb;

public class PyramidPattern {
    public static void main(String args[]){

        PyramidPattern pp = new PyramidPattern();
        pp.invertedPyramidPattern();

        int n = 5; // Height of the pyramid

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Print spaces for each row
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars for each row
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }

    public void invertedPyramidPattern(){
        int n = 5; // Height of the pyramid

        // Outer loop for each row
        for (int i = n; i >= 1; i--) {
            // Print spaces for each row
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars for each row
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
