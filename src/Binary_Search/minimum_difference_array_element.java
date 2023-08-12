package Binary_Search;
import java.util.*;
public class minimum_difference_array_element {
    public static void main(String[] args) {
        int[] arr = {1,3,6,12,15};
        int ans = elements(arr, 8);
        System.out.println(ans);

//        so we can find the floor the ceil the number of the given target number
//        and last compare this two with difference of key
//        which one get

    }
    public static int elements(int[] arr, int key){
        int i = 0;
        int j = arr.length-1;
        int floor = -1;
        int ceil = -1;
        while (i <= j){
            int mid = i+ (j-i) /2;
            if(arr[mid] == key){
                return arr[mid];
            }
            else if(arr[mid] < key){
                floor = arr[mid];
                i = mid + 1;
            }else {
                j = mid - 1;
                ceil = arr[mid];
            }
        }
//        return Math.min(key-floor, ceil-key);
        if(key - floor > ceil - key){
            return ceil;
        }else {
            return floor;
        }
    }

}
