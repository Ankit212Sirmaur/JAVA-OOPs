package Part1.array;
import java.util.*;
public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        int ans = rearrange_arr(arr);
        System.out.println(ans);
    }
    public static  int rearrange_arr(int[] arr){
        int start = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[start]){
                arr[start+1] = arr[i];
                start++;
            }
        }
        return  start + 1;
    }
}
