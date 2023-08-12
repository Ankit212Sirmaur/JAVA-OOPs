package Part1.array.SubArray;
import java.util.*;
public class kadanes_Algo {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, -2, 5};
            int ans = maxSumsubAray(arr);
            System.out.println(ans);
        }

        public static int maxSumsubAray(int[] arr) {
            int maxsum = arr[0];
            int currsum = 0;
            for (int j : arr) {
                currsum += j;
                if (currsum > maxsum) {
                    maxsum = currsum;
                }
                if (currsum < 0) {
                    currsum = 0;
                }
            }
            return maxsum;
        }
    }
