package Part1.Revision;
import java.util.*;
public class minimumLengthOfsubArray_withGivenSum {
    public static void main(String[] args) {
        int [] arr = {3,2,-5,5,-3,2,10};
        int ans = findsmallest_array_ofSum(arr, -3);
        System.out.println(ans);
    }
    public static int findsmallest_array_ofSum(int[] arr, int sum){
        HashMap<Integer, Integer> map = new HashMap<>();
        int end = 0;
        int currsum = 0;
        int smallestLength = Integer.MAX_VALUE;

        while(end < arr.length){
            currsum += arr[end];

            if(currsum == sum){
                return Math.min(smallestLength, end + 1);
            }
            int window = currsum -sum;
            if(map.containsKey(window)){
                int start = map.get(window);
                smallestLength = Math.min(smallestLength, end-start);
            }
            map.put(currsum , end++);
        }
        return smallestLength != Integer.MAX_VALUE ? smallestLength : 0;
    }
}
