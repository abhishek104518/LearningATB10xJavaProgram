package Task_7th_Feb;

public class RightAngledTriangle {
    public static void main(String args[]){

        RightAngledTriangle ra = new RightAngledTriangle();
        ra.invertedRightAngledTriangle();

        int n = 5;
        for(int i =1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void invertedRightAngledTriangle(){
        int n = 5;
        for(int i=n; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
