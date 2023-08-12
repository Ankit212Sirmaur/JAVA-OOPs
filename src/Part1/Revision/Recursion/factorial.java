package Part1.Revision.Recursion;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = function_fact(n);
        System.out.println(ans + "-");
    }
    public static int function_fact(int n){
        if( n == 1 || n == 0){
            return 1;
        }else return n *function_fact(n-1);
    }
}
