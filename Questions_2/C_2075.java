import java.util.Arrays;
import java.util.Scanner;

public class C_2075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < m; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        long ans = 0;
        for (int k = 1; k < n; k++) {
            int x = m - lowerBound(a, k);
            int y = m - lowerBound(a, n - k);
            ans += (long)x * y - Math.min(x, y);
        }
        System.out.println(ans);
    }

    public static int lowerBound(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) >>> 1;
            if (arr[mid] < target) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}

