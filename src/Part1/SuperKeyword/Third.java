package Part1.SuperKeyword;
import java.util.*;
public class Third {
    public static void main(String[] args) {
        Q obj = new Q(5);
    }
}
class P{
    public P(){
        System.out.println("default of P");
    }
    public P(int x){
        System.out.println("para of P");
    }
}
class Q extends P{
    public Q(){
        System.out.println("default of Q");
    }
    public Q(int x){
        super(x);
        System.out.println("para of Q");
    }
}
