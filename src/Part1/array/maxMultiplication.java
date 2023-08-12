package Part1.array;

public class maxMultiplication {
    public static void main(String[] args) {
        int[] arr = {5,1,2,7,3};
//        int[] arr = {-4,7,-1,18,2,5};
        int max = 0;
//        int currmultpy = 0;
//        for(int i = 0; i<arr.length-1; i++){
//            for(int j = i+1; j<arr.length; j++){
//             currmultpy = arr[i] * arr[j];
//             if(currmultpy > max){
//                 max = currmultpy;
//             }
//            }
//        }
//        more optimized solution is by sorting
//        Arrays.sort(arr);
//        max = arr[arr.length-1] * arr[arr.length-2];
//        System.out.println(max);
        int asn = multiplication(arr);
        System.out.println(asn);

    }
    public static int multiplication(int[] arr){
        if(arr.length == 1){
            return -1;
        }
        if(arr.length == 2){
            return arr[0] * arr[1];
        }
        int smallest = Math.min(arr[0], arr[1]);
        int secondSmallest = Math.max(arr[0], arr[1]);
        int maximum = Math.max(arr[0], arr[1]);
        int secondMaximum = Math.min(arr[0], arr[1]);
        for(int i = 2; i<arr.length; i++){
            if(arr[i] < smallest) {
                secondSmallest  = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }
            if(arr[i] > maximum){
                secondMaximum = maximum;
                maximum = arr[i];
            } else if( arr[i] > secondMaximum  ){
                secondMaximum  = arr[i];
            }
        }
        int first = smallest * secondSmallest;
        int second = maximum * secondMaximum;

        return Math.max(first, second);
    }

}
