import java.util.Scanner;

public class E_2131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        if(a[n-1]!= b[n-1]) {
            System.out.println("NO");
            return;
        }
        for(int i=n-2;i>=0;i--){
            if(!(a[i] == b[i] || (a[i]^a[i+1])==b[i] || (a[i]^b[i+1])==b[i])){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
