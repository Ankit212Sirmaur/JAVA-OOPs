package Part1.array.SubArray;
import java.util.*;
public class sub_Array_GivenSum {
    public static void main(String[] args) {
        int [] arr = {4,2,-5,3,1,8};
        searchIndex(arr,-1);
    }
    public static void searchIndex(int[] a, int sum){
        if(a.length == 0){
            System.out.println("array is empty");
            return;
        }
       HashMap<Integer, Integer> hm = new HashMap<>();
       int start = 0;
       int currentSum = 0;
       while(start < a.length){
           currentSum += a[start];
           if(currentSum == sum){
               System.out.println("start index is " + 0 + "end index " + start);
               return;
           }
           int windowSum = currentSum - sum;
           if(hm.containsKey(windowSum)){
               int first = hm.get(windowSum);
               System.out.println("start index is " + (first + 1 )+ "end index is " + start);
               return;
           }
           hm.put(currentSum, start++);
       }
    }
}
