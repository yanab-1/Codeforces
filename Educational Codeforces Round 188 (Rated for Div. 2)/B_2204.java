import java.util.Scanner;

public class B_2204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] pre = new int[n + 1];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            pre[i + 1] = Math.max(pre[i], a[i]);
        }
        int op = 0;
        for(int i = n - 1; i >= 0; i--){
            if(a[i] >= pre[i]){
                op++;
            }
        }
        System.out.println(op);
    }
}
