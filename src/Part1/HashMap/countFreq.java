package Part1.HashMap;
import java.util.*;
public class countFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        HashMap<Character , Integer> hm = new HashMap<>();
//        yh wala operations hashmap me dalane ke liye
        for(int i= 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(hm.containsKey(ch)){
                int of = hm.get(ch);
                int nf = of + 1;
                hm.put(ch,nf);
            }else {
                hm.put(ch,1);
            }
        }
//        max(a,b);
//        for loop lagne ke liye --> keyset();
        char mfc = str.charAt(0);
        for(Character key: hm.keySet()){
            if(hm.get(key) > hm.get(mfc)){
                mfc = key;
            }
        }
        System.out.println(mfc);
    }
}
