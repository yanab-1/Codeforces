import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class E_1851 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] c = new int[n];
        long[] ans = new long[n];
        for(int i = 0; i < n; i++){
            c[i] = sc.nextInt();
            ans[i] = c[i];
        }
        int[] p = new int[k];
        for(int i = 0; i < k; i++){
            p[i] = sc.nextInt() - 1;
            ans[p[i]] = 0;
        }
        List<HashSet<Integer>> dep = new ArrayList<>();
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        int[] deg = new int[n];
        for(int j = 0; j < n; j++){
            dep.add(new HashSet<>());
            int m = sc.nextInt();
            for(int i = 0; i < m; i++){
                int x = sc.nextInt() - 1;
                dep.get(j).add(x);
                adj.get(x).add(j);
                deg[j]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(deg[i] == 0)
            q.add(i);
        }
        while(!q.isEmpty()){
            int cur = q.poll();
            if(dep.get(cur).size() != 0){
                long sum = 0;
                for(int i : dep.get(cur)){
                    sum += ans[i];
                }
                ans[cur] = Math.min(sum, ans[cur]);
            }
            for(int i : adj.get(cur)){
                deg[i]--;
                if(deg[i] == 0){
                    q.add(i);
                }
            } 
        }
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}