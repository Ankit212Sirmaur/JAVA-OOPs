package String;
import java.util.*;
public class string_split {
    public static void main(String[] args) {
//        String s = "flower\",\"flow\",\"flight";
//        String[] parts = s.split("-");
        String title = "capiTalIze tHe titLe";

        String ans = captial_letter(title);
        System.out.println(ans);
    }
    public static String captial_letter(String title){
   StringBuilder res=new StringBuilder();
        title = title.toLowerCase();
        String[] arr = title.split("\\s+");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>2)
            arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1,arr[i].length());
            else arr[i] = arr[i].toLowerCase();
            res.append(arr[i]+" ");
        }
        return res.toString().trim();
    }
}
