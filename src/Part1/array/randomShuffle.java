package Part1.array;
import java.util.*;
public class randomShuffle {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        for (int i = 0; i < arr.length; i++) {
            randomShuffle.suffle(arr);
        }
    }
    public static void suffle(int[] arr){
        Random randomobject = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomValue = randomobject.nextInt(arr.length);

            int current = arr[i];
            arr[i] = arr[randomValue];
            arr[randomValue] = current;
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + "-");
        }
        System.out.println();
    }
}
