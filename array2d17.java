import java.util.Scanner;
public class array2d17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] nums = new int [rows][cols];
        // imput
        // rows
        for(int i=0; i<rows; i++){
            // column
            for(int j=0; j<cols; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        // output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(nums[i][j] == x){
                    System.out.println(i  + ", " + j );
                }
            }
        }
    }
}
