import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class E_61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
    static class Segment {
        long[] tree;
        int n;
        int[] arr;

        Segment(int n, int[] arr){
            this.n = n;
            tree = new long[4 * n];
            this.arr = arr;
            build(0, 0, n - 1);
        }

        private void build(int idx, int l, int r) {
            if(l == r){
                tree[idx] = arr[l];
                return;
            }
            int mid = (l + r) / 2;
            build(2 * idx + 1, l, mid);
            build(2 * idx + 2, mid + 1, r);
            tree[idx] = tree[2 * idx + 1] + tree[2 * idx + 2]; // we change logic here for MAX, MIN, GCD
        }

        public long query(int l, int r){
            return query(l, r, 0, 0, n - 1);
        }

        private long query(int l, int r, int idx, int st, int end){
            // no overlap
            if(r < st || l > end){
                return 0;
            }

            // complete overlap
            if(l <= st && r >= end){
                return tree[idx];
            }

            // partial overlap
            int mid = (st + end) / 2;
            long left = query(l, r, 2 * idx + 1, st, mid);
            long right = query(l, r, 2 * idx + 2, mid + 1, end);
            return left + right; // change according to question
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
            }
            else{
                point_Update(i, val, mid + 1, r, 2 * idx + 2);
            }
            tree[idx] = tree[2 * idx + 1] + tree[2 * idx +  2];
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] c = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            c[i] = a[i];
        }
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
        int max = -1;
        for(int i = 0; i < n; i++){
            max = Math.max(max, a[i]);
        }
        max++;
        int[] freq = new int[max];
        for(int i : a){
            freq[i]++;
        }
        Segment sg1 = new Segment(max, freq);
        Segment sg2 = new Segment(max, new int[max]);
        sg1.point_Update(a[0], -1);
        sg2.point_Update(a[0], 1);
        long count = 0;
        for(int i = 1; i < n - 1; i++){
            sg1.point_Update(a[i], -1);
            sg2.point_Update(a[i], 1);
            count += sg1.query(0, a[i] - 1) * sg2.query(a[i] + 1, max - 1);
        }
        System.out.println(count);
    }   
}
