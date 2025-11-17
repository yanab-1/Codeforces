import java.util.Scanner;
import java.util.TreeMap;

public class D_2074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }
        long[] r = new long[n];
        for(int i = 0; i < n; i++){
            r[i] = sc.nextLong();
        }
        TreeMap<Long, Long> map = new TreeMap<>();
        for(int i = 0; i < n; i++){
            long st = a[i] - r[i];
            long end = a[i] + r[i];
            for(long j = st; j <= end; j++){
                long point = r[i] * r[i] - (j - a[i]) * (j - a[i]);
                long tp = 2L * (long) Math.floor(Math.sqrt((double) point)) + 1; 
                map.put(j, Math.max(map.getOrDefault(j, 0L), tp));
            }
        }
        long ans = 0;
        for(long i : map.values()){
            ans += i;
        }
        System.out.println(ans);
    }
}
