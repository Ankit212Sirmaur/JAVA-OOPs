package Part1.array;
import java.util.*;
public class union2Array {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4,7,8};
        int[] arr2 = {1,2,4,6,7,8,10};
        combine(arr1, arr2);
    }
    public static void combine(int[] b, int[] a){
        HashSet<Integer> hs = new HashSet<>();
        for (int val: b){
            hs.add(val);
        }
        for(int val: a){
            hs.add(val);
        }
        for(int val: hs){
            System.out.println(val + "-");
        }
    }
}
