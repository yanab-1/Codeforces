import java.util.Scanner;

public class A_608 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int s = sc.nextInt();
        int ans = s;
        for(int i = 0; i < n; i++) {
            int f = sc.nextInt();
            int t = sc.nextInt();
            ans = Math.max(ans, f+t);
        }
        System.out.println(ans);
    }
}
