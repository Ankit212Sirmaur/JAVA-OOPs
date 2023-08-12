package ArrayNQT;

public class count_distinct_element {
    public static void main(String[] args) {
        int[] arr = {5,10,15,5,4,5};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                count = count + 1;
            }
        }
        System.out.println("count " + count);

    }
}
