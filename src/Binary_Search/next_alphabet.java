package Binary_Search;
import java.util.*;
public class next_alphabet {
    public static void main(String[] args) {
        char[] ss = {'a', 'b', 'c', 'g'};
        char ch = 'c';
        char s = search(ss, ch);
        System.out.println(s);

    }
//    mixed questions of ceiling of number and this questions

    public static char search(char[] ss , char ch){
        int i = 0;
        int j = ss.length - 1;
        int ans = -1;
        while(i <= j){
            int mid = (i+j) /2;
            if(ss[mid] == ch){
                i = mid + 1;
            }else if(ss[mid] > ch){
                ans = mid;
                j = mid - 1;
            } else if(ss[mid] < ch){
                i = mid + 1;
            }
        }
        return ss[ans];
    }
}
