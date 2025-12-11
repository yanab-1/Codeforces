import java.util.Scanner;

public class A_2176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        for(int i = 1; i < n; i++){
            int a = sc.nextInt();
            if(a < m) ans++;
            else m = a;
        }
        System.out.println(ans);
    }
}
