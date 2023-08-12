package Binary_Search;
import java.util.*;
public class count_a_repeated_Element {
    public static void main(String[] args) {
        int[] arr = {2,10,10,10,10,18,20};
        int x = 10;
        int ans = search(arr,x,arr.length);
        System.out.println(ans);
    }
    public static int left_search(int[] arr, int x, int n){
        int i = 0;
        int j = n-1;
        int first = -1;
        while(i <= j){
            int mid = i + (j-1) /2;
            if(arr[mid] == x){
                first = mid;
                j = mid - 1;
            }else if(arr[mid] < x){
                i = mid + 1;
            }else {
                j = mid - 1;
            }
        }
        return first;
    }
    public static int right_search(int[] arr, int x, int n){
        int i = 0;
        int j = n-1;
        int last = -1;
        while(i <= j){
            int mid = i + (j-1) /2;
            if(arr[mid] == x){
               last = mid;
               i = mid + 1;
            }else if(arr[mid] < x){
                i = mid + 1;
            }else {
                j = mid - 1;
            }
        }
        return last;
    }
    public static int search(int[] arr, int x, int n){
        int first = left_search(arr, x,n);
        int last = right_search(arr, x,n);
        return last-first+1;
    }
}
