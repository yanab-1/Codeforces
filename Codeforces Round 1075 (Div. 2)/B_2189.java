import java.util.Scanner;

public class B_2189 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long x = sc.nextLong();
        long r = 0;
        long g = Long.MIN_VALUE / 2;
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            r += (b - 1) * a;
            long profit = a * b - c;
            g = Math.max(g, profit);
        }
        if (r >= x) {
            System.out.println(0);
            return;
        }

        if (g <= 0) {
            System.out.println(-1);
            return;
        }

        long rem = x - r;
        long res = (rem + g - 1) / g;
        System.out.println(res);
    }
}
