import java.util.Scanner;

public class C_2184 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        long n = sc.nextLong();
        long k = sc.nextLong();
        if (k > n) {
            System.out.println(-1);
            return;
        }
        long x = n;
        int steps = 0;
        boolean possible = false;
        while (true) {
            if (k == x) { possible = true; break; }
            if (x == 1) { possible = false; break; }
            long left = x / 2;
            long right = x - left;
            if (k <= left) {
                x = left;
                steps++;
            } else if (k <= right) {
                x = right;
                steps++;
            } else {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? steps : -1);
    }
}
