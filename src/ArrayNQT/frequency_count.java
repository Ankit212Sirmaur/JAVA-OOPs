package ArrayNQT;

import java.util.HashMap;
import java.util.Map;

public class frequency_count {
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        count_Fre(arr,6);
    }
    public static void count_Fre(int[] arr, int n){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int val : arr){
            if(map.containsKey(val)){
                int of = map.get(val);
                int nf = of + 1;
                map.put(val, nf);
            }else {
                map.put(val, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +"-" + entry.getValue());
        }
    }
}
