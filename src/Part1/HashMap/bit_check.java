package Part1.HashMap;

public class bit_check {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(count(n));
    }
    public static int count(int n){
        int s = 0;
        for (int i = 1; i<= n; i++){
            while(i != 0){
                int webm = i & -i;
                i -= webm;
                s++;
            }
        }
        return s;
    }
}
