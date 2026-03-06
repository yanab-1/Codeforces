import java.util.Arrays;
import java.util.Scanner;

public class B1_2190 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }
    static String s;
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        s = sc.next();
        int[] next = new int[n];
        int[] suf = new int[n];
        Arrays.fill(next, n);
        for(int i = n - 2; i >= 0; i--){
            if(s.charAt(i) == '('){
                next[i] = i;
                suf[i]++;
            }
            else{
                next[i] = next[i + 1];
            }
            suf[i] += suf[i + 1];
        }
        int ans = -1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == ')' && next[i] < n){
                int gap = next[i] - i;
                if(suf[next[i] + 1] >= gap){
                    ans = Math.max(ans, n - 2 * gap);
                }
            }
        }
        System.out.println(ans);
    }

}
