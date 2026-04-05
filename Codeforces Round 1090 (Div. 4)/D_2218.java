import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class D_2218 {
    static List<Integer> ll;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ll = sieve(200000);
        int t = sc.nextInt();
        while(t--> 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] ans = new long[n];
        for(int i = 0; i < n; i++){
            ans[i] = (long) ll.get(i) * ll.get(i + 1);
        }
        for(long i : ans){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static List<Integer> sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) primes.add(i);
        }
        return primes;
    }
}
