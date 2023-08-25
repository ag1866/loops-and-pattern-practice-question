// Make a function to print the table of a given number n
// abhi ye question nhi hua h
import java.util.Scanner;
public class function3 {
    public static void numTable(int n){
        for(int i=1; i<11; i++){
            System.out.println(n*i);
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        numTable(n);
        
    }

}
