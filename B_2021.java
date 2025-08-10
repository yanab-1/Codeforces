import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_2021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        long x=sc.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        Map<Long, Long> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(a[i], map.getOrDefault(a[i], 0L) + 1);
        }
        long ans=0;
        while(true){
            if(map.getOrDefault(ans, 0L)>0){
                if(map.getOrDefault(ans, 0L) > 1){
                    long count = map.get(ans);
                    map.put(ans,1L);
                    map.put(ans+x, map.getOrDefault(ans+x, 0L) + count-1);
                }
                ans++;
            }
            else{
                break;
            }
        }
        System.out.println(ans);
    }

}
