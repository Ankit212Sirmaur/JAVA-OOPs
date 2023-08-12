package Part1.HashMap;

public class remove_and_reverse {
    public static void main(String[] args) {
        String str = "aabbbcdd";
        remove_duplicate(str);
        reverse(str);
    }
    public static void reverse(String s){
        int i = 0;
        int j = s.length();
        while(i<=j){
            int temp = s.charAt(i);
//            s.charAt(i) = s.charAt(j);
        }
    }
    public static void remove_duplicate(String str){
        char[] ch = str.toCharArray();
        int s = 0;
        for (int i = 1; i<ch.length; i++){
            if(ch[i] != ch[s]){
                ch[s+1] = ch[i];
                s++;
            }
        }
    }
}
