import java.util.Scanner;

public class C_2070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int[] a = new int[n];
        int l = 0;
        int r = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            r = Math.max(r, a[i]);
        }
        int res = 0;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(isPos(mid, a, k, s)){
                res = mid;
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        System.out.println(res);
    }

    private static boolean isPos(int mid, int[] a, int k, String s) {
        int cnt = 0;
        char last = 'R';
        for(int i = 0; i < a.length; i++){
            if(a[i] > mid){
                if(s.charAt(i) == 'B' && last != 'B'){
                    cnt++;
                }
                last = s.charAt(i);
            }
        }
        return cnt <= k;
    }
}
