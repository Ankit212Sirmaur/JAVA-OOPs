package Part1.Revision;
import java.util.*;
public class findMaximumSum_ofSubarray_K {
    public static void main(String[] args) {
        int[] arr = {3,2,5,4,1};
        int ans = find_array_whose_sum_is_Max(arr,3);
        System.out.println(ans);
    }
    public static int find_array_whose_sum_is_Max(int[] arr, int k){
        if(arr.length == 0 || k<=0 || k> arr.length){
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxSum = sum;
        int start = 0;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[start++];
            if(sum >maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
