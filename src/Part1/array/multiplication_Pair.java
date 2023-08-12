package Part1.array;
import java.util.*;
public class multiplication_Pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4,1,3,10,7,5,8};
        boolean ans = finding_pair(arr, 15);
        System.out.println(ans + "-");

    }
    public static boolean finding_pair(int[] arr, int target){
        HashSet<Integer> hs = new HashSet<>();

        for (int j : arr) {
            hs.add(j);
            if (target % j == 0 && hs.contains(target / j)) {
                return true;
            }
        }
        return false;
    }
}
