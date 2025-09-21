import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class D_2147 {
    static class pair{
        long first, second;
        public pair(long first, long second){
            this.first = first;
            this.second = second;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        Map<Long, Long> freq = new HashMap<>();
        for(int i = 0; i < n; i++){
            long num = sc.nextLong();
            freq.put(num, freq.getOrDefault(num, 0L) + 1);
        }
        List<pair> g = new ArrayList<>();
        for(Map.Entry<Long, Long> entry : freq.entrySet()){
            g.add(new pair(entry.getValue(), entry.getKey())); 
        }
        Collections.sort(g, (a, b) -> {
            if(a.first != b.first){
                return Long.compare(b.first, a.first);
            }
            return Long.compare(b.second, a.second);
        });
        long a = 0;
        long b = 0;
        int t = 0;
        for(pair p : g){
            long c = p.first;
            long l = p.second;
            long al = (l + (t == 0 ? 1 : 0)) / 2;
            long bl = l - al;
            a += al * c;
            b += bl * c;
            if(l % 2 == 1){
                t ^= 1;
            }
        }
        System.out.println(a + " " + b);
    }
}
