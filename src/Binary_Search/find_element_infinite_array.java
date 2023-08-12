package Binary_Search;
import java.util.*;
public class find_element_infinite_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9, 10, 11,12,13,24,25};
        int ans = search(arr, 25);
        System.out.println(ans);

//        the approach is to find the element in infinite length of array
    }

    public static int search(int[] arr, int key){
        int i = 0;
        int j = 1;
        while (key > arr[j]){
            i = j;
            j = Math.min(j*2, arr.length-1);
        }
        return bs(arr, i, j, key);
    }
    public static int bs(int[] arr, int i, int j, int key){
//        now apply binary search
        while(i <= j){
            int mid = (i + j) / 2;
           if(arr[mid] == key){
               return mid;
           }else if(arr[mid] > key){
               j = mid -1;
           }else {
               i = mid + 1;
           }
        }
        return -1;
    }
}
