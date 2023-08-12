package Part1.Revision;
import java.util.*;
public class printGreaterElements {
    public static void main(String[] args) {
        int[] arr = {14,15,8,9,5,2};
//        print if the elements is greater than the right side of elements
        function(arr);
    }
    public static void function(int[] arr){
        int max = 0;
        for (int i = arr.length-1; i>=0; i--) {
            if(arr[i] > max){
                max = arr[i];
                System.out.println(arr[i]);
            } else {
                continue;
            }
        }
    }
}
