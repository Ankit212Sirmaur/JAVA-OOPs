package ArrayNQT;

import java.util.HashSet;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        fun_for_Remove(arr);
    }
    public static void fun_for_Remove(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int val: arr){
            set.add((val));
        }
        System.out.println(set.size());
    }
}
