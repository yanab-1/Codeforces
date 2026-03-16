import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C_1627 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        List<List<int[]>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < n - 1; i++){
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            adj.get(u).add(new int[]{v,i});
            adj.get(v).add(new int[]{u, i});
        }
        for(int i = 0; i < n; i++){
            if(adj.get(i).size() > 2){
                System.out.println(-1);
                return;
            }
        }
        int x = 0;
        while(adj.get(x).size() > 1){
            x++;
        }
        int[] ans = new int[n - 1];
        ans[adj.get(x).get(0)[1]] = 2;
        int cur = 2;
        int y = adj.get(x).get(0)[0];
        while(adj.get(y).size() == 2){
            int t = (x == adj.get(y).get(0)[0]) ? 1 : 0;
            cur = 5 - cur;
            ans[adj.get(y).get(t)[1]] = cur;
            x = adj.get(y).get(t)[0];
            int temp = x;
            x = y;
            y = temp;
        }
        for(int i : ans){
            System.out.print(i +" ");
        }
        System.out.println();
    }

}