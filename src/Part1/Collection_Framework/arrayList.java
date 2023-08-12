package Part1.Collection_Framework;
import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ankit");
        list.add("kumar");
        list.add("singh");
        list.add(2,"raj-put");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
//        list.addAll(list2);
//        list.remove(1);
//        list.remove(String.valueOf("ankit"));
//        System.out.println(list);
//        System.out.println(list.get(1));
//        list2.set(1, 5);
//        System.out.println(list2);
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
