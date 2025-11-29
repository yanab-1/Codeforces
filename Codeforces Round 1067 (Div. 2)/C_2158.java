import java.util.Scanner;

public class C_2158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }
        long[] b = new long[n];
        for(int i = 0; i < n; i++){
            b[i] = sc.nextLong();
        }
        long[] pre = new long[n];
        pre[0] = a[0];
        for (int i = 1; i < n; i++) {
            pre[i] = a[i] + Math.max(0, pre[i - 1]);
        }

        long ans = Long.MIN_VALUE;
        long suff = 0;
        
        for (int i = n - 1; i >= 0; i--) {
            suff = a[i] + Math.max(0, suff);
            
            long currentVal = pre[i] + suff - a[i];
            
            if (k % 2 != 0) {
                currentVal += b[i];
            }
            
            if (currentVal > ans) ans = currentVal;
        }
        
        System.out.println(ans);
    }
}
