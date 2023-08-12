package ArrayNQT;

import java.util.Scanner;

public class smallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter the array elements");

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
//        int a = Integer.MAX_VALUE
        int ans = findSolution(arr);
        System.out.println(ans);
    }
    private static int findSolution(int[] arr){
        int smallNum = arr[0];

        for (int i = 1; i< arr.length; i++){
            if(smallNum > arr[i]){
                smallNum = arr[i];
            }
        }
        return smallNum;
    }
}
