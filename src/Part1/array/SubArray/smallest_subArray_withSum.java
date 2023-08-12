package Part1.array.SubArray;
import java.util.*;
public class smallest_subArray_withSum {
    public static void main(String[] args) {
        int [] arr = {3,2,5,5,3,2,10};
        int sum = 10;
        int asn = searchIndex(arr, sum);
        System.out.println(asn);
    }
    public static int searchIndex(int[] arr, int sum){
        int end = 0;
        int totalsum = 0;
        int smallestLength = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(end <arr.length){
            totalsum += arr[end];

            if(totalsum == sum){
//                System.out.println("start index " + 0 + "end index " + end);
                smallestLength = Math.min(smallestLength, end+1);
            }
            int windowSize = totalsum - sum;
            if(map.containsKey(windowSize)){
                int start = map.get(windowSize);
//                System.out.println("start index " + (start + 1) + "end index "+ end);
                smallestLength = Math.min(smallestLength, end-start);
            }
            map.put(totalsum, end++);
        }
        return smallestLength != Integer.MAX_VALUE ? smallestLength : -1;
    }
}
