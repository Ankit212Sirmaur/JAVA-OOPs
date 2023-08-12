package Part1.array;
import java.util.*;
public class find_point {
    public static void main(String[] args) {
        int[] arr = {1,6,7,0,7};
        int ans = equilibirum_point(arr);
        System.out.println(ans);

    }
    public static int equilibirum_point(int[] arr){
        int sum = 0;
        int nextSum = 0;
        for(int val: arr){
            sum+= val;
        }
        for(int i = 0; i<arr.length; i++){
            sum -= arr[i];
            if(sum == nextSum){
                return i;
            }
            nextSum += arr[i];
        }
        return -1;
    }
}
