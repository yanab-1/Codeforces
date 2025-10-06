import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class D_2145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long k = sc.nextLong();
        long t = 1L * n * (n - 1) / 2;
        if (k < 0 || k > t) {
            System.out.println("0");
            return;
        }
        int tP = (int) t;
        int R = (int) (t - k);
        int[][] PL = new int[n + 1][tP + 1];
        for (int i = 0; i <= n; i++) Arrays.fill(PL[i], -1);
        PL[0][0] = 0; 
        for (int pos = 0; pos <= n; pos++) {
            for (int s = 0; s <= tP; s++) {
                if (PL[pos][s] == -1) continue;
                if (pos == n) continue;
                int maxLen = n - pos;
                for (int len = 1; len <= maxLen; len++) {
                    int tri = len * (len - 1) / 2;
                    int ns = s + tri;
                    if (ns > tP) break;
                    if (PL[pos + len][ns] == -1) {
                        PL[pos + len][ns] = len;
                    }
                }
            }
        }
        if (R < 0 || R > tP || PL[n][R] == -1) {
            System.out.println("0");
            return;
        }
        List<Integer> parts = new ArrayList<>();
        int pos = n, s = R;
        while (pos > 0) {
            int len = PL[pos][s];
            parts.add(len);
            int tri = len * (len - 1) / 2;
            s -= tri;
            pos -= len;
        }
        Collections.reverse(parts); 
        int cur = n;
        for (int i = parts.size() - 1; i >= 0; i--) {
            int len = parts.get(i);
            int start = cur - len + 1;
            for (int x = start; x <= cur; x++) {
                System.out.print(x + " ");
            }
            cur = start - 1;
        }
        System.out.println();
    }
}