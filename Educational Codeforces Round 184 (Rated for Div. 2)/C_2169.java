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
        long[] a = new long[n + 1];
        long[] pref = new long[n + 1];
        for(int i = 1; i <= n; i++) a[i] = sc.nextLong();
        for(int i = 1; i <= n; i++) pref[i] = pref[i - 1] + a[i];
        long bestG = 0;
        long bestGain = Long.MIN_VALUE;
        for(int i = 1; i <= n; i++){
            long Fr = 1L * i * i + i - pref[i];
            long gain = Fr + bestG;
            if(gain > bestGain) bestGain = gain;
            long Gj = pref[i] - 1L * i * i - i;
            if(Gj > bestG) bestG = Gj;
        }
        long ans = pref[n] + (bestGain > 0 ? bestGain : 0);
        System.out.println(ans);

    }
}
