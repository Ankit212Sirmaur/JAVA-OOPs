package Part1.SuperKeyword;
import java.util.*;
public class second {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
class A{
    public void show(){
        System.out.println("A class");
    }
}
class B extends A{
    public void show(){
        super.show();
        System.out.println("B class");
    }
}
