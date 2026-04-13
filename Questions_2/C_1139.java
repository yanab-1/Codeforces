import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C_1139 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<List<int[]>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for(int i = 0; i < n - 1; i++){
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            int x = sc.nextInt();
            adj.get(u).add(new int[]{v, x});
            adj.get(v).add(new int[]{u, x});
        }
        
    }
}
