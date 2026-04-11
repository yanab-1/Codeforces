import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class A_455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    static int x;
    static int[] a;
    static long[] dp;
    static List<int[]> ll;

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        a = new int[n];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        dp = new long[n + 1];
        ll = new ArrayList<>();
        for(int i : map.keySet()){
            ll.add(new int[]{i, map.get(i)});
        }
        x = ll.size();
        Arrays.fill(dp, -1);
        System.out.println(solve2(0));
    }

    private static long solve2(int i) {
        if(i >= x) return 0;
        if(dp[i] != -1) return dp[i];
        long take = solve2(i + 1);
        long val = ll.get(i)[0] * (long) ll.get(i)[1];
        int next = i + 1;
        if (next < x && ll.get(next)[0] == ll.get(i)[0] + 1) {
            next++;
        }
        long skip = val + solve2(next);
        return dp[i] = Math.max(take, skip);
    }
}
