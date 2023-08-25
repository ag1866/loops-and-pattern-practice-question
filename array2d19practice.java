import java.util.Scanner;
public class array2d19practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] flats = new int[rows][cols];
        // input
        // rows
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                flats[i][j] = sc.nextInt();

            }
        }
        // output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(flats[i][j] + " ");
            }
        }
        System.out.println("");

    }
}
