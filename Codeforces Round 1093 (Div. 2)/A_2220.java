import java.util.*;

public class A_2220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean[] seen = new boolean[101]; 
        boolean ok = true;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (seen[a[i]]) ok = false;   
            seen[a[i]] = true;
        }
        if (!ok) {
            System.out.println(-1);
            return;
        }
        Arrays.sort(a);
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}