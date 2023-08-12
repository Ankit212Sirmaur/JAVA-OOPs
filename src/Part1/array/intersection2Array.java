package Part1.array;
import java.util.*;
public class intersection2Array {
    public static void main(String[] args) {
        int[] a = {2,2,2,3,3,4,7,8};
        int[] b = {1,2,4,4,6,6,7,8,10};
        findCommon(a,b);
    }
    public static void findCommon(int[] a, int[] b){
        HashSet<Integer> hs = new HashSet<>();
        for(int val: a){
            hs.add(val);
        }
        for(int val: b){
            if(hs.contains(val)){
                System.out.println(val);
                hs.remove(val);
            }
        }
    }
}
