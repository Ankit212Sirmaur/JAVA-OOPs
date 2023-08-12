package ArrayNQT;

public class remove_duplicate_usng_Pointer {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        Remove(arr);
    }
    public static void Remove(int[] arr){
        int i = 1;
        for (int j = 1; j<arr.length; i++){
            if(arr[j] != arr[j-1]){
                arr[i++] = arr[j];
            }
        }
        System.out.println(i);
    }
}
