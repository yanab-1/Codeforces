import java.util.Scanner;

public class B_2210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt() - 1;
        }
        int[] pos = new int[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            pos[p[i]] = i;

            if (p[i] > i) {
                a[p[i]] = 1;
            }
        }
        int[] pre = new int[n];
        pre[0] = a[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + a[i];
        }
        int ans = n - pre[n - 1];
        for (int r = 0; r < n; r++) {
            if (pos[r] < r) {
                int b = 0;
                if(r - 1 >= 0){
                   b = pre[r - 1];
                }
                int cur = r - b;
                ans = Math.max(ans, cur);
            }
        }
        System.out.println(ans);
    }

}
