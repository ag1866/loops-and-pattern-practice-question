// Enter 3 numbers from the user & make a function to print their average
import java.util.Scanner;
public class practice5 {
    public static int numAverage(int a, int b, int c){
        int d = (a + b + c)/3;
        return d;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(numAverage(a, b, c));
    }
}
