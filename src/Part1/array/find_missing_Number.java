package Part1.array;
import java.util.*;
public class find_missing_Number {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,6,7,8};
        int ans = search_num(arr,arr.length+1);
        System.out.println("missing num " + ans);
    }
    public static int search_num(int[] arr, int n){
        int sum = (n*(n+1))/2;
        int arrsum = 0;
        for (int j : arr) {
            arrsum += j;
        }
        return sum - arrsum;
    }
}
