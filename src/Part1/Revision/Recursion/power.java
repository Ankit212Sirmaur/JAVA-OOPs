package Part1.Revision.Recursion;
import java.util.*;
public class power {
    public static void main(String[] args) {
        int number = 5;
        int power = 3;
        int ans = caluculate(number, power);
        System.out.println(ans);
    }
    public static int caluculate(int n, int p){
        if( p == 0){
            return 1;
        }
        int ans = caluculate(n, p-1);
        return n *ans;
    }
}
