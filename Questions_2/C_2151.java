import java.util.Scanner;

public class C_2151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] a = new long[2 * n];
        for(int i = 0; i < 2 * n; i++){
            a[i] = sc.nextLong();
        }
        long[] ans = new long[n + 3];
        for(int i = 0; i < 2 * n; i+=2){
            ans[0] -= a[i];
        }
        for(int i = 1; i < 2 * n; i+=2){
            ans[0] += a[i];
            ans[1] -= a[i];
        }
        for(int i = 2; i < 2 * n; i+=2){
            ans[1] += a[i];
        }
        ans[1] += 2 * a[2 * n - 1] - a[0];
        for(int i = 2; i < n; i++){
            ans[i] = ans[i - 2] + 2 * (a[2 * n - i] - a[i - 1]);
        }
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
