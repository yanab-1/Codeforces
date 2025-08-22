import java.util.*;

public class A_2077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] b = new long[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            b[i] = sc.nextLong();
        }

        Arrays.sort(b);
        reverse(b); // now b[0] = largest, b[1] = next largest, etc.

        long[] a = new long[2 * n + 1];

        int idx = 0;
        a[0] = b[idx++]; // a1 = largest

        // fill a3, a5, ..., a2n+1 with next n largest
        for (int i = 2; i <= 2 * n; i += 2) {
            a[i] = b[idx++];
        }

        // fill a2, a4, ..., a2n-2 with remaining n-1 elements
        for (int i = 1; i <= 2 * n - 3; i += 2) {
            a[i] = b[idx++];
        }

        // compute a2n using formula
        long mis = a[0];
        for (int i = 1; i < 2 * n; i++) {
            if (i % 2 == 1) mis -= a[i];
            else mis += a[i];
        }
        mis += a[2 * n]; // add a_{2n+1}

        a[2 * n - 1] = mis; // place it in the missing slot

        // print
        for (int i = 0; i <= 2 * n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    private static void reverse(long[] b) {
        for (int i = 0; i < b.length / 2; i++) {
            long temp = b[i];
            b[i] = b[b.length - 1 - i];
            b[b.length - 1 - i] = temp;
        }
    }
}
