import java.util.Arrays;
import java.util.Scanner;

public class A_2023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        Arrays.sort(a, (A, B) -> {
            int maxA = Math.max(A[0], A[1]);
            int maxB = Math.max(B[0], B[1]);
            if(maxA == maxB) {
                int minA = Math.min(A[0], A[1]);
                int minB = Math.min(B[0], B[1]);
                return minA - minB;
            }
            return maxA - maxB;
        });
        for (int i = 0; i < n; i++) {
            System.out.print(a[i][0] + " " + a[i][1]+" ");
        }
        System.out.println();
    }
}