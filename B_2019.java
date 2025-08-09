import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_2019{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int q = sc.nextInt();
        long[] x = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
        }
        long[] k = new long[q];
        for (int i = 0; i < q; i++) {
            k[i] = sc.nextLong();
        } 
        Map<Long, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long noSeg = (long) (i + 1) * (n - i) - 1;
            map.put(noSeg, map.getOrDefault(noSeg, 0L) + 1);
            if(i > 0){
                long noSeg2 = (long) i * (n - i);
                map.put(noSeg2, map.getOrDefault(noSeg2, 0L) + x[i] - x[i - 1] - 1);
            }
        }
        for (int i = 0; i < q; i++) {
            System.out.print(map.getOrDefault(k[i], 0L) + " ");
        }
        System.out.println();
    }
}