package Part1.Revision.Recursion;
import java.util.*;
public class reverse_array {
    public static void main(String[] args) {
        int[] arr = {3,56,7,89,10};
        function_reverse(arr,0);
    }
    public static void function_reverse(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        function_reverse(arr, idx+1);
        System.out.print(arr[idx] + " ") ;
    }
}
