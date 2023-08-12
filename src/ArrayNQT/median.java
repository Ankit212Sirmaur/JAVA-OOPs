package ArrayNQT;

import java.util.Arrays;

public class median {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 2, 5, 6};
        int n = 6;
        System.out.print("The median of the array is: ");
        getMedian(arr, n);
//        System.out.println(ans);

    }
    public static void getMedian(int[] arr, int n){
        Arrays.sort(arr);

        if(n % 2 == 0){
            int a = arr[n/2 -1];
            int b = arr[n/2];
            double sum = (double)(a + b) / 2;
            System.out.println(sum);
        }else {
            System.out.println(arr[n/2]);
        }
    }
}
