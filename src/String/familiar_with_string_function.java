package String;
import java.util.*;
public class familiar_with_string_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();  // take the count of space
        String s2 = sc.next();      // ignore the space of string
//        ankit kumar
        System.out.println(s1);  // ankit kumar
        System.out.println(s2); // ankit

        System.out.println(s1.length()); // 11

        System.out.println(s2.length()); // 5

        char ch = s1.charAt(3);
        System.out.println(ch);  // gives the char at index of particular string



    }
}
