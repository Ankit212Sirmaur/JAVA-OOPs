package String;
import java.util.*;
public class largestOddNumber {
    public static void main(String[] args) {
        String s = "1056800";  // 52
        String ans = find_odd(s);
        System.out.println(ans);
    }
    public static String find_odd(String s){
        String ans = "";
        for (int i = s.length()-1; i>= 0; i--){
            char ch = s.charAt(i);
            if(ch % 2 != 0){
                return s.substring(0, i+1);
            }
        }
        return ans;
    }
}
