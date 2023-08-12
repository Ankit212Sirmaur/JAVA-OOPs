package Part1.Revision;
import java.util.*;
public class find_repeatingValue {
    public static void main(String[] args) {
        int [] arr = {2,3,4,4,3,5,7};
        function(arr);
//        System.out.println(ans);
    }
    public static void function(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i = arr.length-1; i>=0; i--){
            if(set.contains(arr[i])){
                System.out.println(arr[i]);
            }else{
                set.add(arr[i]);
            }
        }
    }

}
