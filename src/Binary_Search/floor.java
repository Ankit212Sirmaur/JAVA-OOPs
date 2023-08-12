package Binary_Search;
import java.util.*;
public class floor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9,12};
        int ans = find_floor(arr, 8);
        System.out.println(ans);
    }

   public static int find_floor(int[] arr, int k){
//        int[] res = new int[2];
        int floor = -1;
        int ceil = -1;
        int i = 0;
        int j = arr.length-1;
       while(i<= j){
           int mid = (i+j)/2;
           if(arr[mid] == k){
               return mid;
           }else if(arr[mid] < k){
//               floor = arr[mid];
               i = mid + 1;
           } else {
               j = mid - 1;
               ceil = arr[mid];
           }
       }
       return ceil;
   }
}
