package Part1.Interface_using;
import java.util.*;
interface Ab{
    public void show();
}
interface yyy{

}
interface xyz extends Ab, yyy{

}
//interface supports multiple inheritance

public class Functional_interface {
    public static void main(String[] args) {
//        Ab ob = new Ab() {
//            public void show() {
//                System.out.println(" in show ");
//            }
//        };

//        this is java 1.8
        Ab ob = () -> System.out.println("in show");
        ob.show();
    }
}
