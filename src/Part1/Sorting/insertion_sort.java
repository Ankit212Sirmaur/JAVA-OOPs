package Part1.Sorting;
import java.util.*;
public class insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,9,8,1,3};
        sorting(arr);
        for(int val: arr){
            System.out.println(val + " ");
        }
    }
    public static void sorting(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >=0 ; j--) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }else {
                    break;
                }
            }
        }
    }
}
