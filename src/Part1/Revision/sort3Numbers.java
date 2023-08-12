package Part1.Revision;
import java.util.*;
public class sort3Numbers {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,2,0,1,2,1,0};
        function(arr);
        for (int val: arr){
            System.out.print(val + "-");
        }
    }
    public static void function(int[] arr){
        int m = 0;
        int l = 0;
        int h = arr.length-1;
        while(m<=h){
            if(arr[m] == 1){
                m++;
            }else if (arr[m] == 0){
                int temp = arr[m];
                arr[m] = arr[l];
                arr[l] = temp;
                m++;
                l++;
            }else {
                int temp = arr[h];
                arr[h] = arr[m];
                arr[m] = temp;
                h--;
            }
        }
    }
}
