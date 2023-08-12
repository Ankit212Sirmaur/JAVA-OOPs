package String;
import java.util.*;
public class string_Compression {
    public static void main(String[] args) {
        String str = "aaabbcccddaeef";
        String s1 = str.charAt(0) + "";

        for (int i = 1; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i-1);
            if(ch1 != ch2){
                s1 += ch1;
            }
        }
        System.out.println(s1);
    }
}
