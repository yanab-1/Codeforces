import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class B_1242 {
    static TreeSet<Integer> visit;
    static List<TreeSet<Integer>> adj;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new TreeSet<>());
        }
        for(int i = 0; i < m; i++){
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        int connected = 0;
        visit = new TreeSet<>();
        for(int i = 0; i < n; i++){
            visit.add(i);
        }
        while(!visit.isEmpty()){
            int st = visit.pollFirst();
            bfs(st);
            connected++;
        }
        System.out.println(connected - 1);
    }
    private static void bfs(int i) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int c = q.poll();
            List<Integer> ll = new ArrayList<>();
            for(int v : visit){
                if(!adj.get(c).contains(v)){
                    ll.add(v);
                }
            }
            for(int v : ll){
                q.add(v);
                visit.remove(v);
            }
        }
    }
}
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Scanner;
// import java.util.Set;

// public class B_1242 {
//     static class DSU{
//         class Node{
//             int val;
//             Node parent;
//             int rank;
//         }
//         private HashMap<Integer, Node> map = new HashMap<>();
//         public void create(int n){
//             for(int i = 1; i <= n; i++){
//                 Node nn = new Node();
//                 nn.val = i;
//                 nn.parent = nn;
//                 nn.rank = 1;
//                 map.put(i, nn);
//             }
//         }
//         public int find(int v){
//             Node n = map.get(v);
//             return find(n).val;
//         }
//         private Node find(Node n){
//             if(n.parent == n){
//                 return n;
//             }
//             Node nn = find(n.parent);
//             n.parent = nn;
//             return nn;
//         }
//         public void union(int v1, int v2){
//             Node n1 = map.get(v1);
//             Node n2 = map.get(v2);
//             Node re1 = find(n1);
//             Node re2 = find(n2);
//             if(re1.rank == re2.rank){
//                 re1.parent = re2;
//                 re2.rank++;
//             }
//             else if(re1.rank > re2.rank){
//                 re2.parent = re1;
//             }
//             else{
//                 re1.parent = re2;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         DSU dsu = new DSU();
//         dsu.create(n);
//         HashSet<String> set = new HashSet<>();
//         for(int i = 0; i < m; i++){
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             set.add(a + " " + b);
//             set.add(b +" " + a);
//         }
//         for(int i = 1; i <= n; i++){
//             for(int j = i + 1; j <= n; j++){
//                 if(!set.contains(i + " " + j)){
//                     dsu.union(i, j);
//                 }
//             }
//         }
//         Set<Integer> connected = new HashSet<>();
//         for(int i = 1; i <= n; i++){
//             connected.add(dsu.find(i));
//         }
//         System.out.println(connected.size() - 1);
//     }
// }