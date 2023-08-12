package Part1.array.SubArray;
import java.util.*;
public class maximum_length_with_givenSum {
    public static void main(String[] args) {
//        int [] arr = {-13 ,0 ,6 ,15 ,16 ,2 ,15 ,-12 ,17 ,-16 ,0 ,-3 ,19 ,-3 ,2 ,-9 ,-6};
        int[] arr = {10, 5, 2, 7, 1, 9};
        int ans = lenOfLongSubarr(arr, 15);
        System.out.println(ans);
    }
    public static int lenOfLongSubarr(int[] A, int k ){
        HashMap<Integer,Integer> h=new HashMap<>();
        int len=0;
        int cusum=0;
        int max=0;
        for(int i=0;i<A.length;i++){
            cusum+=A[i];
            int windowSize = cusum -k;
            if(cusum == windowSize)
            {
                max=i+1;
            }
            if(!h.containsKey(cusum)){
                h.put(cusum,i);
            }
            if(h.containsKey(windowSize)){
                len=i-h.get(windowSize);
                max=Math.max(len,max);
            }
        }
        return max;
    }
}
