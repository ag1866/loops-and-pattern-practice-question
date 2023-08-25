public class reverse_array {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 9, 4};
        // int n = arr.length;
        for(int i = arr.length-1; i>=0; i--){
            System.out.println(arr[i] + " ");
        }
        // int[] arr = {5, 6, 8, 9, 4};
        // for (int i=0; i<arr.length/2; i++){
        //     int front = i;
        //     int back = arr.length - 1 - i;

            // char frontChar = arr.charAt(front); //we have defined the front with frontChar
            // char backChar = arr.charAt(back);

            // arr.setCharAt(front, backChar); // here we have replaced the front with back char and 
            // // back with front char
            // arr.setCharAt(back, frontChar);
            // // charAt means character at specific index
    }
}

