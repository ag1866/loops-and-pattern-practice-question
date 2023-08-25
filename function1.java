// Make a function to check if a number is prime or not
// this question need to be correct
import java.util.Scanner;
public class function1 {
    public static boolean isnPrime(int n){
        if(n%2 == 0){
            return false;
        // } else if( n == 2){
        //     return true;
        // }
        
        
        else{
            return true;
        }
            
            
        // else if(n == 2){
        //     return true;
        
            

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        System.out.println(isPrime(n));

    }
}
