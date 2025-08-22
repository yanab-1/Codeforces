import java.util.Scanner;

public class A_2131 {
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
        int ans=0;
        for(int i=0;i<n;i++){
            if(a[i]>b[i]){
                ans+= a[i] - b[i];
            }
        }
        System.out.println(ans+1);
    }
}
