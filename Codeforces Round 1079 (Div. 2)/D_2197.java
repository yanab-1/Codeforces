import java.util.Scanner;

public class D_2197 {
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
        int b = (int) Math.sqrt(n);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int k = 1; k <= b; k++) {
                long j = i + 1L * a[i] * k;
                if (j >= n) break;  
                if (a[(int) j] == k) ans++;
            }
        }
        for (int j = 0; j < n; j++) {
            int val = a[j];
            if (val <= b) continue;
            int max = n / val;
            for (int x = 1; x <= max; x++) {
                int i = j - x * val;
                if (i < 0) break; 
                if (a[i] == x) ans++;
            }
        }
        System.out.println(ans);
    }
}
