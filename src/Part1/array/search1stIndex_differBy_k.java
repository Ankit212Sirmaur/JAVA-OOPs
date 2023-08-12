package Part1.array;

public class search1stIndex_differBy_k {
    public static void main(String[] args) {
        int[] arr = {70,60,70, 80, 90, 110, 130};
        int diff = 20;
        int ans = find1index(arr, 110,diff);
        System.out.println(ans);
    }
    public static int find1index(int[] arr, int target, int diff){
//        best method
        int start = 0;
        while (start < arr.length){
            if(arr[start] == target){
                return  start;
            }
            int jump = Math.abs(arr[start] - target) / diff;
            jump = Math.max(1, jump);
            start += jump;
        }
        return -1;
    }
}
