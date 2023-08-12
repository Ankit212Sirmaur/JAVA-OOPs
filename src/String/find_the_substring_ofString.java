package String;
import java.util.*;
public class find_the_substring_ofString {
    public static void main(String[] args) {
        String str = "abed";

        for(int i = 0; i<str.length(); i++){
            String s = str.substring(i);
            System.out.println(s);
        }
    }
}
