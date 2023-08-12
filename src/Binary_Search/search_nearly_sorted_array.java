package Binary_Search;
import java.util.*;
public class search_nearly_sorted_array {
    public static void main(String[] args) {
        int[] arr = {5,10,30,20,40};
        int ans = bn(arr, arr.length-1, 40);
        System.out.println(ans);

    }
    public static int bn(int[] arr, int n, int key){
        int i = 0;
        int j = n-1;
        while(i <= j){
            int mid = i + (j-i) / 2;
            if(arr[mid] == key){
                return mid;
            }
            if(mid - 1>= i && arr[mid-1] == key){
                return mid -1;
            }
            if(mid + 1 <= j && arr[mid+1] == key) {
                return mid + 1;
            }
            else if(arr[mid] < key){
                i = mid + 1;
            }else if(arr[mid] > key){
                j = mid - 1;
            }
        }
        return - 1;
    }
}
