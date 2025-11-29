import java.util.Scanner;

public class B_2158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[2 * n];
        int[] freq = new int[2 * n + 1];
        for(int i = 0; i < 2 * n; i++){
            a[i] = sc.nextInt();
            freq[a[i]]++;
        }
        int s = 0;               
        int e = 0;                 
        int pairs = 0;            
        for (int v = 1; v <= 2 * n; ++v) {
            int c = freq[v];
            if (c == 0) continue;
            pairs += c / 2;
            if ((c & 1) == 1) s++;
            else {
                e++;
            }
        }
        int best = 0;
        int maxX = Math.min(e, pairs);
        for (int x = 0; x <= maxX; ++x) {
            int cap = n - x;
            if (cap < 0) break; 
            int L = Math.max(0, s - cap);
            int R = Math.min(s, cap);
            if (L > R) continue; 
            int p = (n - x) & 1;
            boolean ok;
            if ((L & 1) == p) ok = true;
            else if (L + 1 <= R) ok = true; 
            else ok = false;
            if (!ok) continue;
            int val = s + 2 * x;
            if (val > best) best = val;
        }
        System.out.println(best);
    }
}
