public class Main{
    public static void main(String args[]){
        int[] arr = {4,9,23,12,57};
        int sum = 0;
        for(int i : arr)
            sum += i;
        System.out.println("the sum of arr is : "+ sum);
    }
}