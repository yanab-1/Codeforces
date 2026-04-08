import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class D_1263 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
    static int N = 200100;
    static List<List<Integer>> adj = new ArrayList<>();
    static int[] visit;
    private static void solve(Scanner sc) {
        visit = new int[N];
        int n = sc.nextInt();
        for(int i = 0; i < N; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < n; i++){
            String s = sc.next();
            for(char c : s.toCharArray()){
                int j = n + c - 'a';
                adj.get(i).add(j);
                adj.get(j).add(i);
            }
        }
        int c = 0;
        for(int i = 0; i < n; i++){
            if(visit[i] == 0){
                c++;
                dfs(i);
            }
        }
        System.out.println(c);
    }
    private static void dfs(int i) {
        visit[i] = 1;
        for(int u : adj.get(i)){
            if(visit[u] == 0){
                dfs(u);
            }
        }
    }
}
