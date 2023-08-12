package Part1.HashMap;
import java.util.*;
public class using_Array_count_Distinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1,1,2,2,2,3,5};
        int flag = 0;
        for (int i = 1; i < arr1.length; i++) {
            for(int j = 0; j< i; j++){
                if(arr1[i] == arr1[j]){
                    break;
                }
                if(i == j){
                    flag++;
                }
            }
            System.out.println(flag);
        }
    }
}
