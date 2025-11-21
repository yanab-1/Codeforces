import java.util.Scanner;

public class D_2171 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int[] suf = new int[n];
        suf[n - 1] = a[n - 1];
        for(int i = n - 2; i >= 0; i--){
            suf[i] = Math.max(suf[i + 1], a[i]);
        }
        int pre = Integer.MAX_VALUE;
        for(int i = 0; i < n - 1; i++){
            pre = Math.min(pre, a[i]);
            if(pre > suf[i + 1]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
