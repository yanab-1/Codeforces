import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E_2149 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(find(n, k, l, r, a) - find(n, k - 1, l, r, a));
    }

    private static long find(int n, int k, int l, int r, int[] a) {
        long ans = 0;
        int s = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int e = 0; e < n; e++){
            map.put(a[e], map.getOrDefault(a[e], 0) + 1);
            while(map.size() > k){
                int x = map.get(a[s]) - 1;
                if(x == 0){
                    map.remove(a[s]);
                }
                else {
                    map.put(a[s], x);
                }
                s++;
            }
            int i = Math.max(s, e - r + 1);
            int j = e - l + 1;
            if(j >= i){
                ans += j - i + 1;
            }
        }
        return ans;
    }
}
