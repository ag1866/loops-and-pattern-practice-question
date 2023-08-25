// program to calculate the sum of the numbers 
// occurring in the multiplication table of 8
public class practice4 {
    public static void main(String[] args) {
        int n = 8;
        int sum = 0;
        for(int i=10; i>0; i--)
        {
            sum += n*i;
        }
        System.out.println(sum);
    }
}
