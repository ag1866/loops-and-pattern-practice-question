import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        // public static void main(String[] args) {
            // Scanner sc = new Scanner(System.in);
            // String firstname = "tony";
            // String lastname = "stark";
            // String fullname = firstname + lastname;
            // System.out.println(fullname.length());
            // charAt
            // for(int i=0; i<fullname.length(); i++){
            //     System.out.println(fullname.charAt(i)));
        String s1 = "Tony";
        String s2= "Tony";
            //1 s1>s2 : +ve value
            //2 s1 == s2 : 0
            //3 s1 < s2 : -ve value
        if(s1.compareTo(s2) == 0){
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings are not equal");
        }
        if(s1 == s2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
// we can use if only in place of compareTo but in if only 
// there will be some test case which will not pass
// that will fail that's why er are using compareTo
        if(new s1("Tony") == new s2("Tony")){
            System.out.println("Strings are equal");
        }  else{
            System.out.println("Strings are not equal");
        }
         
        

// Strings are immutable
// to find substring
        String s3 = "I am a student";
        String name = s3.substring(11, s3.length());
        System.out.println(name);

    }
}

