package Part1.array;
import java.util.*;
public class sort012 {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,2,0,1,2,1,0};
        sort(arr, arr.length);
        for (int val: arr){
            System.out.print(val + " -");
        }
    }
    public static void sort(int[] arr , int n){
//        don't disturb 1
//        play with 0, 2 only => 1 will replace automatically
        int l = 0;
        int m = 0;
        int h = n-1;
        while (m<=h){
            if(arr[m] == 1){
                m++;
            }else if(arr[m] == 0){
                int temp = arr[m];
                arr[m] = arr[l];
                arr[l] = temp;
                l++;
                m++;
            }else {
                int temp = arr[m];
                arr[m] = arr[h];
                arr[h] = temp;
                h--;
            }
        }
    }
}
