import java.util.*;

public class B_2176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();

        List<Integer> ones = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                ones.add(i);
            }
        }

        int k = ones.size();
        int ans = 0;

        for (int i = 0; i < k; i++) {
            int cur = ones.get(i);
            int next = ones.get((i + 1) % k);
            int gap;
            if (next > cur) {
                gap = next - cur - 1;
            } else {
               gap = (n - cur - 1) + next;
            }
            ans = Math.max(ans, gap);
        }
        System.out.println(ans);
    }
}
