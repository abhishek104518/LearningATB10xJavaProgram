public class Task5thFeb {
    public static void main(String args[]){

        Task5thFeb tf = new Task5thFeb();
        tf.evenNumbers();
        System.out.println("\t");
        tf.printHello();
        System.out.println("\t");
        tf.sumOfNumbers();
        System.out.println("\t");
        tf.multiplicationTableOfFive();
        System.out.println("\t");
        tf.evenNumbers1();
        System.out.println("\t");
        tf.printJava();
        System.out.println("\t");
        tf.sumOfNumbers2();
        System.out.println("\t");
        tf.multiplicationTableOfSeven();
        System.out.println("\t");

        //print 1 to 10 numbers
        for(int i=1; i<11; i++){
            System.out.println(i);
        }
    }

    public void evenNumbers(){
        for(int i =1; i<=20; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

    public void printHello(){
        for(int i =1; i<=5; i++){
            System.out.println("Hello");
        }
    }

    public void sumOfNumbers(){
        int sum = 0;
        for(int i =1; i<=10; i++){
            sum += i;
        }
        System.out.println("The sum of 10 numbers : "+sum);
    }

    public void multiplicationTableOfFive(){
        for(int i =1; i<=10; i++){
            System.out.println(i*5);
        }
    }

    public void evenNumbers1(){
        int i = 1;
        while(i<=20){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }

    public void printJava(){
        int i =1;
        while(i<6){
            System.out.println("Java");
            i++;
        }
    }

    public void  sumOfNumbers2(){
        int sum = 0;
        int i =1;
        while(i<201){
            sum += i;
            i++;
        }
        System.out.println("The sum of numbers is : "+sum);
    }

    public void multiplicationTableOfSeven(){
        int i =1;
        while(i<11){
            System.out.println(i*7);
            i++;
        }
    }
}
