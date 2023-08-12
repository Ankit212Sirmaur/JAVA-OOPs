package Part1.Revision.Recursion;
import java.util.*;
public class printIncreasin {
    public static void main(String[] args) {
        int n = 5;
        pif(n);
    }
    public static void pif(int n){
        if( n == 0){
            return;
        }
        pif(n -1);
        System.out.print(n + " ");
    }
}
