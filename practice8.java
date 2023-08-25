// Write a function that takes in the radius as input and returns the 
// circumference of a circle
import java.util.Scanner;
public class practice8 {
    public static Double getCircumference(Double n){
        return 2 * 3.14 * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double n = sc.nextDouble();
        System.out.println(getCircumference(n));
    }

}
