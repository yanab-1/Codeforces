import java.util.*;

public class B_2176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();
        String t = s + s;
        int ans = 0;
        int res = 0;
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == '0'){
                ans++;
            }
            else{
                res = Math.max(res, ans);
                ans = 0;
            }
        }
        System.out.println(res);
    }
}
