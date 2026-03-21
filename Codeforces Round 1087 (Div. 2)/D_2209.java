import java.util.Scanner;

public class D_2209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int[] cnt = {r, g, b};
        char[] ch = {'R', 'G', 'B'};
        StringBuilder sb = new StringBuilder();
        while (true) {
            char l1 = sb.length() >= 1 ? sb.charAt(sb.length() - 1) : '.';
            char l2 = sb.length() >= 2 ? sb.charAt(sb.length() - 2) : '.';
            char l3 = sb.length() >= 3 ? sb.charAt(sb.length() - 3) : '.';
            int c = -1;
            for (int i = 0; i < 3; i++) {
                if (cnt[i] == 0) continue;
                if (ch[i] == l1) continue;   
                if (ch[i] == l3) continue;  
                if (c == -1 || cnt[i] > cnt[c] || (cnt[i] == cnt[c] && ch[i] == l2)) {
                    c = i;
                }
            }
            if (c == -1) break;
            sb.append(ch[c]);
            cnt[c]--;
        }
        System.out.println(sb.toString());
    }
}