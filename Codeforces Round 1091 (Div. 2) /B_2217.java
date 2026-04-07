import java.util.Scanner;

public class B_2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int p = sc.nextInt() - 1;
        int x = a[p];
        int l = 0; 
        int r = 0;
        for (int i = p - 1; i >= 0; i--) {
            if (a[i] != x && (i == p - 1 || a[i + 1] == x)) {
                l++;
            }
        }
        for (int i = p + 1; i < n; i++) {
            if (a[i] != x && (i == p + 1 || a[i - 1] == x)) {
                r++;
            }
        }
        System.out.println(2 * Math.max(l, r));
    }
}
