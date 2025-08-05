import java.util.*;

public class D_2104 {
    static final int MAX = 6_000_000;
    static ArrayList<Integer> primes;

    private static void initPrimes() {
        primes = new ArrayList<>();
        boolean[] isPrime = new boolean[MAX];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i < MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i < MAX; i++) {
            if (isPrime[i]) primes.add(i);
        }
    }
    public static void main(String[] args) {
        initPrimes();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        reverse(a);

        long suma = 0, sump = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            suma += a[i];
            sump += primes.get(i);
            if (suma >= sump) ans = i + 1;
        }
        System.out.println(n - ans);
    }

    private static void reverse(int[] a) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            int tmp = a[l];
            a[l] = a[r];
            a[r] = tmp;
            l++; r--;
        }
    }
}
