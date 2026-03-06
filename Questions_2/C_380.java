import java.util.Scanner;

public class C_380 {
    static class Brackets{
        int full;
        int open;
        int close;
        Brackets(int full, int open, int close){
            this.full = full;
            this.open = open;
            this.close = close;
        }
    }
    static class SegmentTree{
        Brackets[] tree;
        int n;
        String s;
        SegmentTree(String s){
            n = s.length();
            tree = new Brackets[4 * n];
            this.s = s;
            build(0, 0, n - 1);
        }
        private void build(int idx, int l, int r) {
            if(l == r){
                tree[idx] = new Brackets(0, 0, 0);
                if(s.charAt(l) == '('){
                    tree[idx].open++;
                }
                else{
                    tree[idx].close++;
                }
                return;
            }
            int mid = (l + r) / 2;
            build(2 * idx + 1, l, mid);
            build(2 * idx + 2, mid + 1, r);
            tree[idx] = merge(tree[2 * idx + 1], tree[2 * idx + 2]);
        }
        private Brackets merge(Brackets left, Brackets right) {
            Brackets ans = new Brackets(0, 0, 0);
            ans.full = left.full + right.full + Math.min(left.open, right.close);
            ans.open = left.open + right.open - Math.min(left.open, right.close);
            ans.close = left.close + right.close - Math.min(left.open, right.close);
            return ans;
        }
        private Brackets query(int l , int r){
            return query(l, r, 0, 0, n - 1);
        }
        private Brackets query(int l, int r, int idx, int st, int end) {
            // no overlap 
            if(r < st || l > end){
                return new Brackets(0, 0, 0);
            }
            // complete overlap
            if(l <= st && end <= r){
                return tree[idx];
            }
            // partial overlap
            int mid = (st + end) / 2;
            Brackets left = query(l, r, 2 * idx + 1, st, mid);
            Brackets right = query(l, r, 2 * idx + 2, mid + 1, end);
            return merge(left, right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        String s = sc.next();
        int q = sc.nextInt();
        SegmentTree sg = new SegmentTree(s);
        while(q-- > 0){
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            System.out.println(2 * sg.query(l, r).full);
        }
    }
}
