import java.util.Scanner;

public class C_2064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n ;i++){
            a[i] = sc.nextInt();
        }
        long[] pre = new long[n];
        if(a[0] > 0) pre[0] = a[0];
        for(int i = 1; i < n; i++){
            pre[i] = pre[i - 1];
            if(a[i] > 0){
                pre[i] += a[i];
            }
        }
        long[] suf = new long[n];
        if(a[n - 1] < 0) suf[n - 1] = -a[n - 1];
        for(int i = n - 2; i >= 0; i--){
            suf[i] = suf[i + 1];
            if(a[i] < 0){
                suf[i] -= a[i];
            }
        }
        long ans = 0;
        for(int i = 0; i < n; i++){
            ans = Math.max(ans, pre[i] + suf[i]);
        }
        System.out.println(ans);
    }
}
