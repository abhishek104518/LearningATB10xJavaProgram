package Array_16;

public class Lab5_2D_Arrayy {
    public static void main(String args[]){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        //in this 3 - rows and 3 - columns present
        for(int i =0; i<arr.length; i++)
        {
            for(int j =0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+"|");
            }
            System.out.println();
        }
    }
}
