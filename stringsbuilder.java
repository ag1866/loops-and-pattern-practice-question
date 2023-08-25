public class stringsbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
// insert n
        sb.insert(2, 'n');
        System.out.println(sb);
// delete n
        sb.delete(2, 3);
        System.out.println(sb);
    }
}
