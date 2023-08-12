package String;
import java.util.*;
public class print_all_palindromic_substring {
    public static void main(String[] args) {
        String str = "abccbc";
        for(int i = 0; i<str.length()-1; i++){
            for(int j = i+1; j<str.length(); j++){
                String s = str.substring(i,j);
                if(isPalindromic(s)){
                    System.out.println(s);
                }
            }
        }
    }
    public static boolean isPalindromic(String ss){
        int lo = 0;
        int hi = ss.length()-1;
        while(lo <= hi){
            char ch1 = ss.charAt(lo);
            char ch2 = ss.charAt(hi);
            if(ch1 != ch2){
                return false;
            }else {
                lo++;
                hi--;

            }
        }
        return true;
    }
}
