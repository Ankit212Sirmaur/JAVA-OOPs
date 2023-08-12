package ArrayNQT;

public class count_frequency_each_element {
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        countFre(arr,6);
    }
    private static void countFre(int[] arr, int n){

//        to not traverse again the again element
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i])
                continue;
            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}
