public class Main{
    public static void main(String args[]){

        Main m = new Main();
        m.reverseString();
        m.revString();

        int[] arr = {4,9,23,12,57};
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
}