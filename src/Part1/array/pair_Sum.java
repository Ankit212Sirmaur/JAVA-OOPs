package Part1.array;
import java.util.*;
public class pair_Sum {
    public static void main(String[] args) {
        int[] arr = {12,3,5,1,9};
        int target_sum = 10;
        boolean ans = search(arr, target_sum);
        System.out.println(ans);

    }
    public static boolean search(int[] arr, int key){
//        for(int i = 0; i< arr.length-1; i++){
//            for(int j = i+1; j< arr.length; j++){
//                if(arr[i] + arr[j] == key){
//                    return true;
//                }
//            }
//        }
        Arrays.sort(arr);
        int s = 0;
        int e = arr.length-1;
        while(s<e){
            if(arr[s] + arr[e] == key){
                return true;
            } else if(arr[s] + arr[e] > key){
                e--;
            }else {
                s++;
            }
        }
        return false;
    }
}
