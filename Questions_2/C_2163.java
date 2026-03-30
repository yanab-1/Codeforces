import java.util.Scanner;

public class C_2163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[][] a = new int[2][n];
        int[] pmin = new int[n];
        int[] pmax = new int[n];
        int[] smin = new int[n];
        int[] smax = new int[n];
        for(int i = 0; i < n; i++){
            a[0][i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            a[1][i] = sc.nextInt();
        }
        pmin[0] = a[0][0];
        pmax[0] = a[0][0];
        for(int i = 1; i < n; i++){
            pmin[i] = Math.min(pmin[i - 1], a[0][i]);
            pmax[i] = Math.max(pmax[i - 1], a[0][i]);
        }
        smin[n - 1] = a[1][n - 1];
        smax[n - 1] = a[1][n - 1];
        for(int i = n - 2; i >= 0; i--){
            smin[i] = Math.min(smin[i + 1], a[1][i]);
            smax[i] = Math.max(smax[i + 1], a[1][i]);
        }
        int[] max = new int[2 * n + 1];
        for(int i = 0; i < n; i++){
            int cmin = Math.min(pmin[i], smin[i]);
            int cmax = Math.max(pmax[i], smax[i]);
            max[cmax] = Math.max(max[cmax], cmin);
        }
        int[] pre = new int[2 * n + 1];
        for(int i = 1; i < 2 * n + 1; i++){
            pre[i] = Math.max(pre[i - 1], max[i]);
        }
        long ans = 0;
        for(int i = 1; i < 2 * n + 1; i++){
            ans += Math.min(pre[i], i);
        }
        System.out.println(ans);
    }
}
