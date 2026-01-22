import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class C_2185 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        int best = 0, cur = 0;

        for (int i = 0; i < list.size(); i++) {
            if (i == 0 || list.get(i) != list.get(i - 1) + 1) {
                cur = 1;
            } else {
                cur++;
            }
            best = Math.max(best, cur);
        }

        System.out.println(best);
    }
}
