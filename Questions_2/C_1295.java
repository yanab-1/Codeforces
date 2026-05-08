import java.util.Arrays;
import java.util.Scanner;

public class C_1295 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    static int[][] dp;
    private static void solve(Scanner sc) {
        String s = sc.next();
        String t = sc.next();
        int n = s.length();
        int[][] next = new int[n + 1][26];
        for(int[] i : next){
            Arrays.fill(i, -1);
        }
        for(int i = n - 1; i >= 0; i--){
            next[i] = next[i + 1].clone();
            next[i][s.charAt(i) - 'a'] = i;
        }
        int ans = 0;
        int i = 0;
        while(i < t.length()){
            int j = i;
            int idx = 0;
            while(j < t.length() && next[idx][t.charAt(j) - 'a'] != -1){
                idx = next[idx][t.charAt(j) - 'a'] + 1;
                j++;
            }
            if(i == j){
                System.out.println(-1);
                return;
            }
            ans++;
            i = j;
        }
        System.out.println(ans);
    }
    
}
