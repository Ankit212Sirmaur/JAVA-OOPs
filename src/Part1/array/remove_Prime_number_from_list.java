package Part1.array;
import java.util.*;
public class remove_Prime_number_from_list {
    public static void main(String[] args) {
//        list.add(10);
//        System.out.println(list.size() + " size");
//
//        int e1 = list.get(0);
//        System.out.println(e1);
//
//        list.add(1, 20);
//        System.out.println(list.size() + " size");
//
//        System.out.println(list);
//        list.set(0, 30);
//        System.out.println(list);
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(14);
        list.add(9);
        list.add(17);
        list.add(8);
        list.add(6);
        list.add(42);
//        System.out.println(list.size());

//        for(int i = list.size() - 1; i>= 0; i--){
//            if(list.get(i) % 2 == 0){
//                list.remove(i);
//            }
//        }
        for (int i = list.size()-1; i >=0 ; i--) {
            int val = list.get(i);
            if(isPrime(val)){
                list.remove(i);
            }
        }
        for (int val : list){
            System.out.println(val);
        }
    }
    public static boolean isPrime(int val){
        for (int div = 2; div * div <= val; div++){
            if(val % div == 0){
                return false;
            }
        }
        return true;
    }
}
