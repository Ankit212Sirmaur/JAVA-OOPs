package Part1.array;
import java.util.*;
public class sorting {
    public static void main(String[] args) {
        int[] arr = {3,6,7,2,1,9};

//        bubble sort
//        for(int i=1; i<arr.length-1; i++){
//            for(int j = 0; j< arr.length-i; j++){
//               if(arr[j] > arr[j+1]){
//                   int temp = arr[j];
//                   arr[j] = arr[j+1];
//                   arr[j+1] = temp;
//                }
//            }
//        }

//        selection sort
//        for(int i=0; i<arr.length-1; i++){
//            int min = i;
//            for(int j = i+1; j< arr.length; j++){
//                if(arr[j] < arr[min]){
//                    min = j;
//                }
//            }
//            int temp = arr[min];
//            arr[min] = arr[i];
//            arr[i] = temp;
//        }

//        insertion sort
//       for(int i = 1; i<arr.length; i++){
//           for(int j = i-1; j>= 0; j--){
//               if(arr[j+1] < arr[j]){
//                   int temp = arr[j];
//                   arr[j] = arr[j+1];
//                   arr[j+1] = temp;
//               }else {
//                   break;
//               }
//           }
//       }

        for(int val: arr){
            System.out.print(val + " - ");
        }
    }
}
