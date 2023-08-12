package String;
import java.util.*;
public class string_builder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("hello");

        char ch = sb.charAt(0);
        System.out.println(ch);

        sb.setCharAt(0,'d');
        System.out.println("replace the char h to d: " +sb);

        sb.insert(2,'y');
        System.out.println("after insert at 2 index: " + sb);

        sb.delete(1,3);
        System.out.println(sb);

        sb.deleteCharAt(2);
        System.out.println("also delete the element from index: " + sb);

        sb.append("xx");
        System.out.println(sb);

        System.out.println(sb.length());
    }
}
