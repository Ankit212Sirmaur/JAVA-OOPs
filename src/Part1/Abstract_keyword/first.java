package Part1.Abstract_keyword;
import java.util.*;
public class first {
    public static void main(String[] args) {
        Mahesh m = new Suresh();
        m.cook();
        m.call();
        m.move();
    }
}
abstract class Mahesh{
    public void call (){
        System.out.println("call in invoked");
    }
    public abstract void cook();
    public abstract void move();
}
abstract class Ramesh extends Mahesh{
    public void cook(){
        System.out.println("cook is also invoked");
    }
    public abstract void move();
}
class Suresh extends Ramesh{
    public void move(){
        System.out.println("move is now invoked");
    }
}
