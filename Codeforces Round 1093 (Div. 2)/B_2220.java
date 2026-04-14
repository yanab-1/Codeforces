import java.util.Scanner;

public class B_2220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long m = sc.nextLong();
        long[] a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }
        long prev = -1;
        int c = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            long x = a[i];
            if (i == 0 || x != prev) c = 1;
            else c++;
            ans = Math.max(ans, c);
            prev = x;
        }
        System.out.println(ans >= m ? "NO" : "YES");
    }
}
