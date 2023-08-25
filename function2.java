// Make a function to check if a given number n is even or not
import java.util.Scanner;
public class function2 {
    public static boolean isEven(int n){
        if(n%2 == 0){
            return false;
        }
        else{
            return true;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your number");
            int n = sc.nextInt();
            System.out.println(isEven(n));
        }
    }
    
}
