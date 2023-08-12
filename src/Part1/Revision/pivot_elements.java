package Part1.Revision;
import java.util.*;
public class pivot_elements {
    public static void main(String[] args) {
        int[] arr = {1,6,7,0,7};
        int ans = find_equilibriumPoint(arr);
        System.out.println(ans);
    }
    public static int find_equilibriumPoint(int[] arr){
        int sum = 0;
        int currSum = 0;
        for (int k : arr) {
            sum += k;
        }
        for (int j : arr) {
            sum -= j;
            if (currSum == sum) {
                return j;
            }
            currSum += j;
        }
        return  -1;
    }
}
