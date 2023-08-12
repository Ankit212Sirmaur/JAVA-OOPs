package String;
import java.util.*;
public class part2_familiar_with_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "abed";
//        substring
        String s = str.substring(0,2);  // take one less than given index
        System.out.println(s);
        System.out.println(str.substring(1));  // also give the first index - then give the substring the given the last index

//        concatenate of string
        String st = "hello";
        System.out.println(st + 10 + 20);
        System.out.println(10 + 20 + st);

    }
}
