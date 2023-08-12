package Part1.HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class union_of_Array {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,2,2,3,5};
        int[] arr2 = {1,1,1,2,2,4,5};
        int flag = 0;
//        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int x: arr1){
            hs.add(x);
        }
        for(int x:arr2){
            hs.add(x);
        }
        System.out.println(hs.size());

    }
}
