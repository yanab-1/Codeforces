import java.util.Scanner;

public class C_2140 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
       int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; ++i) a[i] = sc.nextLong();
        long S0 = 0;
        for (int i = 0; i < n; ++i) {
            S0 += (i % 2 == 0) ? a[i] : -a[i];
        }
        long bestGain = Long.MIN_VALUE;
        int firstEven = -1;
        int firstOdd = -1;
        long minEvenExpr = Long.MAX_VALUE;
        long maxOddExpr = Long.MIN_VALUE;
        for (int i = 0; i < n; ++i) {
            if (i % 2 == 0) {
                if (firstEven == -1) firstEven = i;
                else bestGain = Math.max(bestGain, (long) (i - firstEven));
            } else {
                if (firstOdd == -1) firstOdd = i;
                else bestGain = Math.max(bestGain, (long) (i - firstOdd));
            }
            if ((i % 2) == 1) {
                if (minEvenExpr != Long.MAX_VALUE) {
                    long cand = (i + 2L * a[i]) - minEvenExpr;
                    bestGain = Math.max(bestGain, cand);
                }
            }
            if ((i % 2) == 0) {
                if (maxOddExpr != Long.MIN_VALUE) {
                    long cand = maxOddExpr - (-i + 2L * a[i]);
                    bestGain = Math.max(bestGain, cand);
                }
            }
            if ((i % 2) == 0) {
                long val = i + 2L * a[i];
                if (val < minEvenExpr) minEvenExpr = val;
            } else {
                long val = -i + 2L * a[i];
                if (val > maxOddExpr) maxOddExpr = val;
            }
        }
        if (bestGain < 0) bestGain = 0; 
        long ans = S0 + bestGain;
        System.out.println(ans);
    }
}
