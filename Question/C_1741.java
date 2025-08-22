import java.util.Scanner;

public class C_1741 {
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

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int ans = n;

        for (int len = 1; len <= n; len++) {
            int sum = 0;
            for (int i = 0; i < len; i++) {
                sum += a[i];
            }

            int curSum = 0;
            int curLen = 0;
            int maxLen = len;
            boolean found = true;

            for (int i = len; i < n; i++) {
                curSum += a[i];
                curLen++;

                if (curSum == sum) {
                    maxLen = Math.max(maxLen, curLen);
                    curSum = 0;
                    curLen = 0;
                } else if (curSum > sum) {
                    found = false;
                    break;
                }
            }

            if (found && curSum == 0) {
                ans = Math.min(ans, maxLen);
            }
        }

        System.out.println(ans);
    }
}
