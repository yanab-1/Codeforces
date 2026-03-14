import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class D_2208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
    public static class DisJoinSet {
        class Node {
            int val;
            int rank;
            Node parent;
        }

        private HashMap<Integer, Node> map = new HashMap<>();

        public void create(int v) {
            Node nn = new Node();
            nn.val = v;
            nn.rank = 0;
            nn.parent = nn;
            map.put(v, nn);

        }

        public int find(int v) {
            Node node = map.get(v);
            return find(node).val;

        }

        private Node find(Node node) {
            if (node.parent == node) {
                return node;
            }
            Node n = find(node.parent);
            node.parent = n;// path Compression
            return n;

        }

        public void union(int v1, int v2) {
            Node node1 = map.get(v1);// v1 vtx kahan pe create hau hai
            Node node2 = map.get(v2);// v2 vtx kahan pe create hau hai
            Node re1 = find(node1);// v1 ka re node hai
            Node re2 = find(node2);// v2 ka re node hai
            if (re1.rank == re2.rank) {
                re1.parent = re2;
                re2.rank++;
            } else if (re1.rank < re2.rank) {
                re1.parent = re2;
            } else {
                re2.parent = re1;
            }
        }
    }
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        char[][] s = new char[n][n];
        for(int i = 0; i < n; i++){
            String s2 = sc.next();
            for(int j = 0; j < n; j++){
                s[i][j] = s2.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            if (s[i][i] == '0') {
                System.out.println("No");;
                return;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i][j] == '1' && s[j][i] == '1') {
                    System.out.println("No");;
                    return;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (s[i][j] == '1') {
                    for (int k = 0; k < n; k++) {
                        if (s[j][k] == '1' && s[i][k] == '0') {
                            System.out.println("No");;
                            return;
                        }
                    }
                }
            }
        }
        List<int[]> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || s[i][j] == '0') continue;
                boolean ok = true;
                for (int k = 0; k < n; k++) {
                    if (k != i && k != j) {
                        if (s[i][k] == '1' && s[k][j] == '1') {
                            ok = false;
                            break;
                        }
                    }
                }
                if (ok) edges.add(new int[]{i, j});
            }
        }
        if (edges.size() != n - 1) {
            System.out.println("No");
            return;
        }
        DisJoinSet dsu = new DisJoinSet();
        for(int i = 0; i < n; i++){
            dsu.create(i);
        }
        for (int[] e : edges) dsu.union(e[0], e[1]);
        int root = dsu.find(0);
        for (int i = 1; i < n; i++) {
            if (dsu.find(i) != root) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        for (int[] e : edges) {
            System.out.println((e[0] + 1) + " " + (e[1] + 1));
        }
    }
}
