package Part1.Revision.Recursion;

public class first_Occurrence_element {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,8,6,8};
        int ans = function_position(arr,0, 8);
        System.out.print(ans + "-");
    }
    public static int function_position(int[] arr, int idx, int key){
        if(idx == arr.length ){
            return -1;
        }
        if(arr[idx] == key){
            return  idx;
        } else {
            int firstIndex = function_position(arr, idx + 1, key);
            return firstIndex;
        }
    }
}
