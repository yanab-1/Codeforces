import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D_2131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        int[] deg = new int[n];
        for(int i = 0; i < n - 1; i++){
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            adj.get(u).add(v);
            adj.get(v).add(u);
            deg[u]++;
            deg[v]++;
        }
        if(n < 3){
            System.out.println(0);
            return;
        }
        int leaf = 0;
        for(int i : deg){
            if(i == 1) leaf++;
        }
        int max = 0;
        for(int i = 0; i < n; i++){
            int c = 0;
            for(int j : adj.get(i)){
                if(deg[j] == 1){
                    c++;
                }
            }
            max = Math.max(max, c);
        }
        System.out.println(leaf - max);
    }
}
