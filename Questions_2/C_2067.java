import java.util.Scanner;

public class C_2067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        for (int l = 0; l <= 9; l++) {
            String s = String.valueOf(n - l);
            int md = 0;

            for (char c : s.toCharArray()) {
                if (c <= '7') {
                    md = Math.max(md, c - '0');
                }
            }

            if (l >= 7 - md) {
                System.out.println(l);
                return;
            }
        }
    }
}
