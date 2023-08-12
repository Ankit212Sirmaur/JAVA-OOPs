package String;
import java.util.*;
public class removeParanthesis {
    public static void main(String[] args) {
        String str = "(()())(())(()(()))";
        String ans = function_for_remove(str);
        System.out.println(ans);
    }
    public static String function_for_remove(String s){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (c == 41) {
                count--;
            }
            if (count != 0) {
                sb.append(c);
            }
            if (c == 40) {
                count++;
            }
        }
        return sb.toString();
    }
}
