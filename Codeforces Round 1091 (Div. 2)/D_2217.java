import java.util.Scanner;

public class D_2217 {
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
        int[] arr = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] pivots = new int[k + 2];
        for (int i = 1; i <= k; i++) {
            pivots[i] = sc.nextInt();
        }
        arr[0] = arr[n + 1] = arr[pivots[1]];
        pivots[k + 1] = n + 1;
        int S = 0, X = 0;
        for (int i = 0; i <= k; i++) {
            int count = 0;
            for (int j = pivots[i]; j < pivots[i + 1]; j++) {
                if (arr[j] != arr[j + 1]) {
                    count++;
                }
            }
            S += count;
            X = Math.max(X, count);
        }
        System.out.println(Math.max(S / 2, X));
    }
}
