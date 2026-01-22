import java.util.Scanner;

public class B_2185 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        long max = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            max = Math.max(a[i], max);
        }
        System.out.println(max * 1L * n);
    }
}
