package Part1.HashMap;
import java.util.*;
public class intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1,1,2,2,2,3,5};
        int[] arr2 = {1,1,1,2,2,4,5};
        HashSet<Integer> hs = new HashSet<>();
        for(int val: arr1){
            hs.add(val);
        }
        int count =0;
        for(int val: arr2){
            if(hs.contains(val)){
                count++;
                hs.remove(val);
            }else {
                hs.add(val);
            }
        }
        System.out.println(count);

    }
}
