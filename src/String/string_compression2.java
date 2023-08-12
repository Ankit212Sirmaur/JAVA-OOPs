package String;
import java.util.*;
public class string_compression2 {
    public static void main(String[] args) {
        String str = "aaabbcccddaeef";
        String ans = function_for_compress(str);
        System.out.println(ans);

    }
    public static String function_for_compress(String str){
        String sb = str.charAt(0) + "";
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i-1);
            if(ch1 == ch2){
                count++;
            }
            else {
                if(count >= 1){
                    sb += count;
                }
                sb += ch1;
                count = 1;
            }
        }
        return sb;
    }
}
