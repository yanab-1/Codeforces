import java.util.ArrayList;
import java.util.Scanner;

public class D_2185 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long h = sc.nextLong();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();

        long[] dif = new long[n]; 
        boolean[] is = new boolean[n]; 
        ArrayList<Integer> ll = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int b = sc.nextInt() - 1;
            long c = sc.nextLong();

            if (!is[b]) {
                is[b] = true;
                ll.add(b);
            }

            dif[b] += c;
            if (a[b] + dif[b] > h) {
                for (int idx : ll) {
                    dif[idx] = 0L;
                    is[idx] = false;
                }
                ll.clear();
            }
        }
        for (int i = 0; i < n; i++) {
            long val = a[i] + dif[i];
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
