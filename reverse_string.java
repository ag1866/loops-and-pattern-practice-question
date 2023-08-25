// reverse a string
public class reverse_string {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;
            char frontChar = sb.charAt(front); //we have defined the front with frontChar
            char backChar = sb.charAt(back);   // we have defined the back with backChar

            sb.setCharAt(front, backChar); // here we have replaced the front with back char and 
            // back with front char
            sb.setCharAt(back, frontChar);
            // charAt means character at specific index
        }
        System.out.println(sb);
    }
}
