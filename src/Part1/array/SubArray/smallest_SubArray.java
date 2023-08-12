package Part1.array.SubArray;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.HashMap;

public class smallest_SubArray {
    public static void main(String[] args) {
        int[] arr = {3,2,5,5,3,2,10};
        int ans = findfirstIndex_lastIndex(arr,10);
        System.out.println(ans);

    }
    public static int findfirstIndex_lastIndex(int[] arr, int sum){
//        int start = 0;
//        int end = 0;
//        int windowSum = 0;
//        int smallestLength = Integer.MAX_VALUE;
//
//        while(end < arr.length){
//            windowSum += arr[end];
//            if(windowSum == sum){
//                System.out.println("firstIndex is " + start + "lastIndexis " + end);
//                smallestLength = Math.min(smallestLength, end-start+1);
//            }
//            while(windowSum > sum){
//                windowSum -= arr[start];
//                if(windowSum == sum){
//                    System.out.println("firstIndex is " + start + "lastIndexis " + end);
//                    smallestLength = Math.min(smallestLength, end-start +1);
//                }
//            }
//            end++;
//        }
//        return smallestLength != Integer.MAX_VALUE ? smallestLength : -1;
        int end = 0;
        int i = 0;
        int totalsum = 0;
        int smallestLength = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(end <arr.length){
            totalsum += arr[end];

            if(totalsum == sum){
                System.out.println("start index " + 0 + "end index " + end);
                smallestLength = Math.min(smallestLength, end+1);
            }
            int windowSize = totalsum - sum;
            if(map.containsKey(windowSize)){
                int start = map.get(windowSize);
                System.out.println("start index " + (start + 1) + "end index "+ end);
                smallestLength = Math.min(smallestLength, end-start);
            }
            map.put(totalsum, end++);
        }
        return smallestLength != Integer.MAX_VALUE ? smallestLength : -1;
    }
}
