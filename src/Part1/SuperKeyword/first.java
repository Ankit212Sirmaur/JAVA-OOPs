package Part1.SuperKeyword;
import java.util.*;
public class first {
    public static void main(String[] args) {
        child ch = new child();
        ch.show();
    }
}
class parent {
    int i = 9;
}
class child extends parent{
    int i = 5;
    public void show(){
        System.out.println(i);  // -> 5
        System.out.println(super.i);  // -> 9
    }
}
