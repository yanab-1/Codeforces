import java.util.Arrays;
import java.util.Scanner;

public class C_2175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }
    public static void solve(Scanner sc) {
        String s = sc.next();
        String t = sc.next();

        int[] fs = new int[26];
        int[] ft = new int[26];

        for (char c : s.toCharArray()) fs[c - 'a']++;
        for (char c : t.toCharArray()) ft[c - 'a']++;

        for (int i = 0; i < 26; i++) {
            if (ft[i] < fs[i]) {
                System.out.println("Impossible");
                return;
            }
        }

        StringBuilder R = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            int excess = ft[i] - fs[i];
            for (int k = 0; k < excess; k++) R.append((char)('a' + i));
        }

        int n = s.length();
        char[] nd = new char[n];
        Arrays.fill(nd, '{');
        char cur = '{';
        for (int i = n - 2; i >= 0; i--) {
            if (s.charAt(i + 1) != s.charAt(i)) cur = s.charAt(i + 1);
            nd[i] = cur;
        }

        StringBuilder res = new StringBuilder();
        int i = 0, j = 0, m = R.length();

        while (i < n && j < m) {
            char a = s.charAt(i), b = R.charAt(j);
            if (a < b) {
                res.append(a);
                i++;
            } else if (b < a) {
                res.append(b);
                j++;
            } else {
                if (nd[i] < a) {
                    res.append(a);
                    i++;
                } else {
                    res.append(b);
                    j++;
                }
            }
        }

        while (i < n) res.append(s.charAt(i++));
        while (j < m) res.append(R.charAt(j++));

        System.out.println(res.toString());
    }
}
