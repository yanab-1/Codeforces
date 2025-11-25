import java.util.Scanner;

public class B_2152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int ra = sc.nextInt();
        int ca = sc.nextInt();
        int rb = sc.nextInt();
        int cb = sc.nextInt();

        int ans = 0;

        if (rb > ra)
            ans = Math.max(ans, rb);
        else if (rb < ra)
            ans = Math.max(ans, n - rb);

        if (cb > ca)
            ans = Math.max(ans, cb);
        else if (cb < ca)
            ans = Math.max(ans, n - cb);

        System.out.println(ans);
    }
}
