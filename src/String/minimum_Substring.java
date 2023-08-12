package String;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
public class minimum_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
//        System.out.println(find_substring("ans" +  s1, s2));
        String ans = find_substring(s1, s2);
        System.out.println(ans + "ans");

    }
    public static String find_substring(String s1, String s2){
        String ans = "";
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map2.put(ch, map2.getOrDefault(ch,0) + 1);
        }

        int dmct = s1.length();
        int mct = 0;
//      for second string travel and to store
        HashMap<Character, Integer> map1 = new HashMap<>();
        int i = -1;
        int j = -1;
        while (true){
            boolean f1 =false;
            boolean f2 =false;
//            acquire
            while (i < s2.length() - 1 && mct < dmct){
                i++;
                char ch = s2.charAt(i);
                map1.put(ch, map2.getOrDefault(ch, 0) +1);

                if(map1.getOrDefault(ch,0) <= map2.getOrDefault(ch,0)){
                    mct++;
                }
                f1 = true;
            }
//             collect answer
            while(j < i && mct == dmct){
                String proAns = s2.substring(j+1 , i+ 1);
                if(ans.length() == 0 || proAns.length() < ans.length()){
                    ans = proAns;
                }
//                 now release
                j++;
                char ch = s2.charAt(j);
                if(map1.get(ch) == 1){
                    map1.remove(ch);
                }else {
                    map1.put(ch, map1.get(ch) -1);
                }
                if(map1.getOrDefault(ch,0) < map2.getOrDefault(ch ,0) ){
                    mct--;
                }
                f2 = true;
            }
            if(!f1 && !f2){
                break;
            }
        }
        return ans;

    }
}
