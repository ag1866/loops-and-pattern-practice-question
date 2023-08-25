import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // using for loop
        // for(int i=1; i<11; i++){
        //     System.out.println(a+" * "+i+ " = "+ i*a);
        // }
        // using while loop
        // int i = 1;
        // while(i<11){
        //     System.out.println(a+" * "+i+ " = "+ i*a);
        //     i++;
        // }
        // using for loop in reverse order
        for(int i=10; i>0; i--)
        {
            System.out.println(a+" * "+i+ " = "+ i*a);
        }
    }
}
