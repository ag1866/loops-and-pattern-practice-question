// For a given matrix of N x M, print its transpose
// ek question java placement course ke lecture no. 9 main
// h notes mwo krlena
import java.util.Scanner;

public class array2d18practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols]
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // transpose of matrix
        for(int j=0; j<cols; j++){
            for(int i=0; i<rows; i++){
                System.out.println(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }
}
