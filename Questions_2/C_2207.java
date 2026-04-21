import java.util.Scanner;

public class C_2207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        long[] pre = new long[n];
        for(int i = 0; i < n ;i++){
            pre[i] = h - a[i];
            int cur = a[i];
            for(int j = i + 1; j < n; j++){
                cur = Math.max(a[j], cur);
                pre[i] += h - cur;
            }
            cur = a[i];
            for(int j = i - 1; j >= 0; j--){
                cur = Math.max(a[j], cur);
                pre[i] += h - cur;
            }
        }
        long ans = 0;
        for(int i = 0; i < n; i++){
            int max = a[i];
            int idx = i;
            for(int j = i; j < n; j++){
                if(a[j] > max){
                    max = a[j];
                    idx = j;
                }
                ans = Math.max(ans, pre[i] + pre[j] - pre[idx]);
            }
        }
        System.out.println(ans);
    }
}
