package Part1.Sorting;
import java.util.*;
public class selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,9,8,1,2};
        sorting(arr);
        for(int val: arr){
            System.out.println(val);
        }
    }
    public static void sorting(int[] arr){
        for(int j = 0; j<arr.length -1; j++){
            int min = j;
            for(int i = j+1; i<arr.length; i++){
                if(arr[i] < arr[min]){
                    min = i;
                }
            }
            int temp = arr[min];
            arr[min] = arr[j];
            arr[j] = temp;
        }
    }
}
