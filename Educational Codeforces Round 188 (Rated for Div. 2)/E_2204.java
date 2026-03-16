import java.util.Scanner;

public class E_2204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        String s = sc.next();
        if (s.length() == 1) {
            System.out.println(s);
            return;
        }
        int[] freq = new int[10];
        int sum = 0;
        for (int j = 0; j < s.length(); j++) {
            int d = s.charAt(j) - '0';
            freq[d]++;
            sum += d;
        }
        boolean okk = false;
        int lower = Math.max(1, sum - 100);
        for (int i = sum; i >= lower; i--) {
            String chain = buildChain(i);
            int[] temp = freq.clone();
            int csum = 0;
            boolean ok = true;
            for (int j = 0; j < chain.length(); j++) {
                int d = chain.charAt(j) - '0';
                csum += d;
                temp[d]--;
                if (temp[d] < 0) {
                    ok = false;
                    break;
                }
            }
            if (!ok) continue;
            if (i + csum != sum) continue;
            int remCount = 0;
            for (int d = 0; d < 10; d++) remCount += temp[d];
            if (remCount < 2) continue;
            System.out.println(build(temp) + chain);
            okk = true;
            break;
        }
        if (!okk) {
            System.out.println(s);
        }
    }

    private static int dSum(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }

    private static String buildChain(int n) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(n);
            if (n < 10) break;
            n = dSum(n);
        }
        return sb.toString();
    }

    private static String build(int[] freq) {
        StringBuilder sb = new StringBuilder();
        for (int d = 9; d >= 0; d--) {
            for (int j = 0; j < freq[d]; j++) {
                sb.append((char) ('0' + d));
            }
        }
        return sb.toString();
    }
}