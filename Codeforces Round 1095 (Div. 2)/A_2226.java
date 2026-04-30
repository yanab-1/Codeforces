import java.util.Scanner;

public class A_2226 {

    static int MOD = 676767677;

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
        long ans = 0;
        long c = 0;
        boolean ok = false;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            ans = (ans + a[i]) % MOD;
            if(a[i] == 1) c++;
            else{
                ok = true;
            }
        }
        if(!ok){
            System.out.println(1);
        }else{
            if(a[n - 1] == 1){
                System.out.println(ans - c + 1);
            }else{
                System.out.println(ans - c);
            }
        }
    }
}
