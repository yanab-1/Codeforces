import java.util.Scanner;

public class C_1993 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mx = Integer.MIN_VALUE;
        int[] d = new int[2*k];
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            d[num % (2*k)]++;
            mx = Math.max(mx, num);
        }
        int cnt = 0;
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<=k-2; i++){
            cnt += d[i]; 
        }
        int r = k-1;
        for(int l = 0; l<2*k; r++,l++){
            if(r >= 2*k) r -= 2*k;
            cnt += d[r];
            if(cnt == n){
                int w = (r - mx) % (2*k);
                if(w < 0) w += (2*k);
                ans = Math.min(ans, mx + w);
            }
            cnt -= d[l];
        }
        if(ans == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
    
}
// 9
// 4 4
// 2 3 4 5
// 4 3
// 2 3 4 5
// 4 3
// 3 4 8 9
// 3 3
// 6 2 1
// 1 1
// 1
// 7 5
// 14 34 6 25 46 7 17
// 6 5
// 40 80 99 60 90 50
// 6 5
// 64 40 50 68 70 10
// 2 1
// 1 1000000000
