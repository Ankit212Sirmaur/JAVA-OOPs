package Part1.array;
import java.util.*;
public class firstReapting_Value {
    public static void main(String[] args) {
        int[] arr = {2,3,4,4,3,5,7};
        int ans = find_first_repeatingElement(arr);
        if(ans != -1){
            System.out.println(arr[ans]);
        }else {
            System.out.println("not repeating value");
        }
    }
    public static int  find_first_repeatingElement(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        int index = -1;
        for (int i = arr.length-1; i>=0; i--) {
            if(set.contains(arr[i])){
                index = i;
            }else {
                set.add(arr[i]);
            }
        }
        return index;
        }
    }
