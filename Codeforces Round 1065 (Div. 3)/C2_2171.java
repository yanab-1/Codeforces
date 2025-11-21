import java.util.Scanner;

public class C2_2171 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            x ^= a[i];
        }
        for (int i = 0; i < n; i++) {
            y ^= b[i];
        }
        int k = x ^ y;

        if (k == 0) {
            System.out.println("Tie");
        } else {
            int bit = Integer.highestOneBit(k);
            int idx = n - 1;
            while (idx >= 0 && ((a[idx] & bit) == (b[idx] & bit))) {
                idx--;
            }
            System.out.println(((idx + 1) % 2 == 1) ? "Ajisai\n" : "Mai\n");
        }
    }

}
