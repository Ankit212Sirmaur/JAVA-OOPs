package Part1.array;
import java.util.*;
public class merge_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,2,5,6,1};
        sorting(arr, 0, arr.length-1);
        for(int val: arr){
            System.out.print(val + " -");
        }
    }
    public static void  sorting(int[] arr, int l, int e){
        if(l<e){
            int mid = (l +e) /2;
            sorting(arr, l, mid);
            sorting(arr, mid+1, e);
            merge(arr, l, mid, e);
        }
    }
    public static void merge(int[] arr, int l, int mid, int e){
        int[] ans = new int [arr.length];
        int i = l;
        int j = mid+1;
        int k = l;
        while(i <= mid && j <=e){
            if(arr[i] < arr[j]){
                ans[k++] = arr[i++];
            }else {
                ans[k++] = arr[j++];
            }
        }
        if(i<=mid){
            ans[k++] = arr[i++];
        }
        if(j<= e){
            ans[k++] = arr[j++];
        }
       for(k = l; k<=e; k++){
           arr[k] = ans[k];
       }
    }
}
