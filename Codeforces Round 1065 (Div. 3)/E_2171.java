import java.util.Scanner;

public class E_2171 {
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
        int[] pre = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if(i == 0) pre[i] = a[i];
            else{
                pre[i] = Math.min(pre[i - 1], a[i]);
            }
        }
        int[] suf = new int[n];
        int[] ind = new int[n];
        suf[n - 1] = a[n - 1];
        ind[n - 1] = n - 1;
        for(int i = n - 2; i >= 0; i--){
            if(suf[i + 1] < a[i]){
                suf[i] = a[i];
                ind[i] = i;
            }
            else{
                suf[i] = suf[i + 1];
                ind[i] = ind[i + 1];
            }
        }
        for(int i = 0; i < n - 1; i++){
            if(pre[i] > suf[i + 1]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        int l = 0;
        while(l < n){
            int r = ind[l];
            for(int i = l; i < r; i++){
                System.out.println(a[i] + " " + a[r]);
            }
            if(l > 0){
                System.out.println(pre[l - 1] + " " + a[r]);
            }
            l = r + 1;
        }
    }

}
