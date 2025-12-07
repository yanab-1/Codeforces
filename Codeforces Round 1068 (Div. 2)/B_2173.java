import java.util.Scanner;

public class B_2173 {
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
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        long max = 0;
        long min = 0;
        for(int i = 0; i < n; i++){
            long nmax = Math.max(max - a[i], b[i] - min);
            long nmin = Math.min(min - a[i], b[i] - max);
            max = nmax;
            min = nmin;
        }
        System.out.println(max);
    }
}
