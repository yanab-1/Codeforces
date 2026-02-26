import java.util.Arrays;
import java.util.Scanner;

public class C_2045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int[] st = new int[26];
        Arrays.fill(st, -1);;
        int[] end = new int[26];
        Arrays.fill(end,-1);
        for(int i = 1; i < s.length(); i++){
            if(st[s.charAt(i) - 'a'] == -1)
            st[s.charAt(i) - 'a'] = i;
        }
        for(int i = t.length() - 2; i >= 0; i--){
            if(end[t.charAt(i) - 'a'] == -1)
            end[t.charAt(i) - 'a'] = i;
        }
        String ans = "";
        for(int i = 0; i < 26; i++){
            if(st[i] == -1 || end[i] == -1) continue;
            String res = s.substring(0, st[i]) + t.substring(end[i]);
            if(ans.isEmpty() || res.length() < ans.length()){
                ans = res;
            }
        }
        if(ans.isEmpty()) System.out.println(-1);
        else System.out.println(ans);
    }
}
