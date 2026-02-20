import java.util.Scanner;

public class D_339 {
    static class Segment {
        int[] tree;
        int n;
        int[] arr;
        int len;

        Segment(int n, int[] arr){
            this.n = (int) Math.pow(2, n);
            tree = new int[4 * this.n];
            this.arr = arr;
            len = n;
            if(len % 2 != 0){
                build(0, 0, this.n - 1, true);
            }
            else{
                build(0, 0, this.n - 1, false);
            }
        }

        private void build(int idx, int l, int r, boolean orr) {
            if(l == r){
                tree[idx] = arr[l];
                return;
            }
            int mid = (l + r) / 2;
            build(2 * idx + 1, l, mid, !orr);
            build(2 * idx + 2, mid + 1, r, !orr);
            if(orr){
                tree[idx] = tree[2 * idx + 1] | tree[2 * idx + 2]; 
            }
            else{
                tree[idx] = tree[2 * idx + 1] ^ tree[2 * idx + 2]; 
            }
        }

        public int query(){
            return tree[0];
        }

        public void point_Update(int i, int val){
            boolean orr = false;
            if(len % 2 != 0) orr = true;
            point_Update(i, val, 0, n - 1, 0, orr);
        }

        private void point_Update(int i, int val, int l, int r, int idx, boolean orr){
            if(l == r){
                tree[idx] = val;
                return;
            } 
            int mid = (l + r) / 2;
            if(i <= mid){
                point_Update(i, val, l, mid, 2 * idx + 1, !orr);
            }
            else{
                point_Update(i, val, mid + 1, r, 2 * idx + 2, !orr);
            }
            if(orr){
                tree[idx] = tree[2 * idx + 1] | tree[2 * idx + 2]; 
            }
            else{
                tree[idx] = tree[2 * idx + 1] ^ tree[2 * idx + 2]; 
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int len = (int) Math.pow(2, n);
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        Segment sg = new Segment(n, arr);
        while(m-- > 0){
            int p = sc.nextInt();
            int b = sc.nextInt();
            sg.point_Update(p - 1, b);
            System.out.println(sg.query());
        }
    }
}
