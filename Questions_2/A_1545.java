import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A_1545 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Map<Integer, int[]> cnt = new HashMap<>();
        for (int i = 0; i < n; i++) {
            cnt.putIfAbsent(a[i], new int[2]);
            cnt.get(a[i])[i % 2]++;
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            cnt.get(a[i])[i % 2]--;
        }
        boolean ok = true;
        for (int[] val : cnt.values()) {
            if (val[0] != 0 || val[1] != 0) {
                ok = false;
                break;
            }
        }
        System.out.println(ok ? "YES" : "NO");
    }
}
