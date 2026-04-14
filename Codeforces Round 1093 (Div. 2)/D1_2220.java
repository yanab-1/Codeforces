import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D1_2220 {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
    }

    static List<Integer> ans;
    static int m;

    private static void solve() {
        int n = sc.nextInt();
        m = 2 * n + 1;
        ans = new ArrayList<>();
        solve2(1, m, 3);
        System.out.println("! " + ans.get(0) + " " + ans.get(1) + " " + ans.get(2));
        System.out.flush();
    }
    private static void solve2(int l, int r, int t) {
        if (t == 0) return;
        if (t == r - l + 1) {
            for (int i = l; i <= r; i++) {
                ans.add(i);
            }
            return;
        }
        int mid = l + (r - l) / 2;
        List<Integer> l1 = new ArrayList<>();
        for (int i = l; i <= mid; i++) {
            l1.add(i);
        }
        List<Integer> l2 = new ArrayList<>();
        for (int i = 1; i < l; i++) {
            l2.add(i);
        }
        for (int i = mid + 1; i <= m; i++) {
            l2.add(i);
        }
        int q1 = ask(l1);
        int q2 = ask(l2);
        int diff = q1 - q2;
        int tLeft = 0;
        if (diff == 1) {
            tLeft = 1;
        } else if (diff == -1) {
            tLeft = 2;
        } else {
            if ((l1.size() - q1) % 2 != 0) {
                tLeft = 3;
            } else {
                tLeft = 0;
            }
        }
        int tRight = t - tLeft;
        if(tLeft > 0)
        solve2(l, mid, tLeft);
        if(tRight > 0)
        solve2(mid + 1, r, tRight);
    }

    private static int ask(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("? ").append(list.size());
        for (int x : list) {
            sb.append(" ").append(x);
        }
        System.out.println(sb.toString());
        System.out.flush();
        int res = sc.nextInt();
        return res;
    }
}
