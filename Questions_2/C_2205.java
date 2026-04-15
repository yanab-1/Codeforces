import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C_2205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        List<List<Integer>> ll = new ArrayList<>();
        for(int i = 0; i < n ;i++){
            int m = sc.nextInt();
            List<Integer> l = new ArrayList<>();
            for(int j = 0; j < m; j++){
                l.add(sc.nextInt());
            }
            Collections.reverse(l);
            List<Integer> a = new ArrayList<>();
            for(int b : l){
                if(!a.contains(b)){
                    a.add(b);
                }
            }
            ll.add(a);
        }
        List<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[n];
        for(int op = 0; op < n; op++){
            int idx = -1;
            for(int i = 0; i < n; i++){
                if(!vis[i] && (idx == -1 || nextList(ll.get(i), ll.get(idx)))){
                    idx = i;
                }
            }
            vis[idx] = true;
            for (int x : ll.get(idx)) {
                ans.add(x);
                for (int i = 0; i < n; i++) {
                    if (!vis[i]) {
                        List<Integer> cur = ll.get(i);
                        int idxc = cur.indexOf(x);
                        if (idxc != -1) {
                            cur.remove(idxc);
                        }
                    }
                }
            }
        }
        for(int i : ans){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static boolean nextList(List<Integer> a, List<Integer> b) {
        int n = Math.min(a.size(), b.size());

        for (int i = 0; i < n; i++) {
            if (!a.get(i).equals(b.get(i))) {
                return a.get(i) < b.get(i);
            }
        }
        return a.size() < b.size();
    }
}
