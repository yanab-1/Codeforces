import java.util.Scanner;

public class C_2169 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] pref = new long[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextLong();
        pref[0] = a[0];
        for(int i = 1; i < n; i++) pref[i] = pref[i - 1] + a[i];
        long maxGain = 0;
        long maxL = 0;
        for(int i = 0; i < n; i++){
            long prefBefore = (i == 0 ? 0 : pref[i - 1]);
            maxL = Math.max(maxL, -(long)(i + 1) * (i + 1) + (i + 1) + prefBefore);
            maxGain = Math.max(maxGain, (long) (i + 1) * (i + 1) + (i + 1) - pref[i] + maxL);
        }
        long ans = pref[n - 1] + maxGain;
        System.out.println(ans);
    }
}
