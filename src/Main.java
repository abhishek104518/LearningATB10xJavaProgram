public class Main{
    public static void main(String args[]){

        Main m = new Main();
        m.reverseString();
        m.revString();
        m.revString2();
        System.out.println("\t");
        m.stringBuilderMethod();

        int[] arr = {12,34,10,34,55,89};
        int sum = 0;
        for(int i : arr)
            sum += i;
        System.out.println("the sum of arr is : "+ sum);
    }

    public void reverseString(){
        String input = "Mogamboo Khush Hua";
        StringBuilder answer = new StringBuilder();
        String[] arr = input.split(" ");
        for(int i= arr.length-1; i>=0;i--){
            answer.append(arr[i]);
            if(i != 0){
                answer.append(" ");
            }
        }
        System.out.println(answer);
    }

    public static void revString() {
        String input = "Mogamboo Khush Hua";
        String[] arr = input.split(" "); // Split input into words

        for (int i = 0; i < arr.length; i++) {
            // Reverse each word
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
        }

        // Join the reversed words with spaces
        String result = String.join(" ", arr);
        System.out.println(result);
    }

    public void revString2(){
        String abhi = "Abhishek";
        String[] arr = {"A","b","h","i","s","h","e","k"};
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }

    public void stringBuilderMethod(){
        StringBuilder sb = new StringBuilder("Mogamboo Khush ");
        sb.append("Hua");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}