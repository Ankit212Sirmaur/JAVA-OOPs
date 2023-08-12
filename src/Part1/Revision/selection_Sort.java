package Part1.Revision;
import java.util.*;
public class selection_Sort {
    public static void main(String[] args) {
        int[] arr = {5,9,8,2,1};
        sort(arr);
        for(int val: arr){
            System.out.print(val + " ");
        }
    }
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i]  = temp;
            }
        }
    }
}
