package Part1.array.SubArray;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class maximumElement_SubarryOfK {
    public static void main(String[] args) {
        int[] arr = {2,5,4,3,1,7};
        getMaximumofSubarray(arr, 3);
    }
    public static void getMaximumofSubarray(int[] arr, int k){
        Deque<Integer> qu = new ArrayDeque<>();
        int i = 0;
        for(i = 0; i<k; i++){
            while (!qu.isEmpty() && arr[i]>= arr[qu.peekLast()]){
//                qu.removeLast();
                qu.pollLast();
            }
//            qu.add(i);
            qu.offerLast(i);
        }
        for(; i<arr.length; i++){
            System.out.print(arr[qu.peekFirst()] + "-");
            while (!qu.isEmpty() && i-k>= qu.peek()){
                qu.removeFirst();
            }
            while (!qu.isEmpty() && arr[i]>= arr[qu.peekLast()]){
                qu.pollLast();
            }
            qu.add(i);
        }
        System.out.println(arr[qu.peek()]);
    }
}
