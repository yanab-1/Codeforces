import java.util.Scanner;

public class E_2117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        boolean[] seen = new boolean[n + 1];

        if (a[n - 1] == b[n - 1]) {
            System.out.println(n);
            return;
        }

        int ans = -1;

        for (int i = n - 2; i >= 0; i--) {

            if (a[i] == b[i] ||
                a[i] == a[i + 1] ||
                b[i] == b[i + 1] ||
                seen[a[i]] ||
                seen[b[i]]) {
                ans = i;
                break;
            }

            seen[a[i + 1]] = true;
            seen[b[i + 1]] = true;
        }

        System.out.println(ans + 1);
    }

}
