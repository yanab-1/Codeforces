import java.util.Arrays;
import java.util.Scanner;

public class C_2226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
        }
        int[] freq = new int[max + 1];
        for (int i : a){
            freq[i]++;
        }
        int l = 0; 
        int r = Math.min(n, max + 1);
        int ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPos(mid, freq, max)) {
                ans = mid;
                l = mid + 1;
            }
            else r = mid - 1;
        }
        System.out.println(ans);
    }
    private static boolean isPos(int k, int[] freq, int max) {
        if (k == 0) return true;
        int[] cnt = Arrays.copyOf(freq, max + 1);
        int[] par = new int[max + 2];
        for (int i = 0; i <= max + 1; i++) par[i] = i;
        for (int i = 0; i <= max; i++) {
            if (cnt[i] == 0) {
                par[i] = i + 1;
            }
        }
        for (int i = k - 1; i >= 0; i--) {
            if (i <= max && cnt[i] > 0) {
                cnt[i]--;
                if (cnt[i] == 0) {
                    par[i] = find(par, i + 1);
                }
            } else {
                long x = 2L * i + 1L;
                if (x > max) return false;
                int v = find(par, (int) x);
                if (v > max) return false;
                cnt[v]--;
                if (cnt[v] == 0) {
                    par[v] = find(par, v + 1);
                }
            }
        }
        return true;
    }
    public static int find(int[] par, int i) {
        if (par[i] == i) return i;
        return par[i] = find(par, par[i]);
    }
}
