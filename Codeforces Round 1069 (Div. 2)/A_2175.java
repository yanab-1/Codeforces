import java.util.HashSet;
import java.util.Scanner;

public class A_2175 {
    static final long tar = 1000000000000000000L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++) s.add(sc.nextInt());

        long cur = n;
        int lastColor = 0;
        while (cur < tar) {
            int m = s.size();
            if (s.contains(m)) {
                lastColor = m;
                break;
            }
            lastColor = m;
            s.add(m);
            cur++;
        }
        System.out.println(lastColor);

    }
}
