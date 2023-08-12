package Part1.HashMap;
import java.util.*;
public class count_pair {
    public static void main(String[] args) {
        int[] arr = {1,5,7,1};
        int ans = function_count(arr, 6);
        System.out.println(ans);
    }
    public static int function_count(int[] arr, int sum){
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            int diff = sum - j;
            if(map.containsKey(diff)){

            }
        }
        return count;
    }
}
