import java.util.*;

public class C_2161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long X = sc.nextLong();
        long[] a = new long[n];
        long total = 0;
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextLong();
            total += a[i];
        }

        Arrays.sort(a);
        long L = total / X;
        long bonus = 0;
        for (int i = 0; i < L; ++i) {
            bonus += a[n - 1 - i];
        }
        System.out.println(bonus);
        int left = 0, right = n - 1;
        long S = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            long rem = S % X;
            if (left <= right && rem + a[left] < X) {
                sb.append(a[left]).append(i == n - 1 ? '\n' : ' ');
                S += a[left++];
            } else {
                sb.append(a[right]).append(i == n - 1 ? '\n' : ' ');
                S += a[right--];
            }
        }
        System.out.println(sb.toString());
    }
}
