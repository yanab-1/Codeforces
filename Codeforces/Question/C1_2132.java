
import java.util.ArrayList;
import java.util.Scanner;

public class C1_2132 {
    static ArrayList<Long> cost = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        precompute();
        while (t-- > 0) solve(sc);
    }

    private static void precompute() {
        long c = 3;
        long cnt = 1;
        for (int i = 0; i < 21; ++i) {
            cost.add(c);
            c = 3 * c + cnt;
            cnt *= 3;
        }
    }

    private static void solve(Scanner sc) {
        long n = sc.nextLong();
        long min_cost = 0;
        int sz = 0;

        while (n > 0) {
            long rem = n % 3;
            min_cost += rem * cost.get(sz);
            n /= 3;
            sz++;
        }
        System.out.println(min_cost);
    }
}
