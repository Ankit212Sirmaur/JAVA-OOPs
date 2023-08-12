package Part1.ThisKeyword;
import java.util.*;
public class first {
    public static void main(String[] args) {
        A obj = new A(10);
        obj.show();
    }
}
class A{
    private int a;
    public A(int x){
        a = x;
    }
    public void show(){
        System.out.println(a);
    }
}
