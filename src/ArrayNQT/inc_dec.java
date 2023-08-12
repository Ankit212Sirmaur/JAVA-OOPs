package ArrayNQT;

import java.util.Arrays;

public class inc_dec {
    public static void main(String[] args) {
        int[] arr = {8, 7, 1, 6, 5, 9};
//        1 5 6 9 8 7
        int n = 6;
        Arrays.sort(arr);
        for (int i = 0; i < n / 2; i++) {
            System.out.print(arr[i] + "-");
        }

        for (int i = n - 1; i >= n / 2; i--) {
            System.out.print(arr[i] + "-");
        }
    }
}
