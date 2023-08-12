package Part1.Revision;
import java.util.*;
public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,3,4,4,5,6,6,7};
        newArray(arr);
    }
    public static void newArray(int[] arr){
        int start = 1;
        for(int i = 1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[start++] = arr[i];
            }
        }
        for (int i = 0; i < start; i++) {
            System.out.print(arr[i] + "-");
        }
    }
}
