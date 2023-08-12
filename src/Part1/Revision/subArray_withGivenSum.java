package Part1.Revision;
import java.util.*;
public class subArray_withGivenSum {
    public static void main(String[] args) {
        int [] arr = {4,2,-5,3,1,8};
        findIndex(arr, -1);
    }
    public static void findIndex(int[] arr, int sum){
        HashMap<Integer,Integer> map = new HashMap<>();
        int end = 0;
        int currSum = 0;
        while(end < arr.length){
            currSum += arr[end];
            if(currSum == sum){
                System.out.println("first Index is " + 0 + "last Index is " + end);
            }
            int window = currSum - sum;
            if(map.containsKey(window)){
                int first = map.get(window);
                System.out.println("first index is " + (first + 1) + " last index is " + end);
                return;
            }
            map.put(currSum, end++);
        }
    }
}
