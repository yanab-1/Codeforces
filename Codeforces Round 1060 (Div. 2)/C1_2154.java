import java.util.*;

public class C1_2154 {
    static final int MAX_A = 200001;
    static int[] prime = new int[MAX_A + 1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sieve();
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) sc.nextInt(); 
        boolean[] has = new boolean[MAX_A + 1];
        boolean zero = false;
        for (int val : a) {
            Set<Integer> f = getFact(val);
            for (int p : f) {
                if (has[p]) {
                    zero = true;
                    break;
                }
                has[p] = true;
            }
            if (zero) break;
        }
        if (zero) {
            System.out.println(0);
            return;
        }
        boolean costOne = false;
        for (int val : a) {
            Set<Integer> f = getFact(val + 1);
            for (int p : f) {
                if (has[p]) {
                    costOne = true;
                    break;
                }
            }
            if (costOne) break;
        }

        if (costOne) {
            System.out.println(1);
            return;
        }
        System.out.println(2);
    }

    private static void sieve() {
        for (int i = 2; i <= MAX_A; i++) prime[i] = i;
        for (int i = 2; i * i <= MAX_A; i++) {
            if (prime[i] == i) {
                for (int j = i * i; j <= MAX_A; j += i) {
                    if (prime[j] == j) prime[j] = i;
                }
            }
        }
    }

    private static Set<Integer> getFact(int n) {
        Set<Integer> f = new HashSet<>();
        while (n > 1) {
            f.add(prime[n]);
            n /= prime[n];
        }
        return f;
    }
}
