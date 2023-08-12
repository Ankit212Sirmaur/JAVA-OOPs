package ArrayNQT;

public class avg_num {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,5,1};
        double ans = sum(arr);
        System.out.println(ans);
    }
    public static double sum(int[] arr){
        double sum = 0;
        for (int val: arr){
            sum += (double)val;
        }
        double avg = sum / arr.length;
        return avg;
    }
}
