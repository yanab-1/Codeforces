import java.util.Scanner;

public class C_2107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    static long inf = 1_000_000_000_000_0L;
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long k = sc.nextLong();
        String s = sc.next();
        long[] a = new long[n];
        int idx = -1;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
            if(s.charAt(i) == '0'){
                idx = i;
                a[i] = -inf;
            }
        }
        long max = Long.MIN_VALUE;
        long cur = 0;
        for(int i = 0; i < n; i++){
            cur += a[i];
            if(cur < 0){
                cur = 0;
            }
            max = Math.max(cur, max);
        }
        if(max > k || (idx == -1 && max != k)){
            System.out.println("No");
            return;
        }
        if(idx != -1){
            max = 0;
            cur = 0;
            for(int i = idx + 1; i < n; i++){
                cur += a[i];
                max = Math.max(cur, max);
            }
            long r = max;
            max = 0;
            cur = 0;
            for(int i = idx - 1; i >= 0; i--){
                cur += a[i];
                max = Math.max(cur, max);
            }
            a[idx] = k - r - max;
        }
        System.out.println("Yes");
        for(long i : a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
