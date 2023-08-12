package Part1.array;
import java.util.*;
public class print_with_ascii_char {
    public static void main(String[] args) {
        String s = "abdgca";
        String ans = add_withNumber(s);
        System.out.println(ans);
    }
    public static String add_withNumber(String s){
        StringBuilder sb = new StringBuilder();
        char ch = s.charAt(0);

        sb.append(ch);

        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);

            int gap = curr - prev;
            sb.append(gap);
            sb.append(curr);
        }
        return sb.toString();
    }
}
