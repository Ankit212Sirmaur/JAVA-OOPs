package ArrayNQT;

public class By_K_element {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int n = arr.length;
        rotateArray(arr,k, n);
        for (int val: arr){
            System.out.print(val+" ");
        }
    }
    public static void rotateArray(int[] arr,int k, int n){
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }
    public static void reverse(int[] arr, int s, int e){
        while(s<=e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
