import java.util.Scanner;

public class B_2178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }

    private static void solve(Scanner sc) {
        String r = sc.next();
        char[] c = r.toCharArray();
        int n = r.length();
        int ans = 0;
        if(c[0] == 'u'){
            ans++;
            c[0] = 's';
        }
        if(c[n - 1] == 'u'){
            ans++;
            c[n - 1] = 's';
        }
        for(int i = 1, j = 0; i < n; i++){
            if(c[i] == 's'){
                ans += (i - j - 1) / 2;
                j = i;
            }
        }
        System.out.println(ans);
    }
}
