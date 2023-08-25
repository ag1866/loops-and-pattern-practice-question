// program to print fibonacci series of n term given by the user 
import java.util.Scanner;
public class fibonacciseriespractice12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a+" "); // yha apn ne a print kradiya
        if(n > 1){
            for(int i = 2; i<=n; i++){
                System.out.println(b+" ");
                // now we will swap the element
                // agr hm swap nhi kraenge to ye barbar 0 ke bad kewal 1 1 print krta rhega
                int temp = b;
                b = a + b;
                a = temp;
            }

            System.out.println();
        }
    }
}
