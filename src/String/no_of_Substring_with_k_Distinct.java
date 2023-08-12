package String;
import java.util.*;
public class no_of_Substring_with_k_Distinct {
    public static void main(String[] args) {
        String s = "aba";
        long ans = substCount(s, 2);
        System.out.println(ans + "ans");

    }

    public static long substCount(String S, int K) {
        // your code here
        HashMap<Character, Integer> map = new HashMap<>();
        int i = -1;
        int j = -1;
        long ans = 0;
        while (true) {
            while (i < S.length() - 1) {
                i++;
                char ch = S.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                if (map.size() <= K) {
                    ans += i - j;
                } else {
                    break;
                }
            }
            if (i == S.length()-1 && map.size() <= K) {
                break;
            }
            while (j < i) {
                j++;
                char ch = S.charAt(j);
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
                if (map.size() > K) {
                    continue;
                } else {
                    ans += i - j;
                    break;
                }
            }
        }
        return ans;
    }
}
