package Part1.HashMap;
import java.util.*;
public class Get_common_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1,1,2,2,2,3,5};
        int[] arr2 = {1,1,1,2,2,4,5};
//        common will be = 1,2,5
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int val: arr1){
            if(hm.containsKey(val)){
                int of = hm.get(val);
                int nf = of + 1;
                hm.put(val,nf);
            }else {
                hm.put(val, 1);
            }
        }
        for(int val:arr2){
            if(hm.containsKey(val)){
                System.out.print(val + "\t");
                hm.remove(val);
            }
        }
    }
}
