package Part1.Revision;
import java.util.*;
public class commonElementsof2Array {
    public static void main(String[] args) {
        int[] a = {2,2,2,3,4,7,8};
        int[] b = {1,2,4,4,6,6,7,8,10};
        function_common(a,b);
    }
    public static void function_common(int[] a, int[] b){
        HashSet<Integer> set = new HashSet<>();
        for (int val: a){
            set.add(val);
        }
        for(int val: b){
            if (set.contains(val)){
                System.out.print(val + "-");
            }
        }
    }
}
