package Part1.array;
import java.util.*;
public class sortArrayFrequencyOccurence {
    public static void main(String[] args) {
        Integer[] arr = {10,7,10,11,10,7,5,6};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(sortArrayFrequencyOccurence.sorting(list));
    }
    public static List<Integer> sorting(List<Integer> arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val: arr){
            if(map.containsKey(val)){
                int of = map.get(val);
                int nf = of + 1;
                map.put(val, nf);
            }else {
                map.put(val, 1);
            }
        }
        arr.sort((k1,k2) ->{
            int f1 = map.get(k1);
            int f2 = map.get(k2);

            if(f1 != f2){
                return f2-f1;
            }
            return arr.indexOf(k1) - arr.indexOf(k2);
        });
        return arr;
    }
}
