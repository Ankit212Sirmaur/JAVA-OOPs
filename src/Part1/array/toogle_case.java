package Part1.array;
import java.util.*;
public class toogle_case {
    public static void main(String[] args) {
        String s = "pepCoDinG";
        String ans = convert_lower_case_and_upperCase(s);
        System.out.println(ans);
    }
    public static String convert_lower_case_and_upperCase(String s){
        StringBuilder sb = new StringBuilder(s);
//        get and set possible in stringBuilder
        for (int i = 0; i < sb.length(); i++) {
            char ch = s.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                char uch = (char) ('A' + ch - 'a');
                sb.setCharAt(i, uch);
            }else if( ch >= 'A' && ch <= 'Z'){
                char lch = (char) ('a' + ch - 'A');
                sb.setCharAt(i, lch);
            }
        }
        return sb.toString();
    }
}
