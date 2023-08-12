package Part1.Revision;
import java.util.*;
public class merge_sort {
    static int count = 0;
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};
        cout_Inversion(arr, 0, arr.length-1);
        for (int val: arr){
            System.out.print(val + " ");
        }
    }
    public static void cout_Inversion(int[] arr, int li, int hi){
        if(li < hi){
            int mid = (li+ hi) /2;
            cout_Inversion(arr, li, mid);
            cout_Inversion(arr, mid + 1, hi);
            merge(arr, li, mid, hi);
        }
    }
    public static void merge(int[] arr, int li, int mid, int hi){
        int i = li;
        int j = mid+1;
        int k = li;
        int[] ans = new int[arr.length];

        while (i <=mid && j <=hi){
            if(arr[i] < arr[j] ){
                ans[k++] = arr[i++];
            }else {
                ans[k++] = arr[j++];
                count++;
            }
        }
        if(i > mid){
            while (j <=hi){
                ans[k++] = arr[j++];
            }
        }else{
            while (i <= mid){
                ans[k++] = arr[i++];
            }
        }
        for(k = li; k <=hi; i++){
            arr[k] = ans[k];
        }

    }
}
