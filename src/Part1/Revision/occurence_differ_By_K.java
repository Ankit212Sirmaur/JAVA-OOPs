package Part1.Revision;
import java.util.*;
public class occurence_differ_By_K {
    public static void main(String[] args) {
        int[] val = {70,60,70,80,90,110,130};
        int k = 20;
        int key = 110;
        int ans = search(val, k, key);
        System.out.println(ans);
    }
    public static int search(int[] arr, int k ,int key){
        int start = 0;
        while(start<arr.length-1){
            if(arr[start] == key){
                return start;
            }
            int diff = Math.abs(arr[start] - key) / k;
            diff = Math.max(diff, 1);
            start = start + diff;
        }
        return -1;
    }
}
