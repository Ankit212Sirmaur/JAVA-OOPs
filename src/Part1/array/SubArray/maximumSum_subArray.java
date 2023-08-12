package Part1.array.SubArray;
import java.util.*;
public class maximumSum_subArray {
    public static void main(String[] args) {
        int[] arr = {3,2,5,4,1};
        int windowSize = 3;
        int ans = subArray3(arr,windowSize);
        System.out.println(ans);
    }
    public static int subArray3(int[] arr, int k){
        if(arr.length == 0 || k <= 0 || k> arr.length){
            return -1;
        }
        int sum = 0;
        for(int i =0; i<k; i++){
            sum += arr[i];
        }
        int maxSum = sum;
        int start = 0;
        for(int j = k; j<arr.length; j++){
            sum += arr[j] - arr[start];
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
