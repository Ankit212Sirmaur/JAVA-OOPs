package String;

import java.util.*;
/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */
public class roman_Integer {
    public static void main(String[] args) {
        String sc = "LVIII";
        char ch[] = sc.toCharArray();
       HashMap<String, Integer> map1 = new HashMap<String, Integer>(){
           {
               put("I", 1);
               put("V", 5);
               put("X", 10);
               put("L", 50);
               put("C", 100);
               put("D", 500);
               put("M", 1000);
           }
       };
       int value = 0;
        for (int i = 0; i < ch.length; i++) {
//            int curr = map1[ch[i]];
        }
    }
}
