package Part1.Revision.Recursion;
import java.util.*;
public class maximum_element_INarray {
    public static void main(String[] args) {
        int[] arr = {2,3,10,6,7,8};
        int ans = max(arr, 0);
        System.out.println(ans);
    }
    public static int max(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int greater = max(arr, idx+1);
        if(greater > arr[idx]){
            return greater;
        }else{
            return arr[idx];
        }
    }
}
