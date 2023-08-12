package Part1.Sorting;
import java.util.*;
public class bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,9,8,1,2};
        sorting(arr);
        for(int val: arr){
            System.out.print(val + " ");

        }
    }
    public static void sorting(int[] arr){
        for(int itr= 1; itr<=arr.length -1; itr++){
            for (int j = 0; j <arr.length-itr ; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
