import java.util.PriorityQueue;
import java.util.Scanner;

public class C_2166 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] val = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }
        int[] left = new int[n];
        int[] right = new int[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for(int i = 0; i < n; i++){
            pq.add(new int[]{val[i], i});
            right[i] = (i + 1) % n;
            left[i] = (i - 1 + n) % n;
        }
        int rem = n;
        long ans = 0L;
        while (rem > 1) {
            int[] curr = pq.poll();
            int idx = curr[1];
            int l = left[idx];
            int r = right[idx];
            int nbr = val[l] <= val[r] ? l : r;
            ans += val[nbr];
            left[r] = l;
            right[l] = r;
            rem--;
        }
        System.out.println(ans);
    }
}
