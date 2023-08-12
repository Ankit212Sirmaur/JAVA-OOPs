package Part1.Sorting;
import java.util.*;
public class merge_Sort {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 4, 1, 3, 5};
        int li = 0;
        int ri = arr.length-1;
        sorting(arr, li, ri);
        for(int val: arr){
            System.out.print(val+ " ");
        }
//        System.out.println(" count " + count);

    }
    public static void sorting(int[] arr, int li , int ri){
        if (li < ri) {
            int mid = (li+ ri) / 2;
            sorting(arr, li, mid);
            sorting(arr,mid+1, ri);
            merge_both_array(arr, li, mid, ri);
        }
    }
    public static void merge_both_array(int[] arr1,int li, int mid, int ri){
        int[] ans = new int[arr1.length];
        int i = li;
        int j = mid+1;
        int k = li;
        while(i<=mid && j<=ri){
            if(arr1[i] <arr1[j]){
                ans[k++] = arr1[i++];
            }else {
                ans[k++] = arr1[j++];
//                count = count + mid - li;
            }
        }
        if(i>mid){
            while(j<=ri){
                ans[k++] = arr1[j++];
            }
        }else {
            while(i<=mid){
                ans[k++] = arr1[i++];
            }
        }
        for(k = li; k<=ri; k++){
            arr1[k] = ans[k];
        }
    }
}
