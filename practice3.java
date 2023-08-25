// factorial of a given number using for/while loops.
import java.util.Scanner;
public class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        // int i = 1;
        int factorial = 1;
        // while(i<=n){
        //     factorial *= i;
        //     i++;
        // }
        // System.out.println(factorial);
        for(int i=1; i<=n; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
