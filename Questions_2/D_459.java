import java.io.*;
import java.util.*;

public class D_459 {

    static class Segment {
        long[] tree;
        int n;

        Segment(int n){
            this.n = n;
            tree = new long[4 * n];
        }

        public long query(int l, int r){
            return query(l, r, 0, 0, n - 1);
        }

        private long query(int l, int r, int idx, int st, int end){
            if(r < st || l > end){
                return 0;
            }
            if(l <= st && r >= end){
                return tree[idx];
            }
            int mid = (st + end) / 2;
            long left = query(l, r, 2 * idx + 1, st, mid);
            long right = query(l, r, 2 * idx + 2, mid + 1, end);
            return left + right;
        }

        public void point_Update(int i, int val){
            point_Update(i, val, 0, n - 1, 0);
        }

        private void point_Update(int i, int val, int l, int r, int idx){
            if(l == r){
                tree[idx] += val;
                return;
            } 
            int mid = (l + r) / 2;
            if(i <= mid){
                point_Update(i, val, l, mid, 2 * idx + 1);
            } else {
                point_Update(i, val, mid + 1, r, 2 * idx + 2);
            }
            tree[idx] = tree[2 * idx + 1] + tree[2 * idx +  2];
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solve(br);
    }

    private static void solve(BufferedReader br) throws Exception {
        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        int[] c = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(st.nextToken());
            c[i] = a[i];
        }

        // Coordinate compression
        Arrays.sort(c);
        List<Integer> uniqList = new ArrayList<>();
        uniqList.add(c[0]);
        for(int i = 1; i < n; i++){
            if(c[i] != c[i - 1]){
                uniqList.add(c[i]);
            }
        }

        for(int i = 0; i < n; i++){
            a[i] = Collections.binarySearch(uniqList, a[i]);
        }

        // ----------- Compute arr1 and arr2 using HashMap -----------

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        Map<Integer, Integer> freq = new HashMap<>();

        // prefix frequency
        for(int i = 0; i < n; i++){
            int val = a[i];
            freq.put(val, freq.getOrDefault(val, 0) + 1);
            arr1[i] = freq.get(val);
        }

        freq.clear();

        // suffix frequency
        for(int i = n - 1; i >= 0; i--){
            int val = a[i];
            freq.put(val, freq.getOrDefault(val, 0) + 1);
            arr2[i] = freq.get(val);
        }

        // ----------- Segment Tree on arr2 -----------

        int max = n + 2;  
        Segment sg = new Segment(max);

        for(int i : arr2){
            sg.point_Update(i, 1);
        }

        long count = 0;

        for(int i = 0; i < n; i++){
            sg.point_Update(arr2[i], -1);
            if(i == 0) continue;
            count += sg.query(0, arr1[i] - 1);
        }

        System.out.println(count);
    }
}