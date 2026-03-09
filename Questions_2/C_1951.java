import java.util.Arrays;
import java.util.Scanner;

public class C_1951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long ans = 0;
        int tickets = 0;
        for(int i = 0; i < n; i++){
            int tick = Math.min(m, k);
            ans += 1l * tick * (a[i] + tickets);
            tickets += tick;
            k -= tick;
        }
        System.out.println(ans);
    }
}
