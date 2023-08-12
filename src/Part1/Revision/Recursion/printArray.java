package Part1.Revision.Recursion;
import java.util.*;
public class printArray {
    public static void main(String[] args) {
        int[] arr = {2,34,5,7,89,};
        using_recursion(arr, 0);
    }
    public static void using_recursion(int[] arr , int idx){
        if(idx == arr.length) {
            return;
        }
        System.out.print(arr[idx] + "-");
        using_recursion(arr, idx+1);
    }
}
