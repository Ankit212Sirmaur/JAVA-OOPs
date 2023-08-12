package Binary_Search;
import java.util.*;
public class first_index_of_infinite_array {
    public static void main(String[] args) {
//       find first index of the elements 1 i.e given the infinite array

        int[] arr = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int ans = search_first_Index(arr, 1);
        System.out.println(ans);
    }
    public static int search_first_Index(int[] arr, int key){
        int i = 0;
        int j = 1;
        int ans = -1;
        while (key > arr[j]){
            i = j;
            j = Math.min(j*2, arr.length-1);
        }
        while (i <= j) {
            int mid = i + (j-i) / 2;
            if (arr[mid] == key) {
                ans = mid;
                j = mid - 1;
            } else if (arr[mid] > key) {
                j = mid - 1;
            }else {
                i = mid + 1;
            }
        }
        return ans;
    }
}
