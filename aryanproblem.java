// write a program in java to print the prime number in given range as input by user
import java.util.Scanner;
public class aryanproblem {

    public static boolean isPrime(int n){
        if(n<2)
            return false;
        
        for(int i = 2; i<n/2; i++){   // here we have taken till n/2 because if it find till n/2 then it can
            // find till n/2
            if(n % i == 0)
                return false;
        }
        return true;
            
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int lower = sc.nextInt();
            int upper = sc.nextInt();
            for (int i = lower; i<= upper; i++){
                if(isPrime(i)){
                    System.out.println(i);
                }
            }


    }
}
