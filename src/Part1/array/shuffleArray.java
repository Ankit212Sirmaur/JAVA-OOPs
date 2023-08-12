package Part1.array;

public class shuffleArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = arr.length/2;
        int[] ans = suffle(arr, n);
//        System.out.println(ans);
        for (int val: ans){
            System.out.print(val + "-");
        }
    }
    public static int[] suffle(int[] arr, int n){
        int a = 0;
        int b = n;
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i=i+2) {

            ans[i] = arr[b++];
            ans[i+1] = arr[a++];
        }
        return ans;
    }
}
