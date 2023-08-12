package Part1.Polymorphism;
import java.util.*;
public class polymorphism {
    public static void main(String[] args) {
        B obj = new B();
//        A obj2 = new A();
//        obj2.show();
        obj.show();
    }
}
class A{
    public void show(){
        System.out.println("Show A");
    }
}
class B extends A{
    public void show(){
        System.out.println("show B");
    }
}
