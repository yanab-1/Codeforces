import java.util.Arrays;
import java.util.Scanner;

public class E_2167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int l = 0;
        int r = x;
        int[] res = new int[k];
        while(l <= r){
            int mid = l + (r - l) / 2;
            int[] can = isPossible(a, k, x, mid);
            if(can[k - 1] != -1){
                res = can;
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        for(int i = 0; i < k; i++){
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }

    private static int[] isPossible(int[] a, int k, int x, int mid){
        int n = a.length;
        int[] res = new int[k];
        Arrays.fill(res, -1);
        int idx = 0;
        int st = 0;
        int end = a[0] - mid;
        while (idx < k && st <= end) {
            if(idx == 0 || st != res[idx- 1])
            res[idx++] = st;
            st++;
        }
        for(int i = 1; i < n; i++){
            st = a[i - 1] + mid;
            end = a[i] - mid;
            while(idx < k && st <= end){
                if(idx == 0 || st != res[idx- 1])
                res[idx++] = st;
                st++;
            }
            if(idx == k) return res;
        }
        st = a[n - 1] + mid;
        end = x;
        while(idx < k && st <= end){
            if(idx == 0 || st != res[idx- 1])
            res[idx++] = st;
            st++;
        }
        return res;
    }
}
