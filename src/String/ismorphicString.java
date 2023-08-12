package String;
import java.util.*;
public class ismorphicString {
    public static void main(String[] args) {
        String s1 = "eghg";
        String s2 = "addh";
        System.out.println(isIsomorphic(s1, s2));
    }
    public static boolean isIsomorphic(String s1, String s2){
        HashMap<Character, Character> hm1 = new HashMap<>();
        HashMap<Character, Boolean>  hm2 = new HashMap<>();

        if(s1.length() != s2.length()){
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(hm1.containsKey(ch1) == true){
                if(hm1.get(ch1) != ch2){
                    return false;
                }
            }else {
                if(hm1.containsKey(ch2) == true){
                    return false;
                }else {
                    hm2.put(ch1,true);
                    hm1.put(ch1,ch2);
                }
            }
        }
        return true;
    }
}
