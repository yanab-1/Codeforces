import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C_1143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        int[] c = new int[n];
        int root = -1;
        for(int i = 0; i < n; i++){
            int u = sc.nextInt();
            if(u == -1) root = i;
            else adj.get(u - 1).add(i);
            c[i] = sc.nextInt();
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(c[i] == 1 && i != root){
                boolean ok = true;
                for(int j : adj.get(i) ){
                    if(c[j] == 0) {
                        ok = false;
                        break;
                    }
                }
                if(ok) ans.add(i + 1);
            }
        }
        if(ans.size() == 0){
            System.out.println(-1);
        }
        else{
            for(int i : ans){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
