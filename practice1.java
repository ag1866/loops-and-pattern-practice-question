import java.util.Scanner;
// sum of first n even number
public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int sum = 0;
        // for(int i=0;i<n;i++){
        //     sum = sum + (2*i);
        // }
        // System.out.println(sum);
        for(int i=0; i<n; i++){
            if(n%2 == 0){
                sum = sum + i;

            }

        }
        System.out.println(sum);
    }
    
}
