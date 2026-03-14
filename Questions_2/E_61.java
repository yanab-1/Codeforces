import java.util.Scanner;

public class E_61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
    static class Segment {
        int[] tree;
        int n;
        int[] arr;

        Segment(int n, int[] arr){
            this.n = n;
            tree = new int[4 * n];
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

        public int query(int l, int r){
            return query(l, r, 0, 0, n - 1);
        }

        private int query(int l, int r, int idx, int st, int end){
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
            int left = query(l, r, 2 * idx + 1, st, mid);
            int right = query(l, r, 2 * idx + 2, mid + 1, end);
            return left + right; // change according to question
        }

        public void point_Update(int i, int val){
            point_Update(i, val, 0, n - 1, 0);
        }

        private void point_Update(int i, int val, int l, int r, int idx){
            if(l == r){
                tree[idx] = val;
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
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Segment sg = new Segment(n, a);
        
    }   
}
