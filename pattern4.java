
public class pattern4 {
    public static void main(String[] args) {
        // inverted half pyramid
        // int n = 5;
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //  inverted half pyramid rotated by 180 degree
        int n = 4;
        // outer loop
        for(int i=1; i<=n; i++){
            // space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
