import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Scanner;


public class B_2208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt() - 1;
        int m = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        if(n == k){
            System.out.println(m / a[p]);
            return;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> a[x] - a[y]);
        for(int i = 0; i < k ;i++){
            pq.add(i);
        }
        Deque<Integer> deck = new ArrayDeque<>();
        for (int i = k; i < n; i++) deck.add(i);
        int energy = 0;
        int ans = 0;
        while (true) {
            boolean ok = false;
            if(pq.contains(p)){
                ok = true;
                if(energy + a[p] > m){
                    break;
                }
                pq.remove(p);
            }
            if(ok){
                ans++;
                int id = deck.pollFirst();
                pq.add(id);
                deck.addLast(p);
                energy += a[p];
            }
            else{
                int c = pq.poll();
                energy += a[c];
                int id = deck.pollFirst();
                pq.add(id);
                deck.addLast(c);
            }
            if(energy > m) break;
        }
        System.out.println(ans);
    }
}
