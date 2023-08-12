package String;
import java.util.*;
public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = "  hello world  ";
//                   example good a
        String ans = to_reverse(st);
        System.out.println(ans);
    }
    public static String to_reverse(String s){
        String[] sp = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = sp.length - 1; i >= 0 ; i--) {
            String st = sp[i].trim();
            if(st.length() > 0){
                sb.append(st).append(" ");
            }
        }
        return sb.substring(0,sb.length()-1);
    }
}
