import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class A_2135 {
    static HashMap<Integer, List<Integer>> map;
    static int[] id;
    static int[] dp;
    static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        map = new HashMap<>();
        id = new int[n];
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            map.putIfAbsent(a[i], new ArrayList<>());
            map.get(a[i]).add(i);
            id[i] = map.get(a[i]).size();
        }
        dp = new int[n];
        Arrays.fill(dp, -1);
        System.out.println(dfs(n - 1));
    }
    private static int dfs(int index) {
        if(index < 0) return 0;
        if(dp[index] != -1) return dp[index];
        int ans = dfs(index - 1);
        if(id[index] >= a[index]) {
            int prevIndex = map.get(a[index]).get(id[index] - a[index]);
            ans = Math.max(ans, dfs(prevIndex - 1) + a[index]);
        }
        return dp[index] = ans;
    }
}
