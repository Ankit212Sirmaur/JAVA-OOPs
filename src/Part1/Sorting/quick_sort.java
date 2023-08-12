package Part1.Sorting;

public class quick_sort {
    public static void main(String[] args) {
        int[] arr = {8,5,1,3,7,2,9,6};
//        partition(arr,0, arr.length-1);
        quicksort(arr, 0, arr.length-1);
        for(int val: arr){
            System.out.print(val+ " ");
        }
    }
    public static int partition(int[] arr, int s, int e){
        int pivot = arr[s];
        int i = s;
        int j = e;
        while (i<j){
            while (pivot >= arr[i]) i++;
            while (pivot < arr[j]) j--;
            if(i<j){
                int temp = arr[i];
                arr[i]  = arr[j];
                arr[j] = temp;
            }
        }
            int temp = arr[j];
            arr[j] = arr[s];
            arr[s] = temp;

        return j;
    }
    public static void quicksort(int[] arr, int s, int e){
        if(s<e){
            int pivot = partition(arr, s,e);
            quicksort(arr,s,pivot-1 );
            quicksort(arr, pivot+1, e);
        }
    }
}
