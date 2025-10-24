import java.util.Scanner;

public class B_2156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        long[] qs = new long[q];
        for (int i = 0; i < q; i++) qs[i] = sc.nextLong();
        boolean hasB = s.indexOf('B') != -1;
        for (int i = 0; i < q; i++) {
            long a = qs[i];
            if (!hasB) {
                System.out.println(a);
                continue;
            }
            int pos = 0;
            long ans = 0;
            while (a > 0) {
                if (s.charAt(pos) == 'B') {
                    a /= 2;
                    ans++;
                    pos++;
                    if (pos == n) pos = 0;
                } else {
                    int cur = pos;
                    int len = 0;
                    while (s.charAt(cur) == 'A') {
                        len++;
                        cur++;
                        if (cur == n) cur = 0;
                    }
                    if (a > len) {
                        a -= len;
                        ans += len;
                        pos = cur;
                    } else {
                        ans += a;
                        a = 0;
                        break;
                    }
                }
            }
            System.out.println(ans);
        }

    }
}
