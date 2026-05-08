import java.util.Scanner;

public class B_1389 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int z = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0; i <= z; i++){
            int r = k - 2 * i;
            if(r < 0) continue;
            int max = 0;
            int sum = 0;
            for(int j = 0; j <= r; j++){
                sum += a[j];
                if(j < n - 1)
                max = Math.max(max, a[j] + a[j + 1]);
            }
            ans = Math.max(ans, sum + i * max);
        }
        System.out.println(ans);
    }
}
