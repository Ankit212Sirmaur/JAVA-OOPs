package Part1.Revision;
import java.util.*;
public class first_occurence {
    public static void main(String[] args) {
        int[] arr = {7,6,7,6,7,6,5,4,5,4,3,2,1,2,3};
        int val = 2;
        int index = search(arr,val);
        System.out.println(index + "-");
    }
    public static int search(int[] arr, int key){
        int start = 0;
        while(start<arr.length-1){
            if(arr[start] == key){
                return start;
            }
            int diff = arr[start] - key;
            start = start + diff;
        }
        return -1;
    }
}
