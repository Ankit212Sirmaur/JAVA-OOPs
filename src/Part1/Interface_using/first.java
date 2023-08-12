package Part1.Interface_using;
import java.util.*;
public class first {
    public static void main(String[] args) {
        Abcimp a = new Abcimp();
        a.show();
        a.funClass();
        Pqr p = new Abcimp();
        p.print();
    }
}
interface Abc{
    void show();
}
interface Pqr {
    void print();
}
class Abcimp implements Abc,Pqr{
    public void show(){
        System.out.println("show interface");
    }
    public void print(){
        System.out.println("print function");
    }
    public void funClass(){
        System.out.println("function of class");
    }
}