package Part1.array;

public class firstOccurrenceValue {
    public static void main(String[] args) {
        int[] arr = {2,3,2,4,5,6,7};
        int value = 6;
        int ans = disposition_first_occurrence(arr, value);
        System.out.println(ans);

    }
//    if adjacent array value are differ by 1
    public static int disposition_first_occurrence(int[] arr, int key){
        int start = 0;
        int n = arr.length-1;
        while(start < n){
            if(arr[start] == key)
                return start;
            int diff = Math.abs(arr[start] - key);
            start += diff;
        }
        return  -1;
    }
}
